package com.lis.phonebook;

import java.util.Set;

public class FavoriteContact extends Contact {
    private Byte fastCallDigit;

    public FavoriteContact(String name,
                           Set<String> workNumbers,
                           Set<String> personalNumbers,
                           Byte fastCallDigit) {
        super(name, workNumbers, personalNumbers);
        this.fastCallDigit = fastCallDigit;
    }

    public FavoriteContact(Contact contact, Byte fastCallDigit) {
        super(
                contact.getName(),
                contact.getWorkNumbers(),
                contact.getPersonalNumbers()
        );
        this.fastCallDigit = fastCallDigit;
    }

    public byte getFastCallDigit() {
        return fastCallDigit;
    }
}
