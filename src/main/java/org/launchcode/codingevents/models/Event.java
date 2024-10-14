package org.launchcode.codingevents.models;

public class Event {
    private String name;
    private String descripton;

    public Event(String name, String descripton) {
        this.name = name;
        this.descripton = descripton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

}
