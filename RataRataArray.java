/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
public class RataRataArray {

    public static void main(String[] args) {
        int[]nilai = {80, 75, 90, 85, 70};
        int total = 0;
        for (int i = 0; 1 < nilai.length; i++){
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        
        System.out.println("Total = " + total);
        System.out.println("rataRata = " + rataRata);
        
    } 
}
