/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Tabungan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabunganBulan = 100000;
        int selisih = 50000;
        int totalTabungan = 0;
        int bulanTarget = -1; 
        System.out.print("Masukkan jumlah bulan simulasi: ");
        int jumlahBulan = scanner.nextInt();
        System.out.println("\n--- Rincian Tabungan ---");

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            System.out.println("Bulan " + bulan + " : Rp" + tabunganBulan);
            totalTabungan += tabunganBulan;
            if (totalTabungan >= 1000000 && bulanTarget == -1) {
                bulanTarget = bulan;
            }
            tabunganBulan += selisih;
        }
        System.out.println("------------------------");
        System.out.println("Total Tabungan          : Rp" + totalTabungan);

        if (bulanTarget != -1) {
            System.out.println("Target Rp1.000.000 tercapai pertama kali pada Bulan ke-" + bulanTarget);
        } else {
            System.out.println("Target Rp1.000.000 belum tercapai dalam " + jumlahBulan + " bulan.");
        }
        scanner.close();
    }
}
    

