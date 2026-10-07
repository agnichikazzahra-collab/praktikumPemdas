/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class PersegiPanjang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah baris: ");
int baris = input.nextInt();
System.out.print("Masukkan jumlah kolom: ");
int kolom = input.nextInt();

for (int i= 1; i <= baris; i++){
        for (int j= 1; j <= kolom; j++){
    System.out.print("*");
}
    System.out.println();
}
    }
}
