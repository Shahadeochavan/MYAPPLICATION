package com.nextech.myschool;

/**
 * Created by welcome on 7/22/2016.
 */
public class UserContact  {
    private String name;
    private  String number;
    private int Id;
    public UserContact(int Id,String name,String number){
        this.Id=Id;
        this.name=name;
        this.number=number;
    }

    public UserContact() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}