package com.example.demo1.main;

//import com.example.demo1.data.Address;
//import com.example.demo1.data.Employee;
import com.example.demo1.data.*;
public class EmployeeMain {
    public static void main(String[] args) {
        Address address = new Address(12, "MG Road", "XYZ", "India", 462302);
        Employee employee = new Employee("vaibhav", 19, "01/01/2001", address);


    }
}
