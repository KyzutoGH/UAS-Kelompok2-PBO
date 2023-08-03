/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package konterhp;

//untuk mengimpor NumberFormat dan Locale untuk format rupiah
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Muhammad Ikhsan - 22104410004
 * Teknik Informatika - Universitas Islam Balitar
 * 2022 - 2023
 * User - Swift Studio
 */
public class Main implements Pajak{
    //Deklarasi variabel privat
    private String vendor;
    private String tipe;
    private double harga;
    
    //Konstruktor dari kelas Main dan parameternya
    public Main(String vendor, String tipe, double harga){
        this.harga = harga;
        this.vendor = vendor;
        this.tipe = tipe;
    }
    
    @Override //metode ini mengganti metode yang sama dari superclass atau interface
    public double hitungAfterPajak(double harga){
        double ppn = 0.01; //inisiasi variabel ppn. Pajak 1%
        if(harga > 4000000){ //jika harga hape lebih dari 4 Juta
            ppn = 0.01; // Pajak 1%
        }else if (harga > 4200000 && harga < 4500000) { //jika harga hape lebih dari 4 Juta 200 Ribu dan kurang dari 4 Juta 500 Ribu
            ppn = 0.02; // Pajak 2%
        }else if(harga > 4500000){ // Jika harga hape lebih dari 4 Juta 500 
            ppn = 0.05; // Pajak 5%
        }
        return harga + (harga*ppn); //Mengembalikan nilai harga yang sudah dihitung dengan ppn
    }
    
    //Main class
    public static void main(String[] args) {
        Main[] hapekentang = { //deklarasi array dari beberapa hape
            new Main("Samsung", "A51", 5000000.00),
            new Main("Oppo", "Reno 5", 4400000.00),
            new Main("Xiaomi", "A1", 4100000.00)
        };
        //Untuk memberikan format rupiah
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id","ID"));
        
        //Perulangan perhitungan pajak dan output pada array dari hapekentang
        for (Main hapeketela : hapekentang){ // hapeketela adalah nama variabel yang akan merefrensikan setiap elemen dari array 
                                               //: hapekentang adalah total dari variabel
            double hitungAfterPajak = hapeketela.hitungAfterPajak(hapeketela.harga); //untuk memasukkan harga awal dan mengirim ke method hitungAfterPajak
            System.out.println("Vendor : "+hapeketela.vendor); //untuk menampilkan vendor dari array hapekentang
            System.out.println("Tipe : "+hapeketela.tipe); //untuk menampilkan tipe dari array hapekentang
            System.out.println("Harga : "+formatRupiah.format(hapeketela.harga)); //untuk menampilkan harga awal dari array hapekentang
            System.out.println("Harga Setelah Pajak : "+formatRupiah.format(hitungAfterPajak)); //Mengambil dari method hitungAfterPajak
            System.out.println(); //untuk memberikan enter pada setiap perulangan
        }
    }
}