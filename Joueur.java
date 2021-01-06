public class Joueur
{
    String nomJoueur;
    int age;
    int nbButs;

    public Joueur(String nomJoueur, int age, int nbButs)
    {
        this.nomJoueur=nomJoueur;
        this.age=age;
        this.nbButs=nbButs;}


        public void getNomJoueur(String nomJoueur) {
            this.nomJoueur = nomJoueur;
        }
        public void setNomJoueur(String nomJoueur) {
            this.nomJoueur = nomJoueur;
        }

        public int getAge() {
            return age;
        }
       public int getNbButs() {
           return nbButs;
       }
       public void setAge(int age) {
           this.age = age;
       }
       public void setNbButs(int nbButs) {
           this.nbButs = nbButs;
       }
       public void afficherJoueur()
    {
        System.out.println("Nom Joueur :"+nomJoueur+" son age :"+age+"nombre de buts: "+nbButs);


    }
       
}