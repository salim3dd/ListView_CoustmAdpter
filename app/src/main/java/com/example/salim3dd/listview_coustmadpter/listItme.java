package com.example.salim3dd.listview_coustmadpter;

/**
 * Created by Salim3DD on 5/12/2016.
 */
public class listItme {
    private int id;
    private String name;
    private String desc;

    public listItme(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
