/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Healer extends Character{
    private int HP;
    
    public Healer(int defense, int attack, int HP) {
        super(defense, attack, HP);
        this.HP = HP;
    }
    public void heal(){
        System.out.println("Menggunakan skill Heal.");
        this.HP += 25;
    }
    
    @Override
    public int getHP(){
        return HP;
    }

    @Override
    public boolean attack() {
        double number = 1 + (Math.random() * 10);
        return number > 1 && number <= 8.5;
    }    
}

