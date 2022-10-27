/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.ChiTietSP;
import java.sql.*;
import java.util.ArrayList;
import unility.JDBC_Helper;

/**
 *
 * @author ACER
 */
public class SanPham_Repository {
    public static List<ChiTietSP> getAllSanPham(){
        List<ChiTietSP> listSP = new ArrayList<>();
        ResultSet rs;
        String sql = "select SanPham.Ten, MauSac.Ten,NSX.Ten, DongSP.Ten ,namBH, moTa, soLuongTon, giaNhap, giaBan from ChiTietSP inner join SanPham on ChiTietSP.idSP=SanPham.id inner join NSX on ChiTietSP.idNsx=NSX.id inner join MauSac on ChiTietSP.idMauSac=MauSac.id inner join DongSP on ChiTietSP.idDongSp=DongSP.id";
        rs = JDBC_Helper.selectTongQuat(sql);
        
        try {
            while(rs.next()){
                String tensp = rs.getString(1);
                String tenMS = rs.getString(2);
                String tenNSX = rs.getString(3);
                String tenDong = rs.getString(4);
                int namBH = rs.getInt(5);
                String moTa = rs.getString(6);
                int soLuongTon = rs.getInt(7);
                double giaNhap = rs.getDouble(8);
                double giaBan = rs.getDouble(9);
                ChiTietSP sp = new ChiTietSP((tensp + " - " + tenMS + " - " + tenNSX + " - " +tenDong ), namBH, moTa, soLuongTon, giaNhap, giaBan);
                listSP.add(sp);
            }
            return listSP;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static ChiTietSP getSanPhamBySP(String maSP){
        ResultSet rs;
        ChiTietSP ctsp = null;
        String sql = "select SanPham.Ten, MauSac.Ten,NSX.Ten, DongSP.Ten ,namBH, moTa, soLuongTon, giaNhap, giaBan from ChiTietSP inner join SanPham on ChiTietSP.idSP=SanPham.id inner join NSX on ChiTietSP.idNsx=NSX.id inner join MauSac on ChiTietSP.idMauSac=MauSac.id inner join DongSP on ChiTietSP.idDongSp=DongSP.id where concat(SanPham.Ten, MauSac.Ten,NSX.Ten, DongSP.Ten) = ?";
        rs = JDBC_Helper.selectTongQuat(sql, maSP);
        
        try {
            while(rs.next()){
                String tensp = rs.getString(1);
                String tenMS = rs.getString(2);
                String tenNSX = rs.getString(3);
                String tenDong = rs.getString(4);
                int namBH = rs.getInt(5);
                String moTa = rs.getString(6);
                int soLuongTon = rs.getInt(7);
                double giaNhap = rs.getDouble(8);
                double giaBan = rs.getDouble(9);
                ctsp = new ChiTietSP((tensp + " - " + tenMS + " - " + tenNSX + " - " +tenDong ), namBH, moTa, soLuongTon, giaNhap, giaBan);
            }
            return ctsp;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
