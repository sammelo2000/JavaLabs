package oopLab;
/*
* Name : Samuel Williams
* Student ID : 21001277
* Course : Computer Science */


// Car class  f or Car objects
public class Car {
    // Attributes of a car
    private String make = "";
    private String model = "";
    private int mileage = 0;
    private String color = "";
    private boolean insured = false;

    // Default Constructor with default instance variable values
    Car () {
        this.make = "";
        this.model = "";
        this.mileage = 0;
        this.color = "";
        this.insured = false;
    }
 // Parameterized Constructor for arguments to be passed through
    Car (String mk, String md, int mil, String col, boolean ins) {
        this.make = mk;
        this.model = md;
        this.mileage = mil;
        this.color = col;
        this.insured = ins;
    }

    // toString method to display details about the object
    public String toString() {
        String str = " Car Make : " + this.make + "\n" +
                "Car Model: " + this.model + "\n" +
                " Mileage : " + this.mileage + " km" +  "\n" +
                " Color : " + this.color + "\n" +
                " Insured : " + this.insured;
        return str;
    }

    //getter to return i=attribute value
    public String getMake() {
        return make;
    }
    //setter to set attribute value
    public void setMake(String make) {
        this.make = make;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
