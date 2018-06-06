package com.csd.training.exercise.stock;

/**
 * Created by Thinkpad on 18-06-06.
 */
class Notebook {

    private static String BRAND_APPLE = "APPLE";

    private String brand;
    private String model;
    private String serialNumber;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
