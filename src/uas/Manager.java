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
public class Manager extends Employee {
    // Atribut tambahan
    private String department;

    // Konstruktor
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary); // Memanggil konstruktor dari superclass (Employee)
        this.department = department;
    }

    // Accessor dan Mutator untuk department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override method displayInfo dari Employee
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil method displayInfo dari superclass
        System.out.println("Department: " + department);
    }
}

