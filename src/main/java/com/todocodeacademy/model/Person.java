/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.model;

/**
 *
 * @author Sergio Rolon
 */
public class Person {
    private String firsName;
    private String lastName;
    private String direction;
    private String role;
    private String password;

    public Person() {
    }

    public Person(String firsName, String lastName, String direction, String role, String password) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.direction = direction;
        this.role = role;
        this.password = password;
    }



    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDirection() {
        return direction;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }


    
    
    
}
