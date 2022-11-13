/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositset;


import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author Wahch
 */
public class EspritTreeSet implements GestionEnseignant {
    Set Ensge = new TreeSet() ;
    public EspritTreeSet(){ 
     this.Ensge=new TreeSet();
    }
    @Override
    public void ajouterEnseignant(Enseignant e) {
        Ensge.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return Ensge.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (int i = 0; i < Ensge.size(); i++) {
            if (Ensge.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        Ensge.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(Ensge);
    }
    
}
