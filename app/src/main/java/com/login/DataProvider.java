package com.login;

/**
 * Created by aaldaeej on 4/28/2016.
 */
// the purpose of this class is to provide each row of data in the form of object

public class DataProvider {
    private String type;
    private String name;
    private String price;


    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public DataProvider(String type, String name, String price){
        this.name = name;
        this.type = type;
        this.price = price;




    }
}
