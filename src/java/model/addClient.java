/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ishmam
 */
public class addClient {
    int id;
    String name;
    String gender;
    int phone;
    String address;
    String house_no;

    public addClient(String name,String gender, int phone, String address, String house_no) {
        
        this.name = name;
        this.gender= gender;
        this.phone = phone;
        this.address = address;
        this.house_no = house_no;
    }
    public addClient(int id, String name,String gender, int phone, String address, String house_no) {
        this.id=id;
        this.name = name;
        this.gender= gender;
        this.phone = phone;
        this.address = address;
        this.house_no = house_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }
    
    
    
}
