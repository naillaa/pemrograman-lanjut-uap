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
public class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;
    
    public CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }
    
    public CarRider getRider(){
        return rider;
    }
    
    public Car getCar(){
        return car;
    }
    
    public int getRentDur(){
        return rentDur;
    }
}
