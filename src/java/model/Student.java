/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Student {
    private String code;
    private String name;
    private int carriages;
    private int x;
    public Student() {
    }

    public Student(String code, String name, int carriages) {
        this.code = code;
        this.name = name;
        this.carriages = carriages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCarriages() {
        return carriages;
    }

    public void setCarriages(int carriages) {
        this.carriages = carriages;
    }
    
}
