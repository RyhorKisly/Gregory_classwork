package com.lis.classworkContakts.phonebook;

import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Contact> contacts;
    private Map<String, FavoriteContact> favoriteContacts;

    public PhoneBook(Map<String, Contact> contacts,
                     Map<String, FavoriteContact> favoriteContacts) {
        this.contacts = contacts;
        this.favoriteContacts = favoriteContacts;
    }

    public void changeName(String newName, Contact contact) {
        if (newName == null || contact == null) {
            throw new IllegalArgumentException("Name or contact is null");
        }
        contact.setName(newName);
    }

    public boolean deleteNumber(String number, Contact contact, NumberType type) {
        if (number == null || contact == null || type == null) {
            throw new IllegalArgumentException("Number or contact or Type is null");
        }
        if (type == NumberType.PERSONAL) {
            return contact.getPersonalNumbers().remove(number);
        } else {
            return contact.getWorkNumbers().remove(number);
        }
    }

    public void addNumber(String number, Contact contact, NumberType type) {
        if (number == null || contact == null || type == null) {
            throw new IllegalArgumentException("Number or contact or Type is null");
        }
        if (type == NumberType.PERSONAL) {
            addNumber(
                    contact.getWorkNumbers(),
                    contact.getPersonalNumbers(),
                    number,
                    "Passed number used as work number."
            );
        } else {
            addNumber(
                    contact.getPersonalNumbers(),
                    contact.getWorkNumbers(),
                    number,
                    "Passed number used as personal number."
            );
        }
    }

    private void addNumber(Set<String> settToCheck,
                           Set<String> settToAdd,
                           String number,
                           String message) {
        if (settToCheck.contains(number)) {
            throw new DuplicateNumberException(message);
        }
        boolean result = settToAdd.add(number);
        if (!result) {
            throw new DuplicateNumberException("Passed number already exist.");
        }
    }

    public void changeNumber(String number, Contact contact, NumberType type) {
        if (number == null || contact == null || type == null) {
            throw new IllegalArgumentException("Number or contact or Type is null");
        }
        boolean deleteResult = deleteNumber(number, contact, type);
        if (deleteResult) {
            addNumber(number, contact, type);
        } else {
            throw new NumberNotFoundException("Passed number " + number + " not found");
        }
    }

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact is null");
        }
        String name = contact.getName();
        if (contact instanceof FavoriteContact) {
            if (validateContact(favoriteContacts, name)) {
                favoriteContacts.put(name, (FavoriteContact) contact);
            }
        }
        if (validateContact(contacts, name)) {
            contacts.put(name, contact);
        }
    }

    private boolean validateContact(Map<String, ? extends Contact> map, String name) {
        if (map.containsKey(name)) {
            throw new DuplicateContactException("Duplicate number passed.");
        }
        return true;
    }

    public void deleteContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact is null");
        }
        String name = contact.getName();
        if (name == null) {
            throw new IllegalArgumentException("Contact name is null");
        }
        if (contact instanceof FavoriteContact) {
            deleteContact(favoriteContacts, name);
            return;
        }
        deleteContact(contacts, name);
    }

    private boolean deleteContact(Map<String, ? extends Contact> map, String name) {
        Contact contact = map.remove(name);
        if (contact == null) {
            throw new ContactNotFoundException("Contact not found.");
        }
        return true;
    }

    public void addToFavorite(Contact contact, byte fastCallDigit) {
        if (contact == null || (fastCallDigit >= 0 && fastCallDigit <= 9)) {
            throw new IllegalArgumentException(
                    "Contact is null of fastCallDigit not valid"
            );
        }
        FavoriteContact favoriteContact = new FavoriteContact(
                contact,
                fastCallDigit
        );
        addContact(favoriteContact);
    }

    public boolean removeFromFavorite(FavoriteContact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact is null");
        }
        String name = contact.getName();
        if (name == null) {
            throw new IllegalArgumentException("Contact name is null");
        }
        return deleteContact(favoriteContacts, name);
    }

}
