/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agnichika;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class Agnichika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double jumlahHarta;
        double nisabSekarang;
        double zakat;
       
        nisabSekarang = 2500000 * 85;
        
        System.out.print("Masukkan jumlah harta yang anda miliki: Rp ");
        jumlahHarta = input.nextDouble();
        
        if (jumlahHarta >=nisabSekarang) {
            zakat = jumlahHarta * 0.025;
            
            System.out.println("Anda wajib melakukan zakat sebesar Rp " +zakat);
        } else {
            System.out.println("Anda belum wajib melakukan zakat");
            
        }
          
        input.close();
    }
}
