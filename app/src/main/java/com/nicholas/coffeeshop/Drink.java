package com.nicholas.coffeeshop;

// 3. Jangan lupa buat object class untuk yang ingin ditampilkan dalam RecyclerView. Ini optional sih hehe
public class Drink {
    private String name, desc;
    private int imagesrc;
    private double price;

    public Drink(String name, String desc, int imagesrc, double price) {
        this.name = name;
        this.desc = desc;
        this.imagesrc = imagesrc;
        this.price = price;
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

    public int getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(int imagesrc) {
        this.imagesrc = imagesrc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
