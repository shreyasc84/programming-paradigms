// Initializing the class using method

class Employee{
    // Employee details
    String ename;
    int eid;
    String department;

    // Method to initialize employee details
    public void insertEmployee(String n, int id, String dep){
        this.ename = n;
        this.eid = id;
        this.department = dep;
    }

    // Method to diplay employee details
    public void printInfo(){
        System.out.println("Employee's name:"+ename);
        System.out.println("Employee's id:"+eid);
        System.out.println("Employee's department:"+department);
    }

}

// Main method
public class EmployeeDetails_v2 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.insertEmployee("Shreyas", 34,"Web development");

        // To print employee details
        em.printInfo();
    }
}

