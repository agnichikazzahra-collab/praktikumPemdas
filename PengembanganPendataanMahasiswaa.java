/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
import java.util.Scanner;
public class PengembanganPendataanMahasiswaa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][][] dataMahasiswa = {
            {
                {"Ana", "Baba", "Caca", "Dada", "Eni"},
                {"Fana", "Giga", "Hiha", "Ina", "Jaja"},
                {"Kaka", "Lala", "Mama", "Nana", "Opa"},
            },
            {
                {"Ani", "Bibi", "Cici", "Didik", "Efi"},
                {"Fani", "Galang", "Hilmi", "Ifa", "Joni"},
                {"Kinan", "Lili", "Muna", "Nafa", "Ozi"},
            },
            {
                {"Afi", "Boni", "Cecep", "Dora", "Eki"},
                {"Farin", "Gita", "Hana", "Ila", "Jani"},
                {"Keni", "Lani", "Mawar", "Nara", "Orin"},
            }
            };
        
        System.out.println("\n==============================");
        System.out.println("    HASIL DATA MAHASISWA 3D     ");
        System.out.println("================================");
        for (int i = 0; i < dataMahasiswa.length; i++){
            System.out.println("prodi" + (i+ 1) + ": ");
            for (int j = 0; j < dataMahasiswa[i].length; j++){
                System.out.print("kelas" + (j + 1) + ": ");
                for (int k = 0; k < dataMahasiswa[i][j].length; k++){
                    System.out.print(dataMahasiswa[i][j][k] + (k < dataMahasiswa[i][j].length - 1 ? "," : ""));
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("==============================");
        System.out.println("  FITUR PENCARIAN DAN STRING  ");
        System.out.println("==============================");
        System.out.print("cari nama Mahasiswa: ");
        String cari = sc.nextLine();
        
        boolean ketemu = false;
        for (int i =  0; i < dataMahasiswa.length; i++){
            for (int j = 0; j < dataMahasiswa[i].length; j++){
                for (int k = 0; k < dataMahasiswa[i][j].length; k++){
                    if (dataMahasiswa[i][j][k].equalsIgnoreCase(cari)){
                        ketemu = true;
                        System.out.println("\nKetemu! " + dataMahasiswa[i][j][k] + "ada di prodi" + (i + 1) + ", kelas" + (j + 1) + ",");
                        
                        System.out.println("-> jumlah hurufnya: " + dataMahasiswa[i][j][k].length());
                        System.out.println("-> huruf besar: " + dataMahasiswa[i][j][k].toUpperCase());
                        System.out.println("-> huruf kecil: " + dataMahasiswa[i][j][k].toLowerCase());
                        System.out.println("-> 3 huruf depan: " + dataMahasiswa[i][j][k].substring(0,3));
                    }
                }
            }
            if (!ketemu){
                System.out.println("\nMaaf, mahasiswa atas nama \"" + cari + "\" tidak ketemu.");
            }
            sc.close();
        }
    } 
    }
