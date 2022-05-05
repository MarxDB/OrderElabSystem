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
public class Account {
    private String name;                                                        
    private double credit;                                                      
    private String address;
    private LinkedList payments;
    
    public Account(String name, double credit, String ad){                      //builder
        this.name = name;
        this.credit = credit;
        this.payments = new LinkedList<Payment>();
        this.address = ad;
    }
    
    public boolean addPayment(Payment payment){                                 //inserimento pagamento
        if(payment.getCost()<= this.credit){
            this.payments.add(payment);
            this.credit-=payment.getCost();
            payment.setPayd();
            System.out.println("Il pagamento è andato a buon fine!");
        }
        return payment.getPayd();
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public double getCredit(){
        return this.credit;
    }
    
    public boolean addCredit(double d){
        boolean c = false;
        this.credit += d;
        return c;
    }
    @Override
    public String toString(){
        return "Nome account: "+this.name+"\nCredito: "
                +this.credit+"€"+"\nIndirizzo: "+this.address;                                
    }
}
