/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_guttadoro_prouillet;

/**
 *
 * @author lprouill
 */
public class Joueur {
    String Nom;
    String couleur;
    Jeton[] ListeJetons;
    int nombreDesintegrateurs;
    int nombreJetons_restants;
    
    public Joueur ( String unNom ) {
        Nom = unNom;
        Jeton ListeJeton[]= new Jeton[21];
        nombreJetons_restants=21;
        nombreDesintegrateurs=0;
        
}
    public void affecterCouleur(String ValCouleur) {
        couleur=ValCouleur;
        if (ValCouleur != "rouge"  && ValCouleur != "jaune") {
            System.out.println("Erreur couleur");
        }
    }
    public boolean ajouterJeton(Jeton ValJeton) {
        if (nombreJetons_restants<21) {
           ListeJetons[nombreJetons_restants]= ValJeton;
           System.out.println("Nomre de jetons égal à "+nombreJetons_restants);
           return true;
        }
        else {
           System.out.println("Erreur impossible d'ajouter un nouveau jeton");
           return false;
        }
        
    }
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs++;
        
    }
    public boolean utiliserDesintegrateurs () {
        if (nombreDesintegrateurs>0) {
            nombreDesintegrateurs--;
            System.out.println("Désintégrateur bien utilisé, plus que "+ nombreDesintegrateurs+ " restants");
            return true;
        }
        else {
            return false;
        }
        
        
    }
    
}
