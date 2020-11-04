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
public class Jeton {
    String couleur;
    
    public Jeton( String uneCouleur ) {
        couleur = uneCouleur;
    }
    
    public String  lireCouleur ( ) {
        //System.out.println ( " Le jeton est de couleur "+couleur );
        return couleur;
    }
}
