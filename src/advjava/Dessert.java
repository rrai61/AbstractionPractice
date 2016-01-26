/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advjava;

/**
 *
 * @author ritu rai
 */
public abstract class Dessert implements Food{
    
    private static int numDesserts; 

    public static int getNumDesserts() {
        return numDesserts;
    }

    public static void setNumDesserts(int numDesserts) {
        Dessert.numDesserts = numDesserts;
    }

    public abstract boolean isServedCold();
    
    public abstract void setServedCold(boolean servedCold);
}
