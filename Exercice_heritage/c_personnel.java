package Exercice_heritage;

public class c_personnel{

    private Employe[] staff;
    private int nbEmploye;
    private static final int maxEmploye = 200;
    
    public c_personnel() {
        staff = new Employe[maxEmploye];
        nbEmploye = 0;
    }

    public void ajouterEmploye(Employe e){
        ++nbEmploye;
        if (nbEmploye <= maxEmploye){
            staff[nbEmploye -1 ] = e;
        }else{
            System.out.println("Pas plus de " +maxEmploye+" employés.");
        }
    }

    public double salaireMoyen(){
        double somme = 0.0;
        for (int i =0 ; i < nbEmploye ; i++){
            somme += staff[i].calculerSalaire();
        }

        return somme / nbEmploye ;
    }

    public void calculerSalaire() {
        for (int i =0 ; i < nbEmploye ; i++){
            System.out.println(staff[i].getNom() + " gagne "+ staff[i].calculerSalaire() + " euros");
        }
    }
}
