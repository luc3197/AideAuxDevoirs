package com.samy.testeur.aideauxdevoirs;

/**
 * Created by Admin on 09/04/2018.
 */

public class Question {
    String enonce;
    String[] reponses = new String[4];
    int bonnereponse;

   public Question(String chaine1, String[] tab, int entier){
       enonce=chaine1;
       reponses=tab;
       bonnereponse=entier;
    }


    public boolean estvraie (int i){
        if (i==this.bonnereponse){
            return true;
        }
        else {
            return false;
        }
    }
}
