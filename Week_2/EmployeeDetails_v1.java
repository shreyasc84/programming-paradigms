// Initializing the class using constructor

class Employee{
    // Employee details
    private String ename;
    private int eid;
    private String department;

    // Constructor to initialize employee details
    public Employee(String ename, int eid, String department){
        this.ename = ename;
        this.eid = eid;
        this.department = department;
    }

    // Method to diplay employee details
    public void printInfo(){
        System.out.println("Employee's name:"+ename);
        System.out.println("Employee's id:"+eid);
        System.out.println("Employee's department:"+department);

    }
}

// Main method
public class EmployeeDetails_v1 {
    public static void main(String[] args) {
        Employee em = new Employee("Shreyas",34,"Web development");

        // To print employee details
        em.printInfo();
    }
}

