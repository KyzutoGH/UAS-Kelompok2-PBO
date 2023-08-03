/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package konterhp;

/**
 *
 * @author Muhammad Ikhsan - 22104410004
 * Teknik Informatika - Universitas Islam Balitar
 * 2022 - 2023
 * User - Swift Studio
 */
public interface Pajak { //deklarasi interface bernama Pajak
    double PAJAK = 0.01; //deklarasi konstanta dalam interface
    
    double hitungAfterPajak(double harga);//deklarasi method dalam interface pajak
}
