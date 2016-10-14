package com.example.salim3dd.listview_coustmadpter;

/**
 * Created by Salim3DD on 5/27/2016.
 */
public class list_itme2 {
    public  int id;
    public String name;
    public String email;
    public int img;

    public list_itme2(int id, String name, String email, int img) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
