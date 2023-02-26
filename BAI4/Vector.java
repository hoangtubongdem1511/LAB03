/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

/**
 *
 * @author Redmi
 */
public class Vector {
    public int a1;
    public int a2;
    public int a3;
    
    public Vector() {
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
    }
    
    public Vector(int a1 , int a2 , int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    
    public Vector congVector(Vector f) {
        Vector kq = new Vector();
        kq.a1 = this.a1 + f.a1;
        kq.a2 = this.a2 + f.a2;
        kq.a3 = this.a3 + f.a3;
        return kq;
    }
    
    public Vector truVector(Vector f) {
        Vector kq = new Vector();
        kq.a1 = this.a1 - f.a1;
        kq.a2 = this.a2 - f.a2;
        kq.a3 = this.a3 - f.a3;
        return kq;
    }
    
    public int tichVoHuong(Vector f) {
        return this.a1 * f.a1 + this.a2 * f.a2 + this.a3 * f.a3;
    }
    
    public Vector nhanVector(int k) {
        Vector kq = new Vector();
        kq.a1 = k * this.a1;
        kq.a2 = k * this.a2;
        kq.a3 = k * this.a3;
        return kq;
    }
}
