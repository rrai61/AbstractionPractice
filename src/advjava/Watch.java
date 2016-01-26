/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjava;

/**
 *
 * @author ritu
 */
public class Watch extends WristWear{
    
    private static int brandsInStock;
    
    private boolean waterproof; 
    private String brand;
    private double price;

    public Watch() {
    }

    public Watch(boolean waterproof, String brand, double price) {
        this.waterproof = waterproof;
        this.brand = brand;
        this.price = price;
    }

    public static int getBrandsInStock() {
        return brandsInStock;
    }

    public static void setBrandsInStock(int brandsInStock) {
        Watch.brandsInStock = brandsInStock;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public void howToWear(){
        System.out.println("Wear watch on left wrist if right-handed.");
    }
    
    

}
