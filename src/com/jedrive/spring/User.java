/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jedrive.spring;


/**
 *
 * @author Dan
 */

public class User{

    private String name;
    private String address;
    private int salary;
    private int deduction;
    private int bouns;

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    public int getSalary() {
        return salary;
    }

    public User(String name, String address, int salary, int deduction, int bouns) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.deduction = deduction;
        this.bouns = bouns;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {
        System.out.println("From user Defult");
    }

    public User(String name) {
        System.out.println("from name is user");
    }

    public User(String name, String address) {
  
        this.name = name;
        this.address = address;
        System.out.println("From user All");
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", address=" + address + ", salary=" + salary + ", deduction=" + deduction + ", bouns=" + bouns + '}';
    }

}
