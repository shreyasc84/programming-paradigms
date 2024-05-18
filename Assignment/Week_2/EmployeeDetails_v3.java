// Initializing the class using reference variables 

class Employee{
    // Employee details
    String ename;
    int eid;
    String department;
    
    // Method to diplay employee details
    public void printInfo(){
        System.out.println("Employee's name:"+ename);
        System.out.println("Employee's id:"+eid);
        System.out.println("Employee's department:"+department);
    }
}

// Main method
public class EmployeeDetails_v3{
    public static void main(String[] args){

        Employee e = new Employee();
        // Refernce Variables to initialize Employee details
        e.ename = "Shreyas";
        e.eid = 34;
        e.department = "Web development";

        // To print employee details
        e.printInfo();
    }
}
