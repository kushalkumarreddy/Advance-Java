
package com.hospital;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Patient {

    // Primitive Type Properties
    private int patientId;
    private String patientName;
    private int age;
    private String phoneNumber;

    // Reference Type Property
    private Doctor doctor;

    // Collection Type Properties
    private List<String> medicines;
    private Set<String> medicalTests;
    private Map<String, Integer> testFees;

    // Getters and Setters

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    public Set<String> getMedicalTests() {
        return medicalTests;
    }

    public void setMedicalTests(Set<String> medicalTests) {
        this.medicalTests = medicalTests;
    }

    public Map<String, Integer> getTestFees() {
        return testFees;
    }

    public void setTestFees(Map<String, Integer> testFees) {
        this.testFees = testFees;
    }

}
