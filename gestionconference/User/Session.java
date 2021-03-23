/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconference.User;

/**
 *
 * @author Oussema
 */
public class Session {
    private int nbrArticle ;
    private String thème ; // yerka7 fel article
    private Article[] art ;
    private String time ; 
    
    public Session(Article t){
        this.art = new Article[] { t} ;
        this.thème = t.getTh() ;
        nbrArticle = 1 ;
    }
    public void addToSess(Article t){
        art.add(t) ;
        // ajout de l'éelement
        nbrArticle ++ ;
    } 
    public String getTh1(){
        return thème ;
    }
    public int getNb(){
        return nbrArticle ;
        
    }
}
