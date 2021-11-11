package com.example.recyclerviewapplication;

public class DataItems {
   private String desc;
    private int img;

    public DataItems(){

    }

    public DataItems(String desc, int img) {
        this.desc = desc;
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public int getImg() {
        return img;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
