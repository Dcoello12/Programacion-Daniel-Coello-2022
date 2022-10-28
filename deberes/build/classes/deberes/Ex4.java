package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex4 {

    private static final String MSG_1 = "Introdueix un numero del 1 al 12: ";
    private static final String MSG_2 = "El número introduit no es valid.";

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        int num = sc.nextInt();
        if (num <= 12) {
            switch (num) {
                case 1: System.out.println("Enero");
                break;
                
                case 2: System.out.println("Febrero");
                break;
                
                case 3: System.out.println("Marzo");
                break;
                
                case 4: System.out.println("Abril");
                break;
                
                case 5: System.out.println("Mayo");
                break;
                
                case 6: System.out.println("Junio");
                break;
                
                case 7: System.out.println("Julio");
                break;
                
                case 8: System.out.println("Agosto");
                break;
                
                case 9: System.out.println("Septiembre");
                break;
                
                case 10: System.out.println("Octubre");
                break;
                
                case 11: System.out.println("Noviembre");
                break;
                
                case 12: System.out.println("Diciembre");
                break;
            }
        } else {
            System.out.println(MSG_2);
        }
    }
}
