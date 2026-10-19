package models;

public class User{
    private int userId;
    private String name;
    private String address;

    public User(int userId,String name, String address){
        this.userId= userId;
        this.name= name;
        this.address= address;
    }

    public String getName(){
    return name;
}
public void SetName(String n){
    name= n;
}

public String getAddress(){
    return address;
}
public void setAddress(String a){
    address=a;
}



    
}

