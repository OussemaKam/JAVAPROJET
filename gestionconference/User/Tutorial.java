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
public class Tutorial {
    private String titre ;
    private User cherch ;
    private int nbrParticipants ;
    private String desc ;
    private Conference c ;
    private String date ;
    private String time ;
    
    public Tutorial ( String tit, User a , String descr, Conference conf, User ch) {
        this.cherch = ch ;
        this.c = conf ;
        this.titre = tit ;
        this.cherch = a ;
        this.desc = descr ;
        this.nbrParticipants = 0 ;
    }
    public void addParticipant(){
        this.nbrParticipants++ ;
    }
    public boolean checkNbr(){
        return this.nbrParticipants>9 ;
    }

}
