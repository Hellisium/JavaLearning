package Exercice_heritage;

class Salaire{
    public static void main (String[] args) {
        c_personnel p = new c_personnel();
    
        p.ajouterEmploye(new Vendeurs("Pierre", "Business", 45));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", 20000));
        p.ajouterEmploye(new Production("Yves", "Bosseur", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 45));
        p.ajouterEmploye(new ManutARisque("Jean", "Flippe", 1000));
        p.ajouterEmploye(new ManutARisque("Al", "Abordage", 45));
    
        p.calculerSalaire();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " euros.");
    }
}
