/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Faktorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        long faktorial = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println();
        System.out.println(n + "! = " + faktorial);
        scanner.close();
    }
}
    

