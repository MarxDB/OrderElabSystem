/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Mars_DB
 */
public class Order {
    
    private int num;                                                            //codice ordine
    private HashMap<String, Item> items;                                        //mappa nome-oggetto
    private double totCost;                                                     //costo complessivo
    private Account account;                                                    //account di riferimento
    private boolean exed;                                                       //completato?

    
    public Order(int n, Account account){                                       //builder
        this.num = n;
        this.items = new HashMap<String, Item>();
        this.account = account;
        this.exed = false;
    }
    
    public void addItem(Item item){                                             //aggiunta elemento          
        this.items.put(item.getName(), item);
    }
    
    public void removeItem(Item item){                                          //rimozione elemento  
        items.remove(item);         
    }   
    
    private double getCost(){                                                   //costo complessivo ordine
        this.totCost = 0;
        items.values().forEach(i -> {
            this.totCost += i.getPrice();
        });
        return this.totCost;
    }
    
    public boolean exeOrder(){                                                  //esecuzione pagamento       
        Payment p = new Payment(this.totCost, this.account.getName());        
        this.exed = this.account.addPayment(p);        
        return this.exed;
        
    }
    
    public void toPrint(){
        System.out.println("Ordine n°"+this.num+"\n"+items.toString());
    }
}
