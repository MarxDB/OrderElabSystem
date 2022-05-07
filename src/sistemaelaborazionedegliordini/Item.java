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
    private final String name;
    private final double price;
    private int quantity;
    
    public Item(String name, double price, int q){
        this.name       = name;
        this.price      = price;
        this.quantity   = q;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    @Override
    public String toString(){
        return "Oggetto: "+this.name+"\nPrezzo: "+this.price;
    }
}
