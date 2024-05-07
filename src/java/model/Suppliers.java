/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Suppliers {
//    [SupplierID] [nvarchar](10) NOT NULL primary key,
//	[SupplierName] [nvarchar](30) NOT NULL,
//	[BirthDate] datetime not NULL,
//	[Gender] [bit] NULL,
//	[Address] [nvarchar](50) NULL
    private String id;
    private String name;
    private String date;
    private String gender;
    private String address;

    public Suppliers() {
    }

    public Suppliers(String id, String name, String date, String gender, String address) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
