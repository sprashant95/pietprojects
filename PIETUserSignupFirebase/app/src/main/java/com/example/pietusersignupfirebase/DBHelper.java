package com.example.pietusersignupfirebase;

public class DBHelper {

    String image;
    String name, education;

    public DBHelper(String image, String name, String education) {
        this.image = image;
        this.name = name;
        this.education = education;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
