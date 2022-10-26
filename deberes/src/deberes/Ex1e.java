package deberes;

import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class Ex1e {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de filas: ");
        int numfilas = sc.nextInt();
        sc.close();

        System.out.println();
        for (int i = 1; i <= numfilas; i++) {
            for (int j = 1; j <= numfilas - i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (i * 2) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
