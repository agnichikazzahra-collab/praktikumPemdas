/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class FrekuensiWudhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlahMahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("frekuensiWudhu : ");
        int frekuensiWudhu = input.nextInt();
        System.out.print("airPerWudhu (liter) :");
        double airPerWudhu = input.nextDouble();
        
        // Perhitungan awal
        double totalAirAwal = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        // Perhitungan penghematan 15%
        double persentasePenghematan = 0.15;
        double jumlahPenghematan = totalAirAwal * persentasePenghematan;
        double totalAir = totalAirAwal - jumlahPenghematan;
        
        System.out.println("\n===HASIL===");
        System.out.println("totalAirAwal : " + totalAirAwal + "liter");
        System.out.println("air yang dihemat (15% : " + jumlahPenghematan + "liter");
        System.out.println("totalSetelahHemat : " + totalAir + "liter");
        input.close();
        
    }
}
