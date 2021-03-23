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
public class Article {
    private int articleId ;
    private String thème ;
    private float score ;
    private int[] chercheurId ;
    private String descrip ;
    private String link ;
    private int nbrNote ;
    private Conference c ;
    
    public Article ( String th , int[] chId , String desc ) {
        this.thème = th ;
        this.chercheurId = chId ;
        this.descrip = desc ;
        nbrNote = 0 ;
        score = 0 ;
    }
    public void setScore( User mc , float note){
        nbrNote++ ;
        if ( score == 0){
            score = note ;
            
        }
        else {
            if ( mc.checkSpec(thème)) {
                score = (score + note) / 2 ;
            }
            else {
                score = score + (note /2) ;
                score/=1.5 ;
            }
        }
    }
    public String getTh(){
        return this.thème ;
    }
}
