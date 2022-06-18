/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public class Titan extends Character{

    public Titan(int defense, int attack, int HP) {
        super(defense, attack, HP);
    }
    
    @Override
    public boolean attack() {
        double number = 1 + (Math.random() * 10);
        return number > 1 && number <= 4;
    }    
}
