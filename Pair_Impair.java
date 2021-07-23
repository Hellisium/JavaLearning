import java.util.Scanner;

class PairImpaire {
    public static void main(String[] args){

        var sc = new Scanner(System.in);

        int nbr = ' ';

        System.out.println("Veuillez rentrer votre nombre : ");
        nbr = sc.nextInt();

        if ( nbr == 0 ){System.out.println("Le nombre est 0 donc est pair");}
        else if (nbr > 0 ){
            System.out.println(nbr+" est positif");
            if (nbr%2 == 0){
                System.out.println(nbr+" est pair");
            }
            else {
                System.out.println(nbr+" est impair");
            }
    
        }else {
            System.out.println(nbr+" est négatif");
        }
    }
}
