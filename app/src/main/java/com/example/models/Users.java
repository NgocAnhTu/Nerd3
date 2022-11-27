package com.example.models;

public class Users {
    private Integer ID;
    private String Username;
    private String Password;
    private String Fullname;
    private Integer Phone;
    private String Email;
    private Integer Birth;
    private byte[] Photo;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getBirth() {
        return Birth;
    }

    public void setBirth(Integer birth) {
        Birth = birth;
    }

    public byte[] getPhoto() {
        return Photo;
    }

    public void setPhoto(byte[] photo) {
        Photo = photo;
    }

    public Users(Integer ID, String username, String password, String fullname, Integer phone, String email, Integer birth, byte[] photo) {
        this.ID = ID;
        Username = username;
        Password = password;
        Fullname = fullname;
        Phone = phone;
        Email = email;
        Birth = birth;
        Photo = photo;
    }
}
