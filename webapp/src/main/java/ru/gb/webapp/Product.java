package ru.gb.webapp;

public class Product {
    private int id;
    private String title;
    private float coast;

    public Product(int id, String title, float coast) {
        this.id = id;
        this.title = title;
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(float coast) {
        this.coast = coast;
    }
}
