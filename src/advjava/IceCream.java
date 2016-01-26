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
public class IceCream extends Dessert{
    
    private static int numFlavors;
    
    private String flavor;
    private String brand;
    private int calories;
    private boolean servedCold;
    
    public IceCream(){}
    
    public IceCream(String flavor, String brand, int calories) {
        this.flavor = flavor;
        this.brand = brand;
        this.calories = calories;
    }

    public String getFlavor( ){
        return flavor;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public static int getNumFlavors() {
        return numFlavors;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public static void setNumFlavors(int numFlavors) {
        IceCream.numFlavors = numFlavors;
    }
    
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    @Override
    public boolean isServedCold() {
        return servedCold;
    }
    
    @Override
    public void setServedCold(boolean servedCold) {
        this.servedCold = servedCold;
    }
   
    @Override
    public void eat() {
        System.out.println("Ice cream is edible.");
    }
}
