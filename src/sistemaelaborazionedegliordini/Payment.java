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
    
    private final double cost;                                                  //costo
    private final String account;                                               //identificativo pagamento
    private boolean payd;
    
    public Payment(double cost, String s){                                      //builder                                    
        this.cost = cost;
        this.account = s;
        this.payd = false;
    }

    public double getCost() {
       return this.cost;
    }
    
    public boolean toPayment(Account account){
        this.payd = account.addPayment(this);
        return this.payd;
    }
    
    public String toString(){
        return "Pagamento a carico di "+this.account+"\ndi "+
                +this.cost+"€"+"\npagato: "+this.payd;
    }
    
}
