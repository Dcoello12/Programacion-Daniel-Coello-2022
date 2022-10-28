package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3k {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int numero = sc.nextInt();
        System.out.print("Introdueix un altre número: ");
        int numero2 = sc.nextInt();
        if (numero > numero2) {
            if (numero % numero2 == 0) {
            System.out.print("És múltiple.");
            } else {
                System.out.print("El nombre introduot no es multiple del primer nombre");
            }
        } else  {
            System.out.print("El primer nombre ha de ser més gran que el segon.");
        }
    }
}
