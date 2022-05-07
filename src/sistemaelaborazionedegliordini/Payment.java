/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;

/**
 *
 * @author Mars_DB
 */
public class Payment {
    
    private final double cost;                                              // costo
    private final Order order;                                              // identificativo pagamento
    private boolean payd;
    
    public Payment(double cost, Order o, Account account){                                   // builder                                    
        this.cost = cost;
        this.order = o;
        this.payd = account.addPayment(this);
    }

    public double getCost() {
       return this.cost;
    }
    
    
    @Override
    public String toString(){
        return "Pagamento a carico di "+this.order+"\ndi "+
                +this.cost+"€"+"\npagato: "+this.payd;
    }
    
    public boolean getStatus(){
        return this.payd;
    }
    
    public void setPayd(){
        this.payd = true;
    }
    
    
}
