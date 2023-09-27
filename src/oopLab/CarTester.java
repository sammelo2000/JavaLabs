package oopLab;

/*
 * Name : Samuel Williams
 * Student ID : 21001277
 * Course : Computer Science */

//Tester class to test object
public class CarTester {
    public static void main(String[] args) {
        // Car object being  created using the default constructor
        Car benz = new Car();
        //setters being invoked to assign values to instance variables
        benz.setMake("Mercedes");
        benz.setModel("Gle Coupe");
        benz.setMileage(12000);
        benz.setColor("Sky Blue");
        benz.setInsured(true);
        //toString method being invoked to display details about the car object
        System.out.println(benz.toString());

        System.out.println("-------------------");
        // car object being created using the parameterised constructor
        Car benz1 = new Car("Mercedes", "Cle Coupe",15000, " Red ",true);

        System.out.println(benz1.toString());
    }
}
