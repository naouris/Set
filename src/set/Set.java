/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

/**
 *
 * @author ACER
 */
public class Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Enseignant e1=new Enseignant(2, "nawres", "oueslati");
        Enseignant e2=new Enseignant(3, "hanin", "ryehi");
        Enseignant e3=new Enseignant(4, "maryem", "jbeli");
                Enseignant e4=new Enseignant(4, "berich", "samrh");


       // EspritHashSet H=new EspritHashSet();
                EspritTreeSet H=new EspritTreeSet();

        H.ajouterEnseignant(e3);
        H.ajouterEnseignant(e2);
        H.ajouterEnseignant(e1);
                H.ajouterEnseignant(e4);

        H.displayEnseignants();
        
        System.out.println("*****************");
        
        H.rechercherEnseignant(e3);
        
        System.out.println("*****************");
        
        H.supprimerEnseignant(e2);
        H.displayEnseignants();
        
    }
    
}
