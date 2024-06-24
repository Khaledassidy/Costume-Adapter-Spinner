package com.example.costumespinner;

public class modelclass {
    int imageresource;
    String name;

    public modelclass(int imageresource, String name) {
        this.imageresource = imageresource;
        this.name = name;
    }


    public int getImageresource() {
        return imageresource;
    }

    public void setImageresource(int imageresource) {
        this.imageresource = imageresource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
