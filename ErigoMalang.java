/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class ErigoMalang {
    private String tipe;
    private int jumlahItem;
    private double harga;
    final int a = 100_000;
    final int b = 125_000;
    final int c = 175_000;
    
    ErigoMalang(String tipe, int jumlahItem){
        this.tipe = tipe;
        this.jumlahItem = jumlahItem;
    }
    
    void bajuA(){
        harga = a * jumlahItem;
        if (jumlahItem > 100){
            harga = 95_000 * jumlahItem;
        }
    }
    
    void bajuB(){
        harga = b * jumlahItem;
        if (jumlahItem > 100){
            harga = 120_000 * jumlahItem;
        }
    }
    
    void bajuC(){
        harga = c * jumlahItem;
        if (jumlahItem > 100){
            harga = 160_000 * jumlahItem;
        }
    }
    
    public void print(){
        if (tipe.equalsIgnoreCase("A")){
            bajuA();
        } else if (tipe.equalsIgnoreCase("B")){
            bajuB();
        } else if (tipe.equalsIgnoreCase("C")){
            bajuC();
        }
        if (jumlahItem > 100)
            System.out.println("\nselamat anda mendapatkan diskon karena membeli lebih dari 100 item");
        System.out.printf("\nTotal Bayar   : Rp %,-2.2f\n", harga);
    }
}
