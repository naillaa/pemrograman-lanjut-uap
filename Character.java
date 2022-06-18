/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAILLA
 */
public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    
    Character(int defense, int attack, int HP){
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    
    public int getDefense(){
        return defense;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public int getHP(){
        return HP;
    }
    
    public abstract boolean attack();
    
    public void receiveDamage(int damage){
        this.HP += defense - damage;
        if(this.HP <= 0){
            HP = 0;
        }    
    }
    
    public void info(){
        System.out.printf("------------ STATUS ------------\nRole\t: %s \nHP\t: %d \nAttack\t: %d \nDefense\t: %d \n", getClass().getSimpleName(), getHP(), getAttack(), getDefense());
    }
    
}
