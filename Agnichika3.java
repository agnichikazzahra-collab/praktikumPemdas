/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Agnichika3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Deklarasi variabel
        int angkaRahasia, tebakan, percobaan;
        String word;
        
        // Output awal % input konfirmasi
        System.out.println("halo! selamat datang di permainan tebak angka");
        word = scanner.nextLine();
        
        System.out.println("oke! aku jelasin dulu ya aturan permainan ini, jadi di permainan ini kamu yang menebak angka dan aku yang memilih angkanya?");
        word = scanner.nextLine();
        
        System.out.println("oke! silahkan tebak angka dari 1-100 lalu masukkan angka yang kamu tebak ingat!! jangan sampai lebih dari 7 kali ya");
        
        // Inisialisasi variabel permainan
        angkaRahasia = 57;
        percobaan = 0;
        
        // Perulangan selama percobaan !=7
        while (percobaan != 7){
            tebakan = scanner.nextInt();
            percobaan = percobaan + 1;
            
            if (tebakan < angkaRahasia){
                System.out.println("terlalu kecil");
            } else {
                if (tebakan > angkaRahasia) {
                } else {
                    System.out.println("benar");
                    break; // Keluar dari loop jika tebakan benar
                }
            }
        }
        
        // Pesan jika percobaan mencapai batas maksimum (7)
        if (percobaan == 7) {
            System.out.println("maaf jawaban yang kamu berikan lebih dari 7 kali");
        }
        
        scanner.close();
    }
}
