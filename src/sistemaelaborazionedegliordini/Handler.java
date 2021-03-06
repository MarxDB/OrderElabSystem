/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;


import java.util.LinkedList;


/**
 *
 * @author Mars_DB
 */
public class Handler {
    private LinkedList<?>       staff;
    private LinkedList<Item>    products;
    private AccountArchive      customers;
    private LinkedList<Order>   executedOrders;
    private LinkedList<Order>   ordersToExecute;
    private double              outgoings;
    private double              profits;

    
    public Handler(){
        this.staff              = new LinkedList();
        this.products           = new LinkedList();
        this.customers          = new AccountArchive();
        this.executedOrders     = new LinkedList();
        this.ordersToExecute    = new LinkedList();
        this.profits            = 0;
        this.outgoings          = 0;
    }
    
    public boolean addCustomer(Account a){
        boolean b = this.customers.addAccount(a);
        toNotify(b);
        return b;
    }
    
    public boolean deleteCustomer(Account a){
        boolean b = this.customers.removeAccount(a);
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
    
    @Override
    public String toString(){

        return "Profitti: "+this.profits
                +"\nSpese: "+this.outgoings
                +"\nLista Utenti: \n"+this.customers.toString()
                +"\nLista ordini evasi: \n"+this.executedOrders.toString()
                +"\nLista ordini da evadere: \n"+this.ordersToExecute.toString();
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
            System.out.println("L'operazione ?? andata a buon fine!");
        else 
            System.out.println("Ops! C'?? stato un errore!");
    }   
}
