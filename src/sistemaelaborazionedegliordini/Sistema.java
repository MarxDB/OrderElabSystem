/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaelaborazionedegliordini;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Mars_DB
 */
public class Sistema {

    public static void main(String[] args) {
        // TODO code application logic here
        Handler h = new Handler();
        Account a = new Account("Pippo", 2000);
        
        h.addItem(new Item("Scarpe",     120.5, 50));
        h.addItem(new Item("Giochi",     75.5,  100));
        h.addItem(new Item("Laser",      90,   6));
        h.addItem(new Item("Guanti",     35.5,  80));
        h.addItem(new Item("Pantaloni",  45.5,  60));
        h.addItem(new Item("Libro",      12.5,  239));
        h.addItem(new Item("Gomme",      3,     823));
        h.addItem(new Item("Vaso",       7.5,   98));
        h.addItem(new Item("Bicicletta", 212.5, 30)); 
        
        
    }
}

