/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;

/**
 *
 * @author Mars_DB
 */
public class Item{
    private String name;
    private double price;
    
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void toPrint(){
        System.out.println("Oggetto: "+this.name+"\nPrezzo: "+this.price);
    }
}
