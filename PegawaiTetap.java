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
public class PegawaiTetap extends Pegawai{
    private static double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        PegawaiTetap.upah = upah;
    }
    
    public void setUpah(double upah){
        PegawaiTetap.upah = upah;
    }
    
    public static double getUpah(){
        return upah;
    }
    
    @Override
    public String toString(){
        return String.format("Pegawai Tetap\t: %s \nNo. KTP\t\t: %s \nPendapatan\t: Rp %.1f\n", getNama(), getNoKTP(), getUpah());
    }
}
