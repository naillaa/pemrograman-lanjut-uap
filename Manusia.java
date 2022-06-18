/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Manusia {
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    
    Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNIK(){
        return NIK;
    }
    
    public boolean getJenisKelamin(){
        return jenisKelamin;
    }
    
    public boolean getMenikah(){
        return menikah;        
    }
    
    public double getTunjangan(){
        if (jenisKelamin){
            if (menikah){
                return 25;
            } 
        } else if (jenisKelamin == false){
            if (menikah){
                return 20;
            }
        } 
        return 15;   
    }
    
    public double getPendapatan(){
        return getTunjangan() + MahasiswaFilkom.getBeasiswa() + Pekerja.getGaji() + Pekerja.bonus();
    }
    
    @Override
    public String toString(){
        String gender;
        
        if (jenisKelamin){
            gender = "Laki-Laki";
        } else{
            gender = "Perempuan";
        }
        
        String tostring = String.format("Nama\t\t: %s \nNIK\t\t: %s \nJenis Kelamin\t: %s \nPendapatan \t: %.1f$ ", getNama(), getNIK(), gender, getPendapatan());
        return tostring;
    }
}
