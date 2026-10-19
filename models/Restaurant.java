package models;
import java.util.*;

public class Restaurant {
    private static int nextRestaurantId=0;
    private int resataurantId;
    private String name;
    private String location;
    private List<MenuItem> menu= new ArrayList<>();

    public Restaurant(String name, String location){
        this.name= name;
        this.location= location;
        this.resataurantId=++ nextRestaurantId;
    
    }

    public String getName(){
        return name;
    }

    public void SetName(String n){
        name= n;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String loc) {
        location = loc;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public List<MenuItem> getMenu() {
        return menu;
    }



}
