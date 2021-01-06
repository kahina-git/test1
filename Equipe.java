public class Equipe {
    String nomEquipe;
    Joueur tabJoueur[];
    int nbJoueurs;
    String siege;
    
    public Equipe (String nomEquipe, Joueur tabJoueur[], int nbJoueurs,String siege)
    {
        this.nomEquipe=nomEquipe;
        this.nbJoueurs=nbJoueurs;
        this.tabJoueur=tabJoueur;
        this.siege=siege;
    }

    int recruterJoueur(Joueur J)
    {
        if (tabJoueur.length<24)
        {
          nbJoueurs=nbJoueurs+1;
          //tabJoueur.length=tabJoueur.length+1;
          //int x=tabJoueur.length;
          tabJoueur[tabJoueur.length+1]=J; 
        }
return nbJoueurs;
    }
int renvoyerJoueur(Joueur j)
{
    nbJoueurs--;
for (int i=0;i<tabJoueur.length;i++)
{
    if(tabJoueur[i].nomJoueur==j.nomJoueur)
    {
        tabJoueur[i]=tabJoueur[i+1];
    }

}

return nbJoueurs;
}

public void afficherEquipe()
    {
System.out.println("Nom de l'equipe:"+nomEquipe+" ,SIEGE: "+siege);

        for (int i=0;i<tabJoueur.length;i++)
            tabJoueur[i].afficherJoueur();
     }


}
