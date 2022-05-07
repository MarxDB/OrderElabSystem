/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaelaborazionedegliordini;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Mars_DB
 */
public class AccountArchive {
    public Set<Account> Accounts;
    
    public AccountArchive(){
        this.Accounts = new LinkedHashSet<>();
    }
    
    public void getAccountInfo(String s){
        for(Account o: this.Accounts){
            if(o.getName().equals(s)){
                o.toString();
                break;
            }
        }
    }
    
    public boolean addAccount(Account a){
        return this.Accounts.add(a);
    }

    public boolean removeAccount(Account a){
        return this.Accounts.remove(a);
    }
    
    public Account getAccount(String s){
        Account a = this.Accounts.stream().filter(o -> o.getName()
                .equals(s))
                .findAny()
                .get();
    /*    for(Account o: this.Accounts){
            if(o.getName().equals(s)){
                a = o;
                break;
            }
        }*/
        return a;
    }
    
    public List getAccounts(){
        List l = new ArrayList<Account>();
        this.Accounts.stream().forEach(a -> l.add(a));      
        return l;
    }
}
