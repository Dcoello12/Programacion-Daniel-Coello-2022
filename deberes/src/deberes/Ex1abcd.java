package deberes;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex1abcd {

    private static final String Nom = "Daniel";
    private static final String Cognom = "Coello";

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int lados1;
        System.out.println(Nom);
        System.out.println(Nom + Cognom);
        System.out.println(Nom);
        System.out.println();
        System.out.println(Cognom);
        System.out.println("Inserta el número de lados: ");
        lados1 = sc.nextInt();
        for (int i = 1; i <= lados1; i++) {
            for (int j = 1; j <= lados1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
