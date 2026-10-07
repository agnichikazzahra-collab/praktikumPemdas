/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class MenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap (1-10)");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            System.out.println("----------------");
            switch (pilihan) {
                case 1:
                    System.out.print("Angka 1-10: ");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Bilangan Genap (1-10): ");
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i; // Akumulasi nilai 1 sampai 10
                    }
                    System.out.println("Hasil penjumlahan 1 hingga 10 = " + total);
                    break;
                case 4:
                    System.out.println("Segitiga Bintang:");
                    // Nested Loop untuk membuat pola segitiga
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-5.");
            }
        } while (pilihan != 5);
        scanner.close();
    }
}   
