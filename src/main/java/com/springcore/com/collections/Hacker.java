package com.springcore.com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hacker {
    private int id;
    private List<String> devices;
    private Set<String> addresses;
    private Map<String, String> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getDevices() {
        return devices;
    }

    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Hacker() {
        super();
    }

    public Hacker(int id, List<String> devices, Set<String> addresses, Map<String, String> courses) {
        this.id = id;
        this.devices = devices;
        this.addresses = addresses;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Hacker{" +
                "id=" + id +
                ", devices=" + devices +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }
}
