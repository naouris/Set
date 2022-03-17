/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author ACER
 */
public class EspritHashSet implements GestionEnseignant{
 Set<Enseignant>set1=new HashSet<>();
    @Override
    public void ajouterEnseignant(Enseignant e) {
    set1.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
return set1.contains(e);    }

    @Override
    public boolean rechercherEnseignant(int id) {
for(Enseignant e:set1){

   if (e.getId()==id){
       return true;
   }
    }   
return false;
    }


    @Override
    public void supprimerEnseignant(Enseignant e) {
set1.remove(e);    }

    @Override
    public void displayEnseignants() {
        for(Enseignant e:set1){
            System.out.println(e);}
    }


    
    
}
