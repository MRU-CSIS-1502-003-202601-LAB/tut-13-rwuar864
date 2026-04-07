package main;

public class Weapon extends Loot{
    private int damage;
    public Weapon (String name, String rarity, int damage){
        this.damage = damage;
        super(name, rarity);
    } 
    public String getEffectDescription(){
        return String.format("A %s %s that deals %d points of damage.", getName(), getRarity(), damage);
    }
    public String asCsvRow(){
        return String.format("Consumable,%s,%s,%d",getName(),getRarity(),damage);
    }
}
