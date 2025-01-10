package com.mycompany.donkeyrace.model.classes;

import java.time.LocalDate;
import java.time.Period;

public class Donkey {
    // Attributes 
    private int id; 
    private String name; 
    private LocalDate birthdate; 
    private Breed breed; 
    private Owner owner; 
    
    // Constructor 
    public Donkey(int id, String name, LocalDate birthdate, Breed breed, Owner owner){
        this.id = id; 
        this.name = name; 
        this.birthdate = birthdate;
        this.breed = breed; 
        this.owner = owner; 
    }
    
    // Getters and setters 
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public void setBirthdate(LocalDate birthdate){
        this.birthdate = birthdate;
    }
    
    public Breed getBreed(){
        return breed;
    }
    
    public void setBreed(Breed breed){
        this.breed = breed; 
    }
    
    public Owner getOwner(){
        return owner;
    }
    
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    
    // Methods 
    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdate, currentDate);
        return period.getYears();
    }
    
    @Override
    public String toString(){
        return id + ". Name = " + name + " / Age = " + getAge() + " / Owner = ";
    }
}
