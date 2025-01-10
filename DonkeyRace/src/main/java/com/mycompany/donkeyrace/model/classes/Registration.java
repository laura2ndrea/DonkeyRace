package com.mycompany.donkeyrace.model.classes;

import java.time.LocalDateTime;

public class Registration {
    // Attributes
    private int id; 
    private int racePosition; 
    private Donkey donkey; 
    private Race race; 
            
    // Constructor 
    public Registration(int id, Donkey donkey, Race race){
        this.id = id; 
        this.racePosition = 0; 
        this.donkey = donkey; 
        this.race = race; 
    }
    
    //Getters and setters 
    public int getId(){
        return id; 
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public int getRacePosition(){
        return racePosition; 
    }
    
    public void setRacePosition(int racePosition){
        this.racePosition = racePosition; 
    }
    
    public Donkey getDonkey(){
        return donkey; 
    }
    
    public void setDonkey(Donkey donkey){
        this.donkey = donkey;
    }
    
    public Race getRace(){
        return race; 
    }
    public void setRace (Race race){
        this.race = race; 
    }
}
