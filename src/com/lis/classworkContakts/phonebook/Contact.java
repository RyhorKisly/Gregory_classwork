package com.lis.phonebook;

import java.util.Set;

public class Contact {
    private String name;
    private Set<String> workNumbers;
    private Set<String> personalNumbers;

    public Contact(String name,
                   Set<String> workNumbers,
                   Set<String> personalNumbers) {
        this.name = name;
        this.workNumbers = workNumbers;
        this.personalNumbers = personalNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<String> getWorkNumbers() {
        return workNumbers;
    }

    public Set<String> getPersonalNumbers() {
        return personalNumbers;
    }
}
