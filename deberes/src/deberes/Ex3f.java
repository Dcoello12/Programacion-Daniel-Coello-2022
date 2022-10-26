package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3f {
    

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int numero = sc.nextInt();
        if (numero % 2 < 15) {
            System.out.print("El mòdul del nombre eś menor de 15.");
        } else {
            System.out.print("El mòduñ deñ nombre és mes granq que 15.");
        }
    }
}
