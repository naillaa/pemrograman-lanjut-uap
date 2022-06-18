/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 * NIM      : 215150707111025
 * Nama     : Syifa Nailla Nuha
 * Kelas    : Teknologi Informasi - E
 */
public class TugasPraktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai pegawai1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(pegawai1.toString());
        
        Pegawai pegawai2 = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(pegawai2.toString());
        
        Pegawai pegawai3 = new Sales("Tika", "350728490327424892344", 50, 50000);
        System.out.println(pegawai3.toString());
    }
    
}
