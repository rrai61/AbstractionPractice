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
public abstract class Extraterrestrial implements Creature{
    
    private String planet;
    private boolean fromEarth;

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
    
    public abstract void threatToHumans();
    
    @Override
    public void setFromEarth(boolean fromEarth){
        this.fromEarth = fromEarth;
    } 
    
    @Override 
    public boolean getFromEarth(){
        return fromEarth;
    } 
}
