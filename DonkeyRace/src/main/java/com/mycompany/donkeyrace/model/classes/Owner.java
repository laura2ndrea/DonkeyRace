package com.mycompany.donkeyrace.model.classes;

public class Owner {
    // Attributes 
    private int id; 
    private String name; 
    
    // Constructor
    public Owner(int id, String name){
        this.id = id; 
        this.name = name; 
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
    
    public void SetName(String name){
        this.name = name; 
    }
    
    // Methods 
    @Override 
    public String toString(){
        return id + ". " + name; 
    }
}
