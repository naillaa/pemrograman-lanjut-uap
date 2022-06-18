/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Pekerja extends Manusia{
    private static double gaji;
    private static double bonus;
    private static int jamKerja;
    private static int hariKerja;
    private String NIP;
    
    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIP = NIP;
        Pekerja.jamKerja = jamKerja;
        Pekerja.hariKerja = hariKerja;
    }   
    
    public void setGaji(double gaji){
        Pekerja.gaji = gaji;
    }
    
    public void setBonus(double bonus){
        Pekerja.bonus = bonus;
    }
    
    
    public void setNIP(String NIP){
        this.NIP = NIP;
    }
    
    public static double getGaji(){
        gaji = getHariKerja() * getJamKerja() * 15;
        return gaji;
    }
    
    public double getBonus(){       
        int hariLibur;
        if (getHariKerja() % 7 > 5){
            hariLibur = (getHariKerja() / 7) * 2 + 1;
        } else{
            hariLibur = (getHariKerja() / 7) * 2;
        }
        
        if (getJamKerja() > 7){
            bonus += (getHariKerja() - hariLibur) * ((getJamKerja()) - 7) * 7;
        }
        
        bonus += hariLibur * getJamKerja() * 20;
        
        return bonus;
    }
    
    public static double bonus(){
        return bonus;
    }
    
    public static int getJamKerja(){
        return jamKerja;
    }
    
    public static int getHariKerja(){
        return hariKerja;
    }
    
    public String getNIP(){
        return NIP;
    }
    
    public String getStatus(){
        int kantorCabang = Integer.parseInt(getNIP().substring(0, 1));
        int departemen = Integer.parseInt(getNIP().substring(6, 7));
        int cabang = Integer.parseInt(getNIP().substring(2, 3));
        String namaCabang = null;
        String namaDepartemen = null;
        
        switch(kantorCabang){
            case 1:
                namaCabang = "Mondstadt";
                break;
            case 2:
                namaCabang = "Liyue";
                break;
            case 3:
                namaCabang = "Inazuma";
                break;
            case 4:
                namaCabang = "Sumeru";
                break;
            case 5:
                namaCabang = "Fontaine";
                break;
            case 6:
                namaCabang = "Natlan";
                break;
            case 7:
                namaCabang = "Snezhnaya";
                break;
        }
        
        switch(departemen){
            case 1:
                namaDepartemen = "Pemasaran";
                break;
            case 2:
                namaDepartemen = "Humas";
                break;
            case 3:
                namaDepartemen = "Riset";
                break;
            case 4:
                namaDepartemen = "Teknologi";
                break;    
            case 5:
                namaDepartemen = "Personalia";
                break;
            case 6:
                namaDepartemen = "Akademik";
                break;
            case 7:
                namaDepartemen = "Administrasi";
                break;
            case 8:
                namaDepartemen = "Operasional";
                break;
            case 9:
                namaDepartemen = "Pembangunan";
                break;              
        }
        return namaDepartemen + ", " + namaCabang + " cabang ke-" + cabang;
    }
    
    @Override
    public String toString(){
        String tostring = String.format("\nBonus\t\t: %.1f$ \nGaji\t\t: %.1f$ \nStatus\t\t: %s", getBonus(), getGaji(), getStatus());
        return super.toString() + tostring;
    }
}
