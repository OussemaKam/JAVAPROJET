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
public class Conference {
    private User adm ;
    private String date ; 
    private Tutorial[] tutoAg ;
    private Session[] sessAg ;
    private int nbrParticipant ;
    private User[] mc ;
    
    public Conference(User adm , String date ,User[] mc ){
        this.adm = adm ;
        this.date = date ;
        this.mc = mc ; 
        this.tutoAg = new Tutorial[] {} ;
        this.sessAg = new Session[] {} ;
        
        
        
    }
    public void addParticipant() {
        nbrParticipant ++ ;
    }
    public User[] getMc(){
        return this.mc ;
    }
    public void addTuto(Tutorial tuto){
        // Ajout à la liste
    }
    public void addSess(Session s){
        // Ajout
    }
    public void addToConf( Article t){
        int i=0 ;
        String ch= t.getTh() ;
        while (i< sessAg.length) {
            if ( ch == sessAg[i].getTh1() && sessAg[i].getNb() < 3 )
                break ;
            i ++ ;
        }
        if (i>= sessAg.length){
            Session s = new Session(t) ;
            // AJOUT AU LIST
        }
        else {
            Session s = new Session(t) ;
            this.addSess(s) ;        
        }
    }
}
