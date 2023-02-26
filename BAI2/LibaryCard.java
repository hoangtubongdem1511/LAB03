/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

/**
 *
 * @author Redmi
 */
public class LibaryCard {
    public long IbCode;
    public String owner;
    public int borrowCount;
    
    public LibaryCard() {
        this.IbCode = 0;
        this.borrowCount = 0;
        this.owner = "";
    }
    
    public LibaryCard(long IbCode , String owner , int borrowCount) {
        this.IbCode = IbCode;
        this.borrowCount = borrowCount;
        this.owner = owner;
    }
    
    public long getLbCode() {
        return IbCode;
    }
    
    public int BorrowCount() {
        return borrowCount;
    }
    
    public String Owner() {
        return owner;
    }
    
    public void setLbCode(long code) {
        this.IbCode = code;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void checkOut(int num) {
        this.borrowCount = num;
    }
    
    @Override
    public String toString() {
        return  this.owner + "\n" + this.IbCode + "\n" + this.borrowCount + "\n";
    }
}
