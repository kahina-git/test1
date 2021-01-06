public class TestEquipe {


    public static void main(String[] args) {
       Joueur tabJoueur[]=new Joueur[24];
       Equipe E1=new Equipe("Impact Montreal", tabJoueur,7, "145 ste-Laurent");
       
       tabJoueur[0]=new Joueur("kahina", 35, 1000);
       tabJoueur[1]=new Joueur("Aksel", 18, 500);
       tabJoueur[2]=new Joueur("Younes", 25, 2000);
       tabJoueur[3]=new Joueur("karim", 25, 2000);
       tabJoueur[4]=new Joueur("salim", 25, 2000);
       tabJoueur[5]=new Joueur("coco", 25, 2000);
      tabJoueur[6]=new Joueur("toto", 25, 2000);
      E1.afficherEquipe();
       Joueur J=new Joueur("TOTO", 55, 10);
      E1.recruterJoueur(J);
      // Joueur S=tabJoueur[0];

       //E1.renvoyerJoueur(S);
       E1.afficherEquipe();
   }
   
}
