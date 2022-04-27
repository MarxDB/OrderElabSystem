/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;


import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Mars_DB
 */
public class Handler {
    private LinkedList products;
    private LinkedList customers;
    private LinkedList executedOrders;
    private LinkedList ordersToExecute;
    private Scanner scan;
    private double profits;
    private double outgoings;
    
    public Handler(){
        this.customers = new LinkedList<Account>();
        this.products = new LinkedList<Item>();
        this.executedOrders = new LinkedList<Order>();
        this.ordersToExecute = new LinkedList<Order>();
        this.scan = new Scanner(System.in);
        this.profits = 0;
        this.outgoings = 0;
    }
    
    public boolean addCustomer(Account a){
        boolean b = this.customers.add(a);
        toNotify(b);
        return b;
    }
    
    public boolean deleteCustomer(Account a){
        boolean b = this.customers.remove(a);
        toNotify(b);
        return b;
    }
    
    public boolean addOrders(Order o){
        boolean b = this.ordersToExecute.add(o);
        toNotify(b);
        return exeOrder(o);
    }
    
    public boolean addItem(Item i){
        boolean b = this.products.add(i);
        toNotify(b);
        return b;
    }
    
    private boolean exeOrder(Order o){
        boolean b = o.exeOrder();
        if(b){
            this.ordersToExecute.remove(o);
            this.executedOrders.add(o);
            this.profits += (o.getCost() - (o.getCost()*40)/100);
            this.outgoings += ((o.getCost()*40)/100);
        }            
        return b;
    }
    
    private void toNotify(boolean b){
        if(b)
            System.out.println("L'operazione è andata a buon fine!");
        else 
            System.out.println("Ops! C'è stato un errore!");
    }
    
    
    
}
