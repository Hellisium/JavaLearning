import java.util.Scanner;

class Conversion{
    public static void main (String[] args) {
        //Notre objet scanner
        Scanner sc = new Scanner(System.in);

        //initialisation des variables
        double aConvertir, convertit = 0;
        char reponse =' ' , mode = ' '; 

        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET FAHRENHEIT");
        System.out.println("------------------------------------------");

        do { //tant que reponse = o #Boucle Principale

            do { //tant que reponse n'est pas O ou N
                mode =' ';
                System.out.println("Choissiez le mode de conversion : ");
                System.out.println("1 - Convertisseur Celsius - Fahrenheit");
                System.out.println("2 - Convertisseur Fahrenheit - Celsius");
                mode = sc.nextLine().charAt(0);

                if(mode !='1' && mode !='2')
                    System.out.println("Mode inconnu, veuillez choisir un autre mode");
            }while (mode != '1' && mode != '2');

            //Saisie de la température à convertir
            System.out.println("Température à convertir : ");
            aConvertir = sc.nextDouble();
            //On vide la ligne lue
            sc.nextLine();

            //Conversion selon le mode choisi
            if (mode== '1') {
                convertit = ((9.0/5.0) * aConvertir + 32 );
                System.out.println(aConvertir + " °C correspnd à : ");
                System.out.println(arrondi(convertit, 2) + " °F.");
            }
            else {
                convertit = ((aConvertir - 32) * 5) / 9 ;
                System.out.println(aConvertir + " °F correspnd à : ");
                System.out.println(arrondi(convertit, 2) + " °C.");
            }

            // On recommence ?
            do{
                System.out.println("Souhaitez-vous convertir une autre température ?  (O/N)");
                reponse = sc.nextLine().charAt(0);

            }while(reponse!='o' && reponse!='n');

        }while(reponse == 'o');

    System.out.println("Merci de m'avoir utilisé ! ");
    }

    private static Double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10,B) + .5)) / Math.pow(10, B);
    }
}