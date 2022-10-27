/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import java.sql.*;
import model.ChucVu;
import model.CuaHang;
import model.DangNhap_NhanVien;
import unility.JDBC_Helper;

/**
 *
 * @author ACER
 */
public class NhanVien_Repository {
    public static List<NhanVien> getAllNhanVien(){
        List<NhanVien> listNV = new ArrayList<>();
        ResultSet rs;
        String sql = "select NhanVien.ma, NhanVien.ten, tenDem, ho, gioiTinh, ngaySinh, NhanVien.diaChi, sdt, trangThai,email, CuaHang.ma, CuaHang.ten, cuaHang.diaChi, CuaHang.thanhPho, CuaHang.quocGia, ChucVu.ma, ChucVu.Ten from NhanVien inner join CuaHang on NhanVien.idCH=CuaHang.id inner join ChucVu on NhanVien.idCV=ChucVu.id";
        rs = JDBC_Helper.selectTongQuat(sql);
        
        try {
            while(rs.next()){
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                String tenDem = rs.getString(3);
                String ho = rs.getString(4);
                String gioiTinh = rs.getString(5);
                String ngaySinh = rs.getString(6);
                String diaChi = rs.getString(7);
                String sdt = rs.getString(8);
                int trangThai = rs.getInt(9);
                String email = rs.getString(10);
                String mach = rs.getString(11);
                String tenCH = rs.getString(12);
                String diaChiCH = rs.getString(13);
                String thanhPho = rs.getString(14);
                String quocGia = rs.getString(15);
                String maCV = rs.getString(16);
                String tenCV = rs.getString(17);
                CuaHang ch = new CuaHang(mach, tenCH, diaChiCH, thanhPho, quocGia);
                ChucVu cv = new ChucVu(maCV, tenCV);
                NhanVien nv = new NhanVien(ma, ten, tenDem, ho, gioiTinh, ngaySinh, diaChi, sdt, ch, cv, trangThai, email);
                listNV.add(nv);
            }
            return listNV;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean DangNhapNhanVien(String mail, String pass){
        ResultSet rs;
        DangNhap_NhanVien nv = null;
        String sql = "select email, matKhau from NhanVien where email = ? and matKhau = ?";
        rs = JDBC_Helper.selectTongQuat(sql, mail, pass);
        
        try {
            while(rs.next()){
                String email = rs.getString(1);
                String matKhau = rs.getString(2);
                nv = new DangNhap_NhanVien(email, matKhau);
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
