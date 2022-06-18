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
public class Pegawai {
    private String nama;
    private String noKTP;
    
    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNoKTP(String noKTP){
        this.noKTP = noKTP;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNoKTP(){
        return noKTP;
    }
    
    @Override
    public String toString(){
       return String.format("Nama\t\t: %s \nNo. KTP\t\t: %s ", getNama(), getNoKTP());         
    }
}
