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
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array untuk menyimpan objek Person
        ArrayList<Person> people = new ArrayList<>();

        // Membuat objek Employee dan Manager
        Employee emp1 = new Employee("Alice", 30, 50000);
        Manager mgr1 = new Manager("Bob", 40, 70000, "IT");

        // Menambahkan objek ke dalam array
        people.add(emp1);
        people.add(mgr1);

        // Menampilkan informasi dari semua objek di dalam array
        for (Person person : people) {
            person.displayInfo();
            System.out.println();
        }

        // Penanganan kesalahan (Error Handling)
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name: ");
            String name = reader.readLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(reader.readLine());

            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(reader.readLine());

            System.out.print("Enter department: ");
            String department = reader.readLine();

            // Membuat objek Manager dengan data yang diinput
            Manager newManager = new Manager(name, age, salary, department);
            people.add(newManager);

            // Menampilkan informasi Manager baru
            System.out.println("New Manager added:");
            newManager.displayInfo();
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}

