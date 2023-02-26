/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

/**
 *
 * @author Redmi
 */
public class NhanVien {
    public String tenNhanVien;
    public double luongCoBan;
    public double heSoLuong;
    public double LUONG_MAX;
    
    public NhanVien() {
        this.heSoLuong = 0;
        this.LUONG_MAX = 0;
        this.luongCoBan = 0;
        this.tenNhanVien = "";
    }
    
    public NhanVien(String tenNhanVien , double luongCoBan , double heSoLuong , double LUONG_MAX) {
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
        this.luongCoBan = luongCoBan;
        this.tenNhanVien = tenNhanVien;
    }
    
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    
    public double getLuongCoBan() {
        return luongCoBan;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }
    
    public double getLUONG_MAX() {
        return LUONG_MAX;
    }
    
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }
    
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }
    
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    
    public boolean tangLuong(double b) {
        double heSoLuongTang = heSoLuong + b;
        double luongMoi = luongCoBan * heSoLuongTang;
        if (luongMoi <= LUONG_MAX) {
        } else {
            return false;
        }
        return true;
    }
}
