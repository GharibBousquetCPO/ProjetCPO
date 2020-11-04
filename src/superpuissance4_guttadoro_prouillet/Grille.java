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
// va renvoyer vrai si grille pleine
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
 
public boolean  etreGagnantePourJoueur(Joueur){
   
}
 
public void tasserGrille(int){
   
}
public boolean colonneRemplie(){
   
}
 
public boolean placerTeleporteur(int, int){
   
}
 
public boolean  placerTrouNoir(int, int ){
 
}
 
public boolean supprimerJeton(int, int){
   
   
}
 
public Jeton recupererJeton(int, int){
   
}










} 