/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Suppliers;

/**
 *
 * @author admin
 */
public class DAO extends DBContext {

    public List<Suppliers> getAll() {
        List<Suppliers> list = new ArrayList<>();
        String spl = "select * from Suppliers";
        try {
            PreparedStatement st = connection.prepareStatement(spl);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String gender;
                if (rs.getInt("Gender") == 1) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                Suppliers s = new Suppliers(rs.getString("SupplierID"), rs.getString("SupplierName"), rs.getString("BirthDate"), gender, rs.getString("Address"));
                list.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Suppliers> searchByName(String key) {
        List<Suppliers> list = new ArrayList<>();
        String spl = "SELECT * FROM [dbo].[Suppliers] where 1 = 1";
        if (key != null && !key.equals("")) {
            spl += " and SupplierName like '%" + key + "%'";
        }
        try {
            PreparedStatement st = connection.prepareStatement(spl);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String gender;
                Suppliers p = new Suppliers();
                p.setId(rs.getString("SupplierID"));
                p.setName(rs.getString("SupplierName"));
                p.setDate(rs.getString("BirthDate"));
                if (rs.getInt("Gender") == 1) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                p.setGender(gender);
                p.setAddress(rs.getString("Address"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public List<Suppliers> searchByYear(int year) {
        List<Suppliers> list = new ArrayList<>();
        String spl = "SELECT * FROM [dbo].[Suppliers] where 1 = 1";
        if (year != 0) {
            spl += " and YEAR([BirthDate]) = " + year;
        }   
        try {
            PreparedStatement st = connection.prepareStatement(spl);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String gender;
                Suppliers p = new Suppliers();
                p.setId(rs.getString("SupplierID"));
                p.setName(rs.getString("SupplierName"));
                p.setDate(rs.getString("BirthDate"));
                if (rs.getInt("Gender") == 1) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                p.setGender(gender);
                p.setAddress(rs.getString("Address"));
                list.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public void delete(String id) {
        String spl = "DELETE FROM [dbo].[Suppliers]\n"
                + "      WHERE SupplierID=?";
        try {
            PreparedStatement st = connection.prepareStatement(spl);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
