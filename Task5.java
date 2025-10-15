
class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void displayInfo() {
        System.out.println("Name  : " + name + ", Age:   " + age);
    }
}


class Employee extends Person {
    String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    void displayInfo() {
        System.out.println("Employee Name: " + name + ", Age: " + age + ", Company: " + company);
    }
}


class Manager extends Employee {
    String department;

    Manager(String name, int age, String company, String department) {
        super(name, age, company);
        this.department = department;
    }

    
    void manage() {
        System.out.println(name + " is managing   the " + department + "   department.");
    }
}


class Student extends Person {
    String school;

    Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    
    @Override
    void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age + ", School: " + school);
    }
}

public class Task5 {
    public static void main(String[] args) {
        
        Person person = new Person("Alice", 30);
        Employee employee = new Employee("Bob", 28, "ABC Corp");
        Manager manager = new Manager("Charlie", 35, "XYZ Inc", "Sales");
        Student student = new Student("David", 20, "High School");

        
        System.out.println("=== Person ===");
        person.displayInfo();

        System.out.println("\n=== Employee (Single Inheritance) ===");
        employee.displayInfo();

        System.out.println("\n=== Manager (Multilevel Inheritance) ===");
        manager.displayInfo();
        manager.manage();

        System.out.println("\n=== Student (Hierarchical Inheritance) ===");
        student.displayInfo();
    }
}