package com.example.welink.MODEL;

public class User {
    String age;
    String email;
    String gender;
    String image;
    String name;
    String occupation;
    String password;
    String phone;

    public User(String age, String email, String gender, String image, String name, String occupation, String password, String phone) {
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.image = image;
        this.name = name;
        this.occupation = occupation;
        this.password = password;
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
