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
public class Sales extends Pegawai{
    private static int penjualan = 0;
    private static double komisi;
    
    public Sales(String nama, String noKTP, int penjualan, int komisi) {
        super(nama, noKTP);
        Sales.penjualan = penjualan;
        Sales.komisi = komisi;
    }
    
    public void setPenjualan(int penjualan){
        Sales.penjualan = penjualan;
    }
    
    public void setKomisi(double komisi){
        Sales.komisi = komisi;
    }
    
    public static int getPenjualan(){
        return penjualan;
    }
    
    public static double getKomisi(){
        return komisi;
    }   
    
    @Override
    public String toString(){
        double gaji = getPenjualan() * getKomisi();
        return String.format("Sales\t\t: %s \nNo. KTP\t\t: %s \nTotal Penjualan\t: %d \nBesaran Komisi\t: %.1f \nPendapatan\t: Rp %.1f\n", getNama(), getNoKTP(), Sales.getPenjualan(), Sales.getKomisi(), gaji);
    }
}
