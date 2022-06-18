/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Manajer extends Pekerja{
    private int lamaKerja;
    
    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }
    
    public int getLamaKerja(){
        return lamaKerja;
    }

    @Override
    public double getBonus() {
        return super.getBonus() + ((super.getBonus() + Pekerja.getGaji()) * (30/100)); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String tostring = String.format("\nLama Kerja\t: %d", getLamaKerja());
        return super.toString() + tostring + " hari"; //To change body of generated methods, choose Tools | Templates.
    }
}
