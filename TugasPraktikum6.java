/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class TugasPraktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia man1 = new
        Manusia("Aku", "3923842934", true, true);
        System.out.println(man1.toString() + "\n");
        
        MahasiswaFilkom mhs1 = new
        MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        System.out.println(mhs1.toString() + "\n");
        
        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.toString() + "\n");

        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.toString() + "\n");
    }
    
}
