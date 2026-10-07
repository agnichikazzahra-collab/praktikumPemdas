/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Donasiramadan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Deklarasi Variabel
        String kodeTransaksi;
        String namaDonatur;
        String jenisDonatur;
        String jumlahDonasi;
        boolean isAnonim;
        // input data
        System.out.println("== input data donasi ramadan ==");
        
        System.out.print("nama donatur :");
        namaDonatur = input.nextLine();
        
        System.out.print("jenis donatur :");
        jenisDonatur = input.nextLine();
        
        System.out.print("jumlah donasi :Rp");
        double donasi = input.nextDouble();
        input.nextLine();
        
        System.out.print("kode transaksi:");
        String kode = input.nextLine();
        
        System.out.print("donasi anonim (true/false) :");
        boolean anonim = input.nextBoolean();
        
        // output hasil
        System.out.print("\n===DATA DONASI===");
        System.out.println("nama : + nama");
        System.out.println("jenis : + jenis"); 
        System.out.println("Donasi : Rp" + donasi);
        System.out.println("kode :"+ kode);
        System.out.println("anonim:" + anonim);
         input.close();
         
        
    }
}
