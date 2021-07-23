package Exercice_heritage;

abstract class Employe {

    private String nom;
    private String prenom;

    public Employe(String nom, String prenom) {
    }
    public String getNom() {
        return  getTitre() + nom + prenom ;
    }

    public abstract double calculerSalaire();

    public String getTitre(){return "L'employé";}

    public class ManutARisque {
    }
}



abstract class Commercial extends Employe {
    private double chiffreAffaire;

    public Commercial(String nom, String prenom, double chiffreAffaire) {
        super(nom, prenom);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }
}



class Vendeurs extends Commercial{
    
    private final static double pourcentage_vendeurs =0.2;
    private final static int bonus_vendeurs = 400;

    public Vendeurs(String nom, String prenom, double chiffreAffaire) {
        super(nom, prenom, chiffreAffaire);
    }
    
    public double calculerSalaire(){
        return (pourcentage_vendeurs*getChiffreAffaire()) + bonus_vendeurs;
    }

    public String getTitre(){return "Le vendeur";}
}

class Representant extends Commercial{

    private final static double pourcentage_representants = 0.2;
    private final static int bonus_representants = 800;

    public Representant(String nom, String prenom, double chiffreAffaire) {
        super(nom, prenom, chiffreAffaire);
    }

    public String getTitre(){return "Le représentant";}

    public double calculerSalaire() {return (pourcentage_representants*getChiffreAffaire()) + bonus_representants;}
}


class Production extends Employe{
    private static final double facteurUnite = 5.0;
    private int unite ;

    public Production(String nom, String prenom, int unites) {
        super(nom, prenom);
    }
    
    public String getTitre(){return "La production";}
    
    public double calculerSalaire() {
        return unite * facteurUnite;
    }
}

class Manutentionnaire extends Employe{
    private static final int facteurHeureTravail = 65;
    private int heureTravaile;

    public Manutentionnaire(String nom, String prenom, int heureTravaile) {
        super(nom, prenom);

        this.heureTravaile = heureTravaile;
    }

    public String getTitre(){return "Le manutentionnaire";}
    
    public double calculerSalaire(){
        return heureTravaile * facteurHeureTravail;
    }

}
    class ProdARisque extends Production implements ARisque{

        public ProdARisque(String nom, String prenom, int unites) {
            super(nom, prenom, unites);
        }

        public double calculerSalaire() {
            return super.calculerSalaire() + prime;
        }
    }

    class ManutARisque extends Manutentionnaire implements ARisque {

        public ManutARisque(String prenom, String nom, int heures) {
            super(prenom, nom, heures);
        }
    
        public double calculerSalaire() {
            return super.calculerSalaire() + prime;
        }
    }



