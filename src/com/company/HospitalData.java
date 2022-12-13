package com.company;

import java.util.ArrayList;

public class HospitalData {
    ArrayList<String> departments = new ArrayList<>();
    ArrayList<String> doctors = new ArrayList<>();

    public void addDepartments(String departments){
        this.departments.add(departments);
    }

    public ArrayList<String> getDepartments() {
        return departments;
    }

    public void addDoctors(String doctors){
        this.doctors.add(doctors);
    }

    public ArrayList<String> getDoctors() {
        return doctors;
    }
}
