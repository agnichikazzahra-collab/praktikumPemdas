/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
public class JumlahDataLulusArray {

    public static void main(String[] args) {
        int[] nilai = {80, 65, 90, 70, 85};
        
        int JumlahLulus= 0;
        
        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] >= 75){
                JumlahLulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus = " + JumlahLulus);
        
    }
}
