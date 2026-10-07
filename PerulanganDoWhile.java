/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class PerulanganDoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        do{
            System.out.print("Masukkan angka (0 untuk berhenti):");
            angka = input.nextInt();
            System.out.println("Anda masukkan: "+ angka);
        }while (angka != 0);
        System.out.println("Program selesai.");
    }
        }
        
                