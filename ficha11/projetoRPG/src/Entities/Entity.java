package Entities;

abstract class Entity {

    private String name;
    private double hp;
    private double strength;

    public Entity(String name){

        this.name =name;
    }

    public Entity(String name, double hp, double strength){
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }
    public abstract void showDetails();


    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getStrength(){
        return strength;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }
}
