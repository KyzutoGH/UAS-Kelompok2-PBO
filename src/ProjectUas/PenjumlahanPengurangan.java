/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ProjectUas;

/**
 *
 * @author Asshyffatul Aina Ni'mah
 * 22104410044
 */
import java.util.Scanner;
public class PenjumlahanPengurangan {
    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil = 0;
         
         Scanner scanner = new Scanner(System.in);  {
            int pilihan;
            
            do {
                // Tampilkan menu pilihan
                System.out.println("Menu Pilihan:");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("0. Keluar");
                
                // Input pilihan pengguna
                System.out.print("Masukkan pilihan Anda: ");
                pilihan = scanner.nextInt();
                
                switch (pilihan) {
                    case 1:
                        hasil = a + b;
                        System.out.println("Hasil penjumlahan: " + hasil);
                        break;
                    case 2:
                        hasil = a - b;
                        System.out.println("Hasil pengurangan: " + hasil);
                        break;
                    case 0:
                        System.out.println("Terima kasih, program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan Anda salah. Silakan coba lagi.");
                        break;
                }
            } while (pilihan != 0);
        }
    }
}

