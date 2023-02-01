package com.kata;

public class Tamagotchi {

    int mood = 4;
    int hunger = 8;
    int energy = 4;
    

    public Tamagotchi() {
        this.mood = mood;
        this.hunger = hunger;
        this.energy = energy;
    }
    public int getMood() {
        return mood;
    }
    public void setMood(int mood) {
        this.mood = mood;
    }
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        this.energy = energy;
    }
    
    public void eat(){
        if(this.getHunger()>1)this.setHunger(this.getHunger()-2);
        
        if(this.getEnergy()<10) this.setEnergy(this.getEnergy()+1);
    } 

    public void sleep(){
        if(this.getEnergy()<10) this.setEnergy(this.getEnergy()+2);
    } 

    public void play(){
        if(this.getHunger()<10 && this.getEnergy()<10 && this.getMood()<10){
            this.setHunger(this.getHunger()+1);
            this.setEnergy(this.getEnergy()-1);
            this.setMood(this.getMood()+1);
        };
    }

}
