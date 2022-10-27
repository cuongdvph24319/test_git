/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import java.sql.*;
import model.DangNhap_KhachHang;
import unility.JDBC_Helper;

/**
 *
 * @author ACER
 */
public class KhachHang_Repository {
    public static List<KhachHang> getAllKhachHang(){
        List<KhachHang> listKH = new ArrayList<>();
        ResultSet rs;
        String sql = "select Ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia from KhachHang";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while(rs.next()){
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                String tenDem = rs.getString(3);
                String ho = rs.getString(4);
                String ngaySinh = rs.getString(5);
                String sdt = rs.getString(6);
                String diaChi = rs.getString(7);
                String thanhPho = rs.getString(8);
                String quocGia = rs.getString(9);
                KhachHang kh = new KhachHang(ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, null, null);
                listKH.add(kh);
            }
            return listKH;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean DangNhap(String mail, String pass){
        ResultSet rs;
        DangNhap_KhachHang dn = null;
        String sql = "select email, matKhau from khachHang where email = ? and matKhau = ?";
        rs = JDBC_Helper.selectTongQuat(sql, mail, pass);
        try {
            while(rs.next()){
                String email = rs.getString(1);
                String matKhau = rs.getString(2);
                dn = new DangNhap_KhachHang(email, matKhau);
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static int ThemKH(KhachHang kh){
        String sql = "insert into KhachHang(ma, matKhau, email) values (?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, kh.getMa(), kh.getMatkhau(),kh.getEmail());
    }
    public static int SuaKH(KhachHang kh){
        String sql = "update KhachHang set ten=?, tenDem=?, ho=?, ngaySinh=?, sdt=?, diaChi=?, thanhPho=?, quocGia=? where ma=?";
        return JDBC_Helper.updateTongQuat(sql, kh.getTen() ,kh.getTenDem(), kh.getHo(), kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMa());
    }
    public static int Xoa(KhachHang kh){
        String sql = "delete from khachHang where email=?";
        return JDBC_Helper.updateTongQuat(sql, kh.getEmail());
    }
}
