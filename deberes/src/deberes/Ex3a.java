package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex3a {
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Posa un número: ");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.print("El número introduit és negatiu.");
        } else {
            System.out.print("El número introduit és positiu");
        }
        
    }
}
