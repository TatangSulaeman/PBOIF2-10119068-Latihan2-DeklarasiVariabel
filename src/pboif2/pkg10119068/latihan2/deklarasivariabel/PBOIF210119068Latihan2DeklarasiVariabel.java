/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan2.deklarasivariabel;

/**
 *
 * @author amtat
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Deklarasi dan pengaksesan variabel
 */
public class PBOIF210119068Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel Logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}
