package com.hospital;

import java.util.List;
import com.hospital.departments.Department;

public class hospital {
    private String name;
    private String location;
    private List<Department> departments;

    public hospital(String name, String location, List<Department> departments) {
        this.name = name;
        this.location = location;
        this.departments = departments;
    }

    public void printDepartments() {
        System.out.println("hospital: " + name);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println("- " + d.getInfo());
        }
    }
}