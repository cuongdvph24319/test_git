/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.NhanVien;
import repository.NhanVien_Repository;

/**
 *
 * @author ACER
 */
public class NhanVien_Service {
    public static List<NhanVien> getAllNhanVien(){
        return NhanVien_Repository.getAllNhanVien();
    }
    public static boolean DangNhapNhanVien(String mail, String pass){
        return NhanVien_Repository.DangNhapNhanVien(mail, pass);
    }
}
