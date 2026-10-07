/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
public class PenjualanKantinArray {

    public static void main(String[] args) {
        int[] penjualan = {25, 30,18, 40, 35, 45, 50};
        int total = 0;
        int tertinggi = penjualan[0];
        int terendah = penjualan[0];
        int hariMinimal30 = 0;

        for (int p : penjualan) {
            total += p;
            if (p > tertinggi) {
                tertinggi = p;
            }
            if (p < terendah) {
                terendah = p;
            }
            if (p >= 30) {
                hariMinimal30++;
            }
        }
        double rataRata = (double) total / penjualan.length;

        System.out.println("Total Penjualan: " + total);
        System.out.println("Rata-rata Penjualan: " + rataRata);
        System.out.println("Penjualan Tertinggi: " + tertinggi);
        System.out.println("Penjualan Terendah: " + terendah);
        System.out.println("Jumlah Hari Penjualan Minimal 30: " + hariMinimal30);
    }
}
    
