package com.example.demo.beeproject;

public class PriceGrade {
    private int id;

    private String grade;
    private double price;

    public PriceGrade() {
    }

    public PriceGrade(String grade, double price) {
        this.grade = grade;
        this.price = price;
    }

    public PriceGrade(int id, String grade, double price) {
        this.id = id;
        this.grade = grade;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
