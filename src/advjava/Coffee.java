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
public class Coffee extends Beverage{
    
    private static int numCoffees;
    private String brand;
    private double caffeineAmt;
    private String roast;

    public Coffee() {
    }

    public Coffee(String brand, double caffeineAmt, String roast) {
        this.brand = brand;
        this.caffeineAmt = caffeineAmt;
        this.roast = roast;
    }

    public static int getNumCoffees() {
        return numCoffees;
    }

    public static void setNumCoffees(int numCoffees) {
        Coffee.numCoffees = numCoffees;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCaffeineAmt() {
        return caffeineAmt;
    }

    public void setCaffeineAmt(double caffeineAmt) {
        this.caffeineAmt = caffeineAmt;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }
    
    @Override
    public void drinkTime(){
        System.out.println("Best in the morning.");
    }
    
}
