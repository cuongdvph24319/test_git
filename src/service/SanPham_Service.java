/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.ChiTietSP;
import model.SanPham;
import repository.SanPham_Repository;

/**
 *
 * @author ACER
 */
public class SanPham_Service {
    public static List<ChiTietSP> getAllSanPham(){
        return SanPham_Repository.getAllSanPham();
    }
    public static ChiTietSP getChiTietSPByMaSP(String maSP){
        return SanPham_Repository.getSanPhamBySP(maSP);
    }
}
