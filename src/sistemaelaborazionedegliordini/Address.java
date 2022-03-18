/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;

/**
 *
 * @author Mars_DB
 */
public class Address {                                                          //indirizzo account
    private final String eAddres;
    
    public Address(String s){                                                   //builder
        this.eAddres = s;
    }
    
    public String toString(){                                                   
        return this.eAddres;
    }
    
}
