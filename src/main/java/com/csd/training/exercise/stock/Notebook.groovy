package com.csd.training.exercise.stock

/**
 * Created by Thinkpad on 18-06-06.
 */
class Notebook {

    static String BRAND_APPLE = 'APPLE'

    private String brand
    private String model
    private String serialNumber
    private int price

    String getBrand() {
        return brand
    }

    void setBrand(String brand) {
        this.brand = brand
    }

    String getModel() {
        return model
    }

    void setModel(String model) {
        this.model = model
    }

    String getSerialNumber() {
        return serialNumber
    }

    void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber
    }

    int getPrice() {
        return price
    }

    void setPrice(int price) {
        this.price = price
    }
}
