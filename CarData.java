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
public class CarData {
    ArrayList <Car> carList = new ArrayList<>();
    
    public void addCar(String carType, String polNum, String merk){
        Car car = new Car(carType, polNum, merk, true);
        carList.add(car);      
    }
    
    public void listOfCar(){
        System.out.println("--------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("--------------------------------");
        
        for (Car car : carList) {
            System.out.println("TIPE MOBIL  : " + car.getCarType());
            System.out.println("NO. POLISI  : " + car.getPolNum());
            System.out.println("MERK MOBIL  : " + car.getMerk());
            System.out.println("--------------------------------");
        }
    }
}
