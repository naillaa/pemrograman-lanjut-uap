/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class MahasiswaFilkom extends Manusia {
    private String NIM;
    private static double IPK;
    
    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK){
        super(nama, NIK, jenisKelamin, menikah);  
        this.NIM = NIM;
        MahasiswaFilkom.IPK = IPK;
    }
    
    public String getNIM(){
        return NIM;
    }
    
    public double getIPK(){
        return IPK;
    }
    
    public String getStatus(){
        String angkatan = getNIM().substring(0, 2);
        int prodi = Integer.parseInt(getNIM().substring(6, 7));
        String namaProdi = null;
        
        switch(prodi){
            case 2:
                namaProdi = "Teknik Meniup Gelembung";
                break;
            case 3:
                namaProdi = "Teknik Berburu Ubur Ubur";
                break;
            case 4:
                namaProdi = "Sistem Perhamburgeran";
                break;
            case 6:
                namaProdi = "Pendidikan Chum Bucket";
                break;
            case 7:
                namaProdi = "Teknologi Telepon Kerang";
                break;
        }
        return namaProdi + ", 20" + angkatan;
    } 
    
    public static double getBeasiswa(){
        if (IPK >= 3 && IPK <= 3.5){
            return 50;
        } else if (IPK > 3.5){
            return 75;
        } else{
           return 0; 
        }     
    }
    
    @Override
    public String toString(){
      String tostring = String.format("\nIPK\t\t: %.1f \nNIM\t\t: %s \nStatus\t\t: %s",getIPK(), getNIM(), getStatus());  
      return super.toString() + tostring;
    }
}
