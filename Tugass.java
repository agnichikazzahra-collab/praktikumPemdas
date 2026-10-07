/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Tugass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka = ");
        int angka = input.nextInt();
        System.out.println("Output:");
        for (int i = 1; i <= 10; i++) {
        System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}
    

