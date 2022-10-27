/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class ChiTietSP {
    private String tenSanPham;
    private int namBaoHanh;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double giaXuat;

    public ChiTietSP() {
    }

    public ChiTietSP(String tenSanPham, int namBaoHanh, String moTa, int soLuongTon, double giaNhap, double giaXuat) {
        this.tenSanPham = tenSanPham;
        this.namBaoHanh = namBaoHanh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaXuat = giaXuat;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(double giaXuat) {
        this.giaXuat = giaXuat;
    }

    
    
}
