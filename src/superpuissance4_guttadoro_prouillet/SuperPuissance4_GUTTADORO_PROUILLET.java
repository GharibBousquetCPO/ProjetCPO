package superpuissance4_guttadoro_prouillet;

/*
TP3 Super Puissance 4
GUTTADORO Rosanna et PROUILLET Lorraine 
23/10/2020 TDA 
/**
 *
 * @author lprouill
 */
public class SuperPuissance4_GUTTADORO_PROUILLET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Jeton unejeton = new Jeton("rouge");
       unejeton.lireCouleur();
       
       Joueur Lorraine= new Joueur("Lorraine");
       Lorraine.affecterCouleur("rouge");
       Lorraine.ajouterJeton(unejeton);
       
       Lorraine.obtenirDesintegrateur();
       Lorraine.utiliserDesintegrateurs();
        
        
        
    }
    

    
}
