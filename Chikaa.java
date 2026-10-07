/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PraktikumPemdas;

/**
 *
 * @author AGNICHIKA
 */
public class Chikaa {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);

        System.out.println(x > y);

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        int totalHarga = 40000;
        int bayar = 50000;
        int kembalian = bayar - totalHarga;

        System.out.println("Total Harga" + totalHarga);
        System.out.println("Kembalian " + kembalian);
    }
}
    
    
