package ru.rtk.java.APP.TV;


public class TV {
    // Поля (private)
    private String brand;
    private int size; // в дюймах
    private boolean isOn;

    // Конструктор
    public TV(String brand, int size) {
        this.brand = brand;
        this.size = size;
        this.isOn = false; // по умолчанию телевизор выключен
    }

    // Свойства (геттеры и сеттеры)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isOn() {
        return isOn;
    }

    // Методы
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(brand + " is now ON.");
        } else {
            System.out.println(brand + " is already ON.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " is now OFF.");
        } else {
            System.out.println(brand + " is already OFF.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Size: " + size + "\", Status: " + (isOn ? "On" : "Off"));
    }
}