/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import model.HocVien;
import java.util.*;
import java.sql.*;
import java.util.logging.*;


public class HocVienDaompl implements HocVienDao{
    
    @Override
    public List<HocVien> getList() {
        Connection connection = ConnectionJtdc.connectionJDBC();
        String sql = "select * from hoc_vien";
        List<HocVien> list = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HocVien hocVien = new HocVien();
                hocVien.setMa_hoc_vien(rs.getInt("ma_hoc_vien"));
                hocVien.setHo_ten(rs.getString("ho_ten"));
                hocVien.setNgay_sinh(rs.getDate("ngay_sinh"));
                hocVien.setSo_dien_thoai(rs.getString("so_dien_thoai"));
                hocVien.setGioi_tinh(rs.getBoolean("gioi_tinh"));
                hocVien.setDia_chi(rs.getString("dia_chi"));
                hocVien.setTinh_trang(rs.getBoolean("tinh_trang"));
                list.add(hocVien);
                
            }
            ps.close();
            rs.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        HocVienDao hocVienDao = new HocVienDaompl();
        System.out.println(hocVienDao.getList());
    }
}
