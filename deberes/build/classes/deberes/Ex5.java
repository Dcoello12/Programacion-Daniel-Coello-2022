package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex5 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa un any: ");
        int any = sc.nextInt();
        if (any % 4 ==  0 && any % 100 !=0 || any % 400 == 0) {
            System.out.println("És un any de trapás.");
        } else {
            System.out.println("No es un any de traspàs.");
        }
    }
}
