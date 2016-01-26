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
public abstract class WristWear implements Accessories{
    
    private String gender;
    
    @Override
    public void setGender(String gender){
        this.gender = gender;
    }

    @Override
    public String getGender(){
        return gender;
    }
    
    public abstract void howToWear();
    
}
