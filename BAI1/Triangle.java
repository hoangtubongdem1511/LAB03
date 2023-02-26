/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

/**
 *
 * @author Redmi
 */
public class Triangle {
    public float width;
    public float heght;
    
    public Triangle() {
        this.width = 0;
        this.heght = 0;
    }
    
    public Triangle(float width , float heght) {
        this.width = width;
        this.heght = heght;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float getHeight() {
        return heght;
    }
    
    public void setHeght(float heght) {
        this.heght = heght;
    }
    
    public void setWidth(float width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        return "(" + this.width + "; " + this.heght + ")";
    }
}

