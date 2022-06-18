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
public class PegawaiHarian extends Pegawai{
    private static double upahPerJam;
    private static int totalJam;
    
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);      
        PegawaiHarian.upahPerJam = upahPerJam;
        PegawaiHarian.totalJam = totalJam;
    }
    
    public void setUpahPerjam(double upahPerJam){
        PegawaiHarian.upahPerJam = upahPerJam;
    }
    
    public void setTotalJam(int totalJam){
        PegawaiHarian.totalJam = totalJam;
    }
    
    public static double getUpahPerJam(){
        return upahPerJam;
    }
    
    public static int getTotalJam(){
        return totalJam;
    }
    
    @Override
    public String toString(){
        double gaji;
        if(getTotalJam() <= 40){
                gaji = getUpahPerJam() * getTotalJam();
            } else {
                gaji = (getUpahPerJam() * 40) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5);
            }
        return String.format("Pegawai Harian\t: %s \nNo. KTP\t\t: %s \nUpah/jam\t: %.1f \nTotal Jam Kerja : %d \nPendapatan\t: Rp %.1f\n", getNama(), getNoKTP(), getUpahPerJam(), getTotalJam(), gaji);
    }
}
