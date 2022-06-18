/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author NAILLA
 * NAMA : SYIFA NAILLA NUHA
 * NIM  : 215150707111025
 * KELAS: TEKNOLOGI INFORMASI - C
 */
public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant[] merc = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){ 
        Merchant[] daftarMerchant = new Merchant [DataMerchant.merc.length + 1];
        daftarMerchant[DataMerchant.merc.length] = merchant;
        
        System.arraycopy(DataMerchant.merc, 0, daftarMerchant, 0, DataMerchant.merc.length);  
        return daftarMerchant;
    }
    
    public static void tampilData(){
        for (Merchant merchant : merc) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
            System.out.println("Nama Produk     : " + merchant.getNamaProduk());
            System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
        }
    }
    
    public String cariMerchant(String nama){     
        
        return nama;
    }
    
    public void tampilMerchant(Merchant merchant){       
    }
    
    public void updateMerchant(Merchant merchant){
    }
}
