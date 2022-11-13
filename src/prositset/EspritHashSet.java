/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositset;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Wahch
 */
public class EspritHashSet implements GestionEnseignant {
    Set Ensg = new HashSet() ; 
    public EspritHashSet(){ 
     this.Ensg=new HashSet();
    }
    public void ajouterEnseignant(Enseignant e)
    {
        Ensg.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
       return Ensg.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
         for (int i = 0; i < Ensg.size(); i++) {
            if (Ensg.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        Ensg.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(Ensg);
    }
    
}
