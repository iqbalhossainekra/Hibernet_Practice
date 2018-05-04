/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbstu.myprac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author IQBAL HOSSAIN EKRA
 */
@Entity
@Table(name = "practice")
public class Practice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String roll;
    private String Name;
    private String Dept;
    private String city;
    private String cgpa;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }


    public String getCgpa() {
        return cgpa;
    }

    public void setCgpa(String cgpa) {
        this.cgpa = cgpa;
    }
    
    
}
