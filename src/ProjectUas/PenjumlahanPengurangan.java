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

//Import package untuk method scanner
import java.util.Scanner;
public class PenjumlahanPengurangan {
    public static void main(String[] args) {
        //Deklarasi variabel
        int a = 100;
        int b = 25;
        int hasil = 0;

        //Inisiasi scanner agar bisa memasukkan inputan dari keyboard
         Scanner scanner = new Scanner(System.in);  {
            int pilihan;
            //Inisiasi perulangan
            do {
                // Tampilkan menu pilihan
                System.out.println("Menu Pilihan:");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("0. Keluar");
                
                // Input pilihan pengguna
                System.out.print("Masukkan pilihan Anda: ");
                pilihan = scanner.nextInt();//scanner hanya bisa menerima inputan angka karena menggunakan method nextInt(); dan disimpan di variabel pilihan

                //kondisi percabangan switch case yang diambil dari inputan "pilihan"
                switch (pilihan) {
                    case 1:
                        hasil = a + b;
                        System.out.println("Hasil penjumlahan: " + hasil); //output dari penjumlahan dari angka yang sudah ditetapkan sebelumnya
                        break;
                    case 2:
                        hasil = a - b;
                        System.out.println("Hasil pengurangan: " + hasil); //output dari penjumlahan dari angka yang sudah ditetapkan sebelumnya
                        break;
                    case 0:
                        System.out.println("Terima kasih, program selesai."); //memberikan pesan bahwa program akan berakhir
                        break;
                    default:
                        System.out.println("Pilihan Anda salah. Silakan coba lagi."); //jika pengguna memilih menu yang tidak sesuai dengan tampilan di layar
                        break;
                }
            } while (pilihan != 0); //Jika pengguna memilih menu 0 maka program akan berakhir
        }
    }
}

