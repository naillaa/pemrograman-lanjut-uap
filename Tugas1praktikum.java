/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author NAILLA
 */
public class Tugas1praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String angka = input.nextLine();
        System.out.println(selde(angka));
    }
    
    public static String selde(String angka){
        String a = "";
        int b = angka.length();
        
        while(b > 0){
            a += angka.charAt(b - 1);
            b--;
        }
        
        String selde;
        if (angka.equals(a)){
            selde = angka + " adalah selde.";
        } else{
            selde = angka + " bukan selde.";
        }
        return selde;
    }
}
