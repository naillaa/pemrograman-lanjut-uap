/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author NAILLA
 * NAMA : SYIFA NAILLA NUHA
 * NIM  : 215150707111025
 * KELAS: TEKNOLOGI INFORMASI - C
 */
public class RentArchive {
    private ArrayList <CarRent> rentData = new ArrayList<>();
    
    public void Rent(CarRider rider, Car car, int rentDur){
        
        CarRent rent = new CarRent(rider, car, rentDur);
        rentData.add(rent);
        
        System.out.println();
        if (car.isStatus()){
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus("false");
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");  
            car.setStatus("true");
        }
    }
    
    public void info(){
        System.out.println("--------------------------------");
        System.out.println("INFORMASI PELANGGAN             ");
        System.out.println("--------------------------------");
        
        for (CarRent rent : rentData) {
            if (rent.getCar().isStatus()){
                System.out.println("NAMA PEMINJAM   : " + rent.getRider().getName());
                System.out.println("TIPE MOBIL      : " + rent.getCar().getCarType());
                System.out.println("NO. POLISI      : " + rent.getCar().getPolNum());
                System.out.println("LAMA RENTAL     : " + rent.getRentDur());
                System.out.println("--------------------------------");
            }
        }
    }    
}
