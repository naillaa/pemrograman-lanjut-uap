
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class TugasPraktikum8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int karakter = 0;
        Scanner input = new Scanner(System.in);
        Character titan = new Titan(0, 45, 200);
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukan nama player : ");
        nama = input.nextLine();
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan : ");
                System.out.println("1. Magician");
                System.out.println("2. Healer");
                System.out.println("3. Warrior");
                karakter = input.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Tolong masukkan angka !");
                input.next();
            }  
        } 
        while (karakter == 0);
        
        System.out.println("Selamat datang, " + nama);
        
        int a = 1;
        String pemenang = null;
        switch(karakter){
            case 1:
                Magician char1 = new Magician(10, 60, 100);
                char1.info();
                
                while(char1.getHP() != 0 && titan.getHP() != 0){
                    System.out.printf("============ TURN %d ============\n", a);
                    if(titan.attack()){
                        char1.receiveDamage(titan.getAttack());
                    } else if(char1.attack()){
                        titan.receiveDamage(char1.getAttack());
                    }
                    System.out.println("Enemy's HP\t: " + titan.getHP());
                    System.out.println(nama +"'s HP\t: " + char1.getHP());
                    a++;
                }
                
                if(titan.getHP() == 0){
                    pemenang = nama;
                } else{
                    pemenang = "Titan";
                }
                
                System.out.println("==================================");
                System.out.println(pemenang + " Menang\n");
                System.out.println("============= PLAYER =============");
                char1.info();
                System.out.println("============= MUSUH ==============");
                titan.info();
                
                break;
            case 2:
                Healer char2 = new Healer(10, 10, 70);
                char2.info();
                
                while(char2.getHP() != 0 && titan.getHP() != 0){
                    System.out.printf("============ TURN %d ============\n", a);
                    if(a % 2 == 0){
                        char2.heal();                       
                    }
                    
                    if(titan.attack()){
                            char2.receiveDamage(titan.getAttack());
                        } else if(char2.attack()){
                            titan.receiveDamage(char2.getAttack());
                    }
                    
                    System.out.println("Enemy's HP\t: " + titan.getHP());
                    System.out.println(nama +"'s HP\t: " + char2.getHP());
                    a++;
                }
                
                if(titan.getHP() == 0){
                    pemenang = nama;
                } else{
                    pemenang = "Titan";
                }
                
                System.out.println("==================================");
                System.out.println(pemenang + " Menang\n");
                System.out.println("============= PLAYER =============");
                char2.info();
                System.out.println("============= MUSUH ==============");
                titan.info();
                
                break;
            case 3:
                Warrior char3 = new Warrior(30, 25, 80);
                char3.info();
                
                while(char3.getHP() != 0 && titan.getHP() != 0){
                    System.out.printf("============ TURN %d ============\n", a);
                    if(titan.attack()){
                        char3.receiveDamage(titan.getAttack());
                    } else if(char3.attack()){
                        titan.receiveDamage(char3.getAttack());
                    }
                    System.out.println("Enemy's HP\t: " + titan.getHP());
                    System.out.println(nama +"'s HP\t: " + char3.getHP());
                    a++;
                }
                
                if(titan.getHP() == 0){
                    pemenang = nama;
                } else{
                    pemenang = "Titan";
                }
                
                System.out.println("==================================");
                System.out.println(pemenang + " Menang\n");
                System.out.println("============= PLAYER =============");
                char3.info();
                System.out.println("============= MUSUH ==============");
                titan.info();
                
                break;
        }
    }
}
