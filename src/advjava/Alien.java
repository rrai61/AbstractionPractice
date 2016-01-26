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
public class Alien extends Extraterrestrial{
    
    private static int numAliens;
    
    private boolean friendly;
    private String name;

    public Alien(boolean friendly, String name) {
        this.friendly = friendly;
        this.name = name;
    }
    
    public Alien(){}

    public static int getNumAliens() {
        return numAliens;
    }

    public static void setNumAliens(int numAliens) {
        Alien.numAliens = numAliens;
    }

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void threatToHumans() {
        System.out.println("Can possibly be a threat to humans.");
    }
    
}
