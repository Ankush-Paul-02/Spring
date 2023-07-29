package com.springcore;

public class Developer {
    private int id;
    private String name;
    private String skill;

    public Developer() {
        super();
    }

    public Developer(int id, String name, String skill) {
        this.id = id;
        this.name = name;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Developer{" + "id=" + id + ", name='" + name + '\'' + ", skill='" + skill + '\'' + '}';
    }
}
