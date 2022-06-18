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
public class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;
    
    public Car(String carType, String polNum, String merk, boolean status){
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }
    
    public String getCarType(){
        return carType;
    }
    
    public String getPolNum(){
        return polNum;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public boolean isStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = Boolean.parseBoolean(status);
    }
}
