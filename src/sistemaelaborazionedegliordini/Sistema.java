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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nOggetti;
        int scelta;
        String scelta2;
        int i = 0;
        boolean prosegui = true;
        boolean pr2 = true;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        HashSet<Account> listaAccount = new HashSet();
        HashSet<Order> listaOrdini = new HashSet();


        List<Item> listaOggetti = new LinkedList();
        listaOggetti.add(new Item("Scarpe",     120.5));
        listaOggetti.add(new Item("Giochi",     75.5));
        listaOggetti.add(new Item("Laser",      90));
        listaOggetti.add(new Item("Guanti",     35.5));
        listaOggetti.add(new Item("Pantaloni",  45.5));
        listaOggetti.add(new Item("Libro",      12.5));
        listaOggetti.add(new Item("Gomme",      3));
        listaOggetti.add(new Item("Vaso",       7.5));
        listaOggetti.add(new Item("Bicicletta", 212.5));
        
    /*    
        System.out.print("Inserire nome account: ");
        String nome = scan.nextLine();
        System.out.print("Inserire indirizzo account: ");
        String indirizzo = scan.nextLine();
        System.out.print("Inserire credito: ");
        double credito = scan1.nextDouble();
        listaAccount.add(new Account(nome, credito, indirizzo));
        System.out.println("Account creato!");
        for(Account a : listaAccount) {
            a.toPrint();
        } */
        
        do{
            i++;
            System.out.println("\nQuale operazione vuoi eseguire?");
            System.out.println("1)Creazione account\t\t2)Nuovo ordine\t\t3)Saldo residuo\n");
            System.out.println("4)Stampa lista account\t\t5)Stampa lista ordini inevasi");
            scelta = scan1.nextInt();
        
            switch (scelta) {
                case 1:
                {
                    System.out.print("Inserire nome account: ");
                    String nome = scan.nextLine();
                    System.out.print("Inserire credito: ");
                    double credito = scan1.nextDouble();
                    System.out.print("Inserire indirizzo account: ");
                    String indirizzo = scan.nextLine();
                    listaAccount.add(new Account(nome, credito, indirizzo));
                    System.out.println("Account creato!");
                    break;
                }
                case 2:
                {
                    boolean verifica = false;
                    System.out.println(listaAccount);
                    System.out.println("Inserisci il nome a cui è riferito l'account a cui intestare l'ordine: ");
                    String nome = scan.nextLine();
                    for(Account a: listaAccount){                        
                        if(a.getName().equals(nome))
                               verifica = listaOrdini.add( new Order(i, a));
                    }
                    if(verifica)
                        System.out.println("Ordine non creato!");
                    break;
                }
                case 3:
                {    
                    int ctrl = 0;
                    System.out.print("Inserire nome account: ");
                    String nome = scan.nextLine();
                    for (Account a : listaAccount) {                            
                        if(a.getName().equals(nome)){
                            System.out.println("Il credito residuo per "+a.getName()
                                        +" è di "+a.getCredit()+" €");
                            ctrl++;
                        }
                    }
                    if(ctrl == 0)
                        System.out.println("Account non trovato!");
                                
                    break;
                }                    
                case 4:
                {
                    for(Account a : listaAccount) {
                            a.toPrint();
                    }
                    break;
                }    
                case 5:
                {  
                    for(Order o : listaOrdini) {
                        o.toPrint();
                    }
                    break;
                }                          
                default:
                {
                    System.out.println("Errore, ripetere la richiesta.\n");
                    break;
                }
            }
             
            System.out.print("Vuoi eseguire altre operazioni?(y/n) ");
            scelta2 = scan.nextLine();

        }while(scelta2.equals("y")); 
    }
}

