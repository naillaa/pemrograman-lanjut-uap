/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author NAILLA
 */

class Persegi {
    int sisi;
    int luas;
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    public int getSisi(){
        return sisi;
    }
    void luas() {
        luas = sisi * sisi;
    }
}

class Segitiga {
    int alas;
    int tinggi;
    int luas;
    public void setAlas(int alas){
        this.alas = alas;
    }
    public int getAlas(){
        return alas;
    }
     public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }
    void luas() {
        luas = alas * tinggi / 2;
    }
}

class Lingkaran {
    double jari;
    double l;
    double luas;
    public void setJati(double jari){
        this.jari = jari;
    }
    public double getJari(){
        return jari;
    }
    void luas() {
        if (jari % 7 == 0){
            l = 22 / 7 * Math.pow(jari, 2);
        } else {
            l = 3.14 * Math.pow(jari, 2);
        }
        luas = (int) l;
    }
}

public class TugasPraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                Persegi persegi = new Persegi();
                persegi.sisi = input.nextInt();
                persegi.luas(); 
                System.out.println(persegi.luas);
                break;
            case 2:
                Segitiga segitiga = new Segitiga();
                segitiga.alas = input.nextInt();
                segitiga.tinggi = input.nextInt();
                segitiga.luas();
                System.out.println(segitiga.luas);
                break;
            case 3:
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.jari = input.nextInt();
                lingkaran.luas();
                System.out.println(lingkaran.luas);
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }   
}
