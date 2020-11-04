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
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule () {
        jetonCourant=null;
        trouNoir = false;
        desintegrateur = false;
        
    }
    
    public boolean affecterJeton(Jeton ValJeton) {
        if ( jetonCourant==null) {
            jetonCourant= ValJeton;
            return true;
        } else {
            return false;
        }
        
    }
    
    public Jeton recupererJeton() {
        return jetonCourant;
        
    }
    
    public boolean supprimerjeton () {
        if ( jetonCourant != null ) {
            jetonCourant=null;
            return true;
        } else {
            System.out.println(" pas de jeton présent ");
           
            return false;
        }
    }
    
    public boolean placerTrouNoir () {
        if ( trouNoir == false ) {
            trouNoir=true;
            return true;
            
        } else {
            return false; 
        }
    }
    
    public boolean placerDesintegrateur() {
        if ( desintegrateur == false ) {
            desintegrateur=true;
            return true;
        } else {
            return false;
        }
    }
    
    
    public boolean presenceTrouNoir () {
        if ( trouNoir == true ) {
            return true;
            
        }else {
            return false;
        }           
    }
    
     public boolean presencDesintegrateur () {
        if ( desintegrateur == true ) {
            return true;
            
        }else {
            return false;
        }           
    }
     
    public String lireCouleurDuJeton () {
        return jetonCourant.lireCouleur();

    }
    
    
    public boolean recupererDesintegrateur () {
        
        if ( desintegrateur == true ) {
            desintegrateur=false;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean activerTrouNoir () {
        if ( trouNoir == true ) {
            jetonCourant= null;
            trouNoir=false;
            return true;
        } else {
            return false;
        }
        
    }
}
