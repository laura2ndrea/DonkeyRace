package com.mycompany.donkeyrace.model.classes;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class Race {
    // Attributes 
    private int id; 
    private LocalDateTime raceDate; 
    private String place;
    private String status; 
    
    // Constructor
    public Race(int id, LocalDateTime raceDate, String place, String status){
        this.id = id; 
        this.raceDate = raceDate;
        this.place = place; 
        this.status = status; 
    }

    // Getters and setters 
    public int getId(){
        return id; 
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public LocalDateTime getRaceDate(){
        return raceDate; 
    }
    
    public void setRaceDate(LocalDateTime raceDate){
        this.raceDate = raceDate;
    }
    
    public String getPlace() {
        return place;
    }
    
    public void setPlace(String place){
        this.place = place; 
    }
    
    public String getStatus(){
        return status; 
    }
    
    public void setStatus(String status){
        this.status = status; 
    }
    
    // Methods 
    public void choosePlace(){
        String[] arrayPlace = {"1. Zone 1", "2. Zone 2", "3. Zone 3"}; 
        Stream<String> streamPlace = Arrays.stream(arrayPlace); 
        streamPlace.forEach(p -> System.out.println(p));
    }
    
    public void chooseStatus(){
        String[] arrayStatus = {"1. Scheduled", "2. Finished", "3. Canceled"};
        Stream<String> streamStatus = Arrays.stream(arrayStatus);
        streamStatus.forEach(s -> System.out.println(s)); 
    }
    
    @Override
    public String toString(){
        return id + ". Date = " + raceDate + " / Place = " + place;  
    }
}
