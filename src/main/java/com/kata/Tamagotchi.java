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
    
    public String eat(){
        if(this.getHunger()>1){this.setHunger(this.getHunger()-2);
        }
        if(this.getEnergy()<10){
        this.setEnergy(this.getEnergy()+1);
        return myEnergyIs(this.getEnergy());
        }
        return "Mis necesidades estan cubiertas, gracias";
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

    public String myEnergyIs(int value){
        if(value<3) return "(-_-)";
        if(value==0) return "(-_-) zZZ";
        if(value>=3) return "(:-|)";
        return null;
    }

    public String myMoodIs(int value){
        if(value<2) return "ఠ_ఠ";
        if(value>8) return ":-)";
        if(value<=8 && value >=2) return "(:-|)";
        return null;
    }

}
