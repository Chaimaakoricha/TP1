import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {
      /*  //exercice1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier entier : ");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième entier : ");
        int b = scanner.nextInt();


        System.out.println("Somme : " + (a + b));
        System.out.println("Différence : " + (a - b));
        System.out.println("Produit : " + (a * b));

        if (b != 0) {
            System.out.println("Quotient : " + ((double) a / b));
        } else {
            System.out.println("Impossible de diviser par zéro.");
        }

        scanner.close();


        //exercice2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le rayon du cercle : ");
        double rayon = scanner.nextDouble();
        double surface = Math.PI * Math.pow(rayon, 2);
        System.out.println("Surface du cercle : " + surface);

        double perimetre = 2 * Math.PI * rayon;
        System.out.println("Périmètre du cercle : " + perimetre);

        scanner.close();

 //exercice 3
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        int a = scanner.nextInt();

        System.out.println("Entrez la valeur de b : ");
        int b = scanner.nextInt();

        System.out.println("Avant permutation : a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après permutation : a = " + a + ", b = " + b);

        scanner.close();


     //exercice 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un réel x : ");
        double x = scanner.nextDouble();

        System.out.println("Entrez un entier n : ");
        int n = scanner.nextInt();

        double resultat = Math.pow(x, n);

        System.out.println(x + " à la puissance " + n + " = " + resultat);

        scanner.close();


        //exercice 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        long factorielle = 1;

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        System.out.println("Factorielle de " + nombre + " = " + factorielle);

        scanner.close();

        //exercice 6
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.println("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.println("L'équation a une solution unique : x = " + solution);
        } else {
            if (b == 0) {
                System.out.println("L'équation a une infinité de solutions.");
            } else {
                System.out.println("L'équation n'a pas de solution.");
            }
        }

        scanner.close();


        //exercice 7


        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la valeur de a : ");
        double a = scanner.nextDouble();

        System.out.println("Entrez la valeur de b : ");
        double b = scanner.nextDouble();

        System.out.println("Entrez la valeur de c : ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("L'équation a deux solutions réelles distinctes : x1 = " + racine1 + ", x2 = " + racine2);
        } else if (discriminant == 0) {
            double racine = -b / (2 * a);
            System.out.println("L'équation a une solution réelle double : x = " + racine);
        } else {
            System.out.println("L'équation n'a pas de solution réelle.");
        }

        scanner.close();

  //exercice 8
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier entier : ");
        int a = Math.abs(scanner.nextInt());

        System.out.println("Entrez le deuxième entier : ");
        int b = Math.abs(scanner.nextInt());

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("PGCD des deux entiers : " + a);

        scanner.close();
*/





    }
}
