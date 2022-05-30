
package mypkg;

import java.util.Comparator;


public class Book {
    protected String code;
    protected String title;
    protected float unitPrice;
    protected int quantity;

    public Book() {
    }

    
    public Book(String Code, String title, float UnitPrice, int Quantity) {
        this.code = Code;
        this.title = title;
        this.unitPrice = UnitPrice;
        this.quantity = Quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String Code) {
        this.code = Code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float UnitPrice) {
        this.unitPrice = UnitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        this.quantity = Quantity;
    }
    
    @Override 
    public String toString(){
        return "Code: "+ code + "      Title: "+ title + "      Unit Price: "+ unitPrice+"      Quantity: "+quantity;
    }
    
    public void displayInformation(){
        System.out.println("Code: "+ getCode() + "      Title: "+ getTitle() + "      Unit Price: "+ getUnitPrice()+"      Quantity: "+getUnitPrice());
    
    }
}
