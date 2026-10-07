/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;

public class Agnichika2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jenisKendaraan;
        int lamaParkir;
        int tarifParkir;
        int tarifTambahan;
        int totalBiaya;
        
        System.out.print("jenis kendaraan: ");
        jenisKendaraan = input.nextLine();
        
        System.out.print("Terparkir berapa jam: ");
        lamaParkir = input.nextInt();
        
        if (jenisKendaraan.equals("motor")){
            tarifParkir = 2000;
            tarifTambahan = 1000;
        } else {
            tarifParkir = 5000;
            tarifTambahan = 2000;
        }
        
        totalBiaya = lamaParkir * tarifTambahan + tarifParkir;
        
        System.out.println("Total biaya parkir: Rp" + totalBiaya);
        
        input.close();
      }
}
