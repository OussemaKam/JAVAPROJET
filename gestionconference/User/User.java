/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconference.User;

public class User {
    private String name ;
    private String userName ;
    private String userPassword ;
    private String email ;
    protected String[] spécialité ;
    
    public User( String name1 , String usern , String userp , String email1 , String[] spec ) {
    this.name = name1 ;
    this.userName = usern ;
    this.userPassword = userp ;
    this.email = email1 ;
    this.spécialité = spec ; 
    
    public boolean pay(){}
    public void inscriConférence( Conference c ) {
            if (this.pay()) {
                c.addParticipant() ;
                System.out.println("Inscription validée");}
            else 
                System.out.println ("Inscription échouée") ;
            }
    
    public boolean checkSpec(String thème){
        int i = 0 ;
        while (i<spécialité.length) {
            if (spécialité[i] == thème) 
                break ;
            i ++ ;
        } 
        return (i<spécialité.length) ;    
    }
}
