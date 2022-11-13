/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositset;

/**
 *
 * @author Wahch
 */
public class PrositSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enseignant E1 = new Enseignant(1,"wahch", "Mohamed");
        Enseignant E2 = new Enseignant(2,"kh", "yac");
        Enseignant E3 = new Enseignant(3,"tebssi", "majd");
        EspritHashSet Esprit = new EspritHashSet();
        Esprit.ajouterEnseignant(E1);
        Esprit.ajouterEnseignant(E2);
        Esprit.ajouterEnseignant(E3);
        Esprit.displayEnseignants();
        Esprit.rechercherEnseignant(E3) ;
        Esprit.rechercherEnseignant(2) ; 
        Esprit.supprimerEnseignant(E3) ; 
        EspritTreeSet ULT = new EspritTreeSet();
         Enseignant E6 = new Enseignant(6,"wahch", "Moohamed");
        Enseignant E4 = new Enseignant(4,"kh", "yacaaa");
        Enseignant E5 = new Enseignant(5,"aaa", "majdaaa");
        ULT.ajouterEnseignant(E4);
        ULT.ajouterEnseignant(E5);
        ULT.ajouterEnseignant(E6);
        ULT.displayEnseignants();
        ULT.rechercherEnseignant(E5) ;
        ULT.rechercherEnseignant(5) ; 
        ULT.supprimerEnseignant(E6) ; 
        ULT.displayEnseignants();
    }
    
}
