/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class SistemPresensi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;
        System.out.println("\n--- Input Presensi (1 = Hadir, 0 = Tidak Hadir) ---");
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + i + ": ");
            int status = scanner.nextInt();
            if (status == 1) {
                jumlahHadir++;
            } else if (status == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid! Dianggap Tidak Hadir (0).");
                jumlahTidakHadir++;
            }
        }
        double persentase = ((double) jumlahHadir / jumlahMahasiswa) * 100;
        System.out.println("\n==================================");
        System.out.println("--- HASIL REKAPITULASI PRESENSI ---");
        System.out.println("Jumlah Hadir       : " + jumlahHadir + " mahasiswa");
        System.out.println("Jumlah Tidak Hadir : " + jumlahTidakHadir + " mahasiswa");
        System.out.printf("Persentase Kehadiran: %.2f%%\n", persentase);
        System.out.print("Status Kelas       : ");
        if (persentase >= 75.0) {
            System.out.println("Memenuhi Syarat");
        } else {
            System.out.println("Tidak Memenuhi Syarat");
        }
        System.out.println("==================================");
        scanner.close();
    }
}
    

