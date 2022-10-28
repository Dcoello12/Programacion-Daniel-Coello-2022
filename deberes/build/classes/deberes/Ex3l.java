package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3l {

    private static final int quota = 6;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuanst llitres heu gastat?");
        double llitres = sc.nextInt();
        if (llitres <= 50) {
            System.out.println("La factura és de " + quota + "€");
        } else {
            if (llitres > 50 && llitres < 200) {
                llitres = llitres * 0.1 + quota;
                System.out.println("La factura és de " + llitres + "€");
            } else {
                if (llitres > 200) {
                    llitres = llitres * 0.3 + quota;
                    System.out.println("La factura és de " + llitres + "€");
                }
            }
        }
    }
}
