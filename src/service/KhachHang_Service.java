/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;
import repository.KhachHang_Repository;

/**
 *
 * @author ACER
 */
public class KhachHang_Service {
    public static List<KhachHang> getAllKhachHang(){
        return KhachHang_Repository.getAllKhachHang();
    }
    public static boolean DangNhap(String mail, String pass){
        return KhachHang_Repository.DangNhap(mail, pass);
    }
    public static int ThemKH(KhachHang kh){
        return KhachHang_Repository.ThemKH(kh);
    }
    public static int SuaKH(KhachHang kh){
        return KhachHang_Repository.SuaKH(kh);
    }
    public static int XoaKH(KhachHang kh){
        return KhachHang_Repository.Xoa(kh);
    }
}
