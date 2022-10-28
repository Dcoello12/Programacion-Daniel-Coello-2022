package deberes;

import java.util.Scanner;

/**
 * Nom: Daniel Cognoms: Coello Murillo INS Manuel Vázquez Montalbán Data
 * d'edició: 26/10/22 Nom del cicle formatiu: ASIX Nom del mòdul: Promació
 * bàsica
 */
public class Ex6 {

    private static final int dia31 = 31;
    private static final int dia30 = 30;
    private static final String MSG_2 = "El número introduit no es valid.";

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int visiesto;
        System.out.println("Posa un any: ");
        int any = sc.nextInt();
        System.out.println("Posa el número del més del 1 al 12: ");
        int mes = sc.nextInt();
        if (mes <= 12) {
            switch (mes) {
                case 1:
                    System.out.println("El més es Gener de l'any " + any + " y té " + dia31);
                    break;

                case 2:
                    if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
                        visiesto = 29;
                        System.out.println("El més es Febrer de l'any " + any + " y té " + visiesto);

                    } else {
                        visiesto = 28;
                        System.out.println("El més es Febrer de l'any " + any + " y té " + visiesto);
                    }
                    break;

                case 3:
                    System.out.println("El més es Març de l'any " + any + " y té " + dia31);
                    break;

                case 4:
                    System.out.println("El més es Abril de l'any " + any + " y té " + dia30);
                    break;

                case 5:
                    System.out.println("El més es Maig de l'any " + any + " y té " + dia31);
                    break;

                case 6:
                    System.out.println("El més es Juny de l'any " + any + " y té " + dia30);
                    break;

                case 7:
                    System.out.println("El més es Juliol de l'any " + any + " y té " + dia31);
                    break;

                case 8:
                    System.out.println("El més es Agost de l'any " + any + " y té " + dia31);
                    break;

                case 9:
                    System.out.println("El més es Septembre de l'any " + any + " y té " + dia30);
                    break;

                case 10:
                    System.out.println("El més es Octubre de l'any " + any + " y té " + dia31);
                    break;

                case 11:
                    System.out.println("El més es Novembre de l'any " + any + " y té " + dia30);
                    break;

                case 12:
                    System.out.println("El més es Decembre de l'any " + any + " y té " + dia31);
                    break;
            }
        } else {
            System.out.println(MSG_2);
        }
    }
}
