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
public class TugasPraktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        System.out.println("Selamat Datang di Erigo Store Malang\n\n"
                         + "silahkan masukkan tipe dan jumlah baju yang anda inginkan\n"
                         + "A = Rp 100,000.00;\n"
                         + "B = Rp 125,000.00;\n"
                         + "C = Rp 175,000.00;\n");
        System.out.print("Tipe baju     : ");
        String tipe = input.nextLine();
        System.out.print("Jumlah item   : ");
        int item = input.nextInt();
        ErigoMalang beli = new ErigoMalang(tipe, item);
        beli.print();
    }
    
}
