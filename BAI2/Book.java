/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class Book {
    public String boCode;
    public String boTitle;
    public String boAuthor;
    
    public Book() {
        this.boAuthor = "";
        this.boCode = "";
        this.boTitle = "";
    }
    
    public Book(String boCode , String boTitle , String boAuthor) {
        this.boAuthor = boAuthor;
        this.boCode = boCode;
        this.boTitle = boTitle;
    }
    
    public String getBoCode() {
        return boCode;
    }
    
    public String getBoTitle() {
        return boTitle;
    }
    
    public String getBoAuthor() {
        return boAuthor;
    }
    
    public void setBocode(String code) {
        this.boCode = code;
    }
    
    public void setBoTitle(String title) {
        this.boTitle = title;
    }
    
    public void setBoAuthor(String author) {
        this.boAuthor = author;
    }
    
    @Override
    public String toString() {
        return  this.boCode + "\n" + this.boTitle + "\n" + this.boAuthor + "\n";
    }
}
