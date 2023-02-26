/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Student {
    public String stID;
    public String stName;
    public String stClass;
    
    public Student() {
        this.stClass = "";
        this.stID = "";
        this.stName = "";
    }
    
    public Student(String stID , String stName , String stClass) {
        this.stClass = stClass;
        this.stID = stID;
        this.stName = stName;
    }
    
    public String getStID() {
        return stID;
    }
    
    public String getStName() {
        return stName;
    }
    
    public String getStClass() {
        return stClass;
    }
    
    public void setStID(String id) {
        this.stID = id;
    }
    
    public void setStName(String name) {
        this.stName = name;
    }
    
    public void setStClass(String Class) {
        this.stClass = Class;
    }
    
    @Override
    public String toString() {
        return  this.stID + "\n" + this.stName+ "\n" + this.stClass + "\n";
    }
}
    
