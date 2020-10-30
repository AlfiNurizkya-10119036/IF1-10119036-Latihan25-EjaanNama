/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Pengejaan Nama
 */

import java.util.Scanner;

public class IF110119036Latihan25 {

    /**
     * @param args the command line arguments
     */
    static final Scanner scan = new Scanner(System.in);
    String nama;

    private void masukkanNamaDepan(){
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scan.next();
    }

    private void tampilEjaanNama(){
        System.out.println("\nEjaan untuk \""+nama+"\" adalah : ");
        int num = 1;
        for (char ejaan : nama.toCharArray()){
            System.out.println("Huruf ke-"+(num++)+" : "+ejaan);
        }
    }

    public static void main(String[] args) {
        IF110119036Latihan25 data = new IF110119036Latihan25();
        data.masukkanNamaDepan();
        data.tampilEjaanNama();
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
