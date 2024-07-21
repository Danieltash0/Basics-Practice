// Employee.java
public class Employee {
    // Properties
    private int age;
    private double salary;
    private String name;
    private String designation;
  
    // Constructor
    public Employee(int age, double salary, String name, String designation) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
    }
  
    // Methods to set and access (get) all the above properties
    public int getAge() {
        return age;
    }
  
    public void setAge(int age) {
        this.age = age;
    }
  
    public double getSalary() {
        return salary;
    }
  
    public void setSalary(double salary) {
        this.salary = salary;
    }
  
    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public String getDesignation() {
        return designation;
    }
  
    public void setDesignation(String designation) {
        this.designation = designation;
    }
  
    // Method to print all the above properties at once
    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
  }

// Main.java
public class Main {
  public static void main(String[] args) {
      // Create one instance of the Employee class and make use of the available methods
      Employee emp = new Employee(30, 50000, "John Doe", "Software Engineer");

      // Print employee details
      emp.printEmployeeDetails();

      // Update and access individual properties
      emp.setAge(31);
      System.out.println("Updated Age: " + emp.getAge());

      emp.setSalary(55000);
      System.out.println("Updated Salary: " + emp.getSalary());

      emp.setName("Jane Doe");
      System.out.println("Updated Name: " + emp.getName());

      emp.setDesignation("Senior Software Engineer");
      System.out.println("Updated Designation: " + emp.getDesignation());

      // Print updated employee details
      emp.printEmployeeDetails();
  }
}
