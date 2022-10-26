package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3b {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un número més gran que 35: ");
        int numero = sc.nextInt();
        if (numero > 35)
            System.out.print("El nombre introduit és més gran que 35.");
        else
            System.out.print("El número no és més gran que 35.");
    }
}
