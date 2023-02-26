/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class Fraction {
    public int numerator;
    public int denominator;
    
    public Fraction() {
        this.denominator = 0;
        this.numerator = 0;
    }
    
    public Fraction(int num , int den) {
        this.denominator = den;
        this.numerator = num;
    }
    
    public Fraction(Fraction f) {
        this.denominator = f.denominator;
        this.numerator = f.numerator;
    }
    
    public Fraction add(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.denominator + f.numerator * this.denominator;
        kq.denominator = this.denominator * f.denominator;
        return kq;
    }
    
    public Fraction sub(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        kq.denominator = this.denominator * f.denominator;
        return kq;
    }
    
    public Fraction mul(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.numerator;
        kq.denominator = this.denominator * f.denominator;
        return kq;
    }
    
    public Fraction div(Fraction f) {
        Fraction kq = new Fraction();
        kq.numerator = this.numerator * f.denominator;
        kq.denominator = this.denominator * f.numerator;
        return kq;
    }
    
    public int ucln(int a, int b) {
        if (b == 0) return a;
        else return ucln(b , a % b);
    }
    
    public void reducer() {
        int d = ucln(numerator , denominator);
        numerator = numerator / d;
        denominator = denominator / d;
    }
    
    @Override
    public String toString() {
        return "(" + this.numerator + "; " + this.denominator + ")";
    }
}
