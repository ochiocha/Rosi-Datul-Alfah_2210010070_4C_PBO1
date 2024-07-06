# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data karyawan menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan umur karyawan, dan memberikan output berupa informasi detail dari umur tersebut seperti tahun masuk, departemen, posisi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Person`, `Employee`, `Manager`, dan `Main` adalah contoh dari class.

```bash
public class Person {
    ...
}

public class Employee extends Person {
    ...
}

public class Manager extends Employee {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, employees[i] = new Manager(name, age); adalah contoh pembuatan object.
   
```bash
employees[i] = new Manager(name, age);

```

3. **Atribut** adalah ariabel yang ada dalam class. Pada kode ini, name dan age adalah contoh atribut.
   
```bash
private String name;
private int age;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Person, Employee, dan Manager.
   
```bash
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}

public Employee(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;  
}

public Manager(String name, int age, double salary, String department) {
    super(name, age);
    this.department = department;
}

```

5. **Mutator** atau  setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setName dan setAge adalah contoh method mutator.
   
```bash
public void setName(String name) {
    this.name = name;
}

public void setAge(int age) {
    this.age = age;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getName, getAge, getSalary, dan getDepartment adalah contoh method accessor.
7. 
```bash
public String getName() {
    return name;
}

public int getAge() {
    return age;
}

```

7. **Encapsulation** adalahkonsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut name dan age dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String name;
private int age;

```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, Employee mewarisi Person dengan sintaks extends.
```bash
public class Employee extends Person {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method displayInfo(String) di Employee merupakan overloading method displayInfo dan displayInfo di Employee merupakan override dari method displayInfo di Person.
```bash
public String displayInfo(String department) {
    return displayInfo() + "\nDepartment: " + department;
}

@Override
public String displayInfo() {
    ...
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getBonus dan seleksi switch dalam method getAllowance.

```bash
public void giveBonus() {
    if (salary > 60000) {
        salary += 5000; // Menambahkan bonus
        System.out.println("Bonus diberikan! Gaji baru: " + salary);
    } else {
        System.out.println("Gaji kurang dari 60000, tidak mendapatkan bonus.");
    }
}

public void giveAllowance() {
    if (department.equalsIgnoreCase("IT")) {
        setSalary(getSalary() + 10000); // Menambahkan tunjangan
        System.out.println("Tunjangan diberikan! Gaji baru: " + getSalary());
    } else {
        System.out.println("Departemen tidak memenuhi syarat untuk tunjangan.");
    }
}


```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Person person : people) {
    person.displayInfo();
    System.out.println();
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ArrayList<Person> people = new ArrayList<>(); adalah contoh penggunaan array.

```bash
ArrayList<Person> people = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
 } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
 } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Rosi Datul Alfah
NPM: 2210010070
