package com.sibaamap.recyclerviewgirdlayout;

public class User {
    private int resouceImage;
    private String name;

    public User(int resouceImage, String name) {
        this.resouceImage = resouceImage;
        this.name = name;
    }

    public int getResouceImage() {
        return resouceImage;
    }

    public String getName() {
        return name;
    }

    public void setResouceImage(int resouceImage) {
        this.resouceImage = resouceImage;
    }

    public void setName(String name) {
        this.name = name;
    }
}
