package com.example.pietsinglefbdata;

public class DBHolder {
    String name;
    String years;
    String education;

    public DBHolder(String name, String years, String education) {
        this.name = name;
        this.years = years;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
