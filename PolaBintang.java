/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class PolaBintang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            if (pilihan == 6) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan tinggi/ukuran: ");
                int n = scanner.nextInt();
                System.out.println("---------------------");
                switch (pilihan) {
                    case 1:
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = n; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        // 3. Persegi (n x n)
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 5:
                        for (int i = 1; i <= n; i++) {
                            for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        for (int i = n - 1; i >= 1; i--) {
                            for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else {
                System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-6.");
            }

        } while (true);
        scanner.close();
    }
}
    
