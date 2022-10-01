package com.example.demo1.main;

import com.example.demo1.data.Address;
import com.example.demo1.data.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Address address = new Address(12, "MG Road", "XYZ", "India", 462302);
        Employee employee = new Employee("vaibhav", 38, "05/1/1983", address);
        

    }
}
