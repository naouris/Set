/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Collections;
import java.util.List;

import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class EspritTreeSet implements GestionEnseignant{
 private  Set<Enseignant>set2=new TreeSet<>();
 

    @Override
    public void ajouterEnseignant(Enseignant e) {
set2.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
return set2.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
 for(Enseignant e2 :set2){
             if (e2.getId()==id){
                                  return true;     

             }
         }
      return false;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
set2.remove(e);    }

    @Override
    public void displayEnseignants() {
for(Enseignant e:set2){
            System.out.println(e);}
    }
    
    

    
    
}
    

