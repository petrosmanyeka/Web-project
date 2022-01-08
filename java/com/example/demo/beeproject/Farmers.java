package com.example.demo.beeproject;

public class Farmers {
    private int id;
    private String f_Name;
    private String l_name;
    private String gender;
    private String Email;
    private String country;
    private String phoneNumber;

    public Farmers() {
    }

    public Farmers(String f_Name, String l_name, String gender, String email, String country, String phoneNumber) {
        this.f_Name = f_Name;
        this.l_name = l_name;
        this.gender = gender;
        Email = email;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public Farmers(int id, String f_Name, String l_name, String gender, String email, String country, String phoneNumber) {
        this.id = id;
        this.f_Name = f_Name;
        this.l_name = l_name;
        this.gender = gender;
        Email = email;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_Name() {
        return f_Name;
    }

    public void setF_Name(String f_Name) {
        this.f_Name = f_Name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Farmers{" +
                "id=" + id +
                ", f_Name='" + f_Name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", gender='" + gender + '\'' +
                ", Email='" + Email + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
