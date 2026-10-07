/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lulus= 0;
        int tidakLulus = 0;
        double totalNilai = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ":" );
            int nilai = input.nextInt();
            totalNilai += nilai;
            if(nilai >= 75){
                System.out.println("Status: Lulus");
                lulus++;
            } else{
                System.out.println("Status: Tidak Lulus");
                tidakLulus++;
            }
        }
        double rataRata = totalNilai / 5;
        System.out.println("\n--Rekapitulasi--");
        System.out.println("jumlah mahasiswa lulus: " + lulus);
        System.out.println("jumlah mahasiswa tidakLulus: " + tidakLulus);        
        System.out.println("rataRata nilai: " + rataRata);
        
        input.close();
    }
}
