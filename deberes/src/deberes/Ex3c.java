package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3c {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número positiu més petit que 100: ");
        int numero = sc.nextInt();
        if (numero > 0 && numero < 100) {
            System.out.print("El nombre introduit està dins del barem.");
        } else {
            System.out.print("El número no està dins del barem.");
        }
    }
}
