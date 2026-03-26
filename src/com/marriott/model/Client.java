/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marriott.model;

/**
 *
 * @author Janaurio Henrique
 */
public class Client {
    private String nationalId;
    private String names;
    private String phoneNumber;
    private String email;
    private int age;

    public Client() {
    }

    public Client(String nationalId, String names, String phoneNumber, String email, int age) {
        this.nationalId = nationalId;
        this.names = names;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
