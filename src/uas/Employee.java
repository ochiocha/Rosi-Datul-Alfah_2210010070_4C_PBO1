/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author User
 */
public class Employee extends Person {
    // Atribut tambahan
    private double salary;

    // Konstruktor
    public Employee(String name, int age, double salary) {
        super(name, age); // Memanggil konstruktor dari superclass (Person)
        this.salary = salary;
    }

    // Accessor dan Mutator untuk salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override method displayInfo dari Person
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Salary: " + salary);
    }
}

