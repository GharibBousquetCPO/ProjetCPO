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
public class Grille {
Cellule [][] Cellules;

        
public Grille() {
Cellules = new Cellule [6][7];
}




public boolean ajouterJetonDansColonne (Jeton couleurJeton,int colonne) {
    //ajoute le jeton dans la colonne ciblée, sur la cellule vide la plus basse. Renvoie faux si la colonne était pleine.

 boolean b =true;
 for( int i =6; i< Cellules.length; i--) {
     if (Cellules [i][colonne-1].affecterJeton(couleurJeton)){
         b =true;   // si la case est vide, le jeton est placé, sinon , on passe à la case du dessus et ainsi de suite             
 }
     else {
        b = false; // toutes lec cases de la colonne sont prises
     }
}
    return b ;
}

public boolean etreRemplie(){
//  renvoie vrai si la grille est pleine
boolean b = true;
for (int i =0; i < Cellules.length; i++){
    for (int j = 0;  j< Cellules.length; j++){
        if (Cellules [i][j] ==null) {
            b = false;
        }

        else {
            b = true;
            }
}
}
return b;

}


public void viderGrille() {
    //vide la grille
    for (int i =0; i < Cellules.length; i++){
     for (int j = 0;  j< Cellules.length; j++){
        Cellules [i][j].jetonCourant = null;
        Cellules [i][j].trouNoir = false;
        Cellules [i][j].desintegrateur = false;
       
}  
    }
    }

public void  afficherGrilleSurConsole(){
    //fonction d’affichage de la grille sur la console. Doit faire apparaitre les couleurs, et les trous noirs.
    for(int i=0;i<Cellules.length;i++){
        for(int j=0;j<Cellules[0].length;i++){
            if (Cellules[i][j].presenceTrouNoir()==true) {   
               System.out.print("!");
            }
            if ("rouge".equals(Cellules[i][j].lireCouleurDuJeton())) {   
               System.out.print("Rouge");
            }
            if ("jaune".equals(Cellules[i][j].lireCouleurDuJeton())) {    
               System.out.print("Jaune");
            }
            else{
                System.out.print(" ");
            }
        }
}
}
public boolean celluleOccupee(int ligne, int colonne){
    // renvoie vrai si la cellule de coordonnées données est occupée par un jeton.
  
    if (Cellules[ligne][colonne].recupererJeton()==null){
        return false;
    }else{
        return true;
    }
}
 
public String lireCouleurDuJeton(int ligne, int colonne){
    //renvoie la couleur du jeton de la cellule ciblée
   return Cellules[ligne][colonne].recupererJeton().lireCouleur();
}       
 
public boolean  etreGagnantePourJoueur(Joueur unJoueur){
    //renvoie vrai si la grille est gagnante pour le joueur passé en paramètre, c’est-à-dire que 4 pions de sa couleur sont alignés en ligne, en colonne ou en diagonale.
  int i = 0;
  int j = 0 ;
  int nbaligne =0 ; // > compteur
 
  if (Cellules[i][j]== unJoueur.couleur) {
      
      
  }
}
 
public void tasserGrille (int ligne,int colonne){
    //lorsqu’un jeton est capturé ou détruit, tasse la grille en décalant de une igne les jetons situés au dessus de la cellule libérée.
for (int i = ligne ; i <6 ; i++) {
    if (i == 5) {
        Cellules[i][colonne].jetonCourant =null;
        }
    else {
        Cellules[i][colonne].jetonCourant = Cellules[i +1][colonne].jetonCourant ;
    }
}   
    
    
   
}
//public boolean colonneRemplie(){
   // renvoie vrai si la colonne est remplie (on ne peut y jouer un Jeton)

   
//}
 
   

//public boolean  placerTrouNoir(int, int ){
    //ajoute un trou noir à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé, ou faux sinon (exemple : trou noir déjà présent)
 
//}
public boolean placerDesintegrateur(int ligne ,int colonne) {
 //ajoute un désintégrateur à l’endroit indiqué et retourne vrai si l’ajout s’est bien passé, ou faux sinon (exemple : désintégrateur déjà présent)

 if  (Cellules[ligne][colonne].desintegrateur) {
     Cellules[ligne][colonne].desintegrateur = true;
     return true;
}
 return false;
 }

/* public boolean supprimerJeton(int ligne, int colonne){
    //supprime le jeton de la cellule visée. Renvoie vrai si la suppression s’est bien déroulée, ou faux autrement (jeton absent)
  
    if (jetonCourant == null){ // si la case est vide, ca renvoit false pcq rien à supprimer
      return false ;  
}
  else {
      return true ;
  }
  }
  */
  
public Jeton recupererJeton(int ligne, int colonne){
    //enlève le jeton de la cellule visée et renvoie une référence vers ce jeton.

    Jeton a = Cellules[ligne][colonne].recupererJeton() ;
    Cellules[ligne][colonne].supprimerjeton();
    return a;
   
}










} 