/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 * NAMA : SYIFA NAILLA NUHA
 * NIM  : 215150707111025
 * KELAS: TEKNOLOGI INFORMASI - C
 */
public class TugasPraktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider youhan = new CarRider("Bei Youhan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        
        CarData data = new CarData();
        data.addCar("SUV", "N 1111 AB", "Honda");
        data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        data.addCar("TRUCK", "N 3333 AB", "Suzuki");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(ming, data.carList.get(1), 9);
        arsip.Rent(youhan, data.carList.get(0), 3);
        arsip.Rent(ling, data.carList.get(1), 1);
        
        System.out.println("");
        
        arsip.info();
    }
    
}
