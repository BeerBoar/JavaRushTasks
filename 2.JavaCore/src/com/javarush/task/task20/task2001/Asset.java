package com.javarush.task.task20.task2001;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Asset {
    public Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asset asset = (Asset) o;

        if (Double.compare(asset.price, price) != 0) return false;
        return name != null ? name.equals(asset.name) : asset.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public void save(OutputStream outputStream) throws Exception {
        outputStream.write(("+ " + this.getName() + " " + this.getPrice() + " ").getBytes());
    }

    public List<Asset> load(String[] array) throws Exception {
        List<Asset> assets = new ArrayList<>();
        for (int i = 1; i<array.length;i+=3){
            if (array[i].equals("+")){
                assets.add(new Asset(array[i+1], Double.parseDouble(array[i+2])));
            }else {
                break;
            }
        }
        return assets;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
