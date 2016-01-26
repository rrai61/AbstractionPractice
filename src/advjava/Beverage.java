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
public abstract class Beverage implements Liquid{
    
    private boolean hot;

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }
    
    public abstract void drinkTime();
    
    @Override
    public void isDrinkable() {
        System.out.println("Beverages are drinkable");
    }
    
}
