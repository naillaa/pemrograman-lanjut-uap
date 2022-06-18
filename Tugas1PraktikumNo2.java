
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Tugas1PraktikumNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        int pergeseran = input.nextInt();
        teks = teks.toUpperCase();
        teks(teks,pergeseran);
        String a = teks(teks,pergeseran).substring(1, teks.length());
        System.out.println(teks(teks,pergeseran).charAt(0) + a.toLowerCase());
    }
    
    public static String teks(String hasilTeks, int pergeseran){
        String c = "";
        for (char karakterTeks : hasilTeks.toCharArray()){
                int a = 0;
                a = karakterTeks + pergeseran;
                char b = (char)a;
                c += Character.toString(b);
       }
        return c;
    }
    
}
