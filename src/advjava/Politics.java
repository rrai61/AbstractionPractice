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
public class Politics extends Ideology{
    
    private static int numParties;
    
    private String politicalParty;
    private int numRegisteredVoters;

    public Politics(String politicalParty, int numRegisteredVoters) {
        this.politicalParty = politicalParty;
        this.numRegisteredVoters = numRegisteredVoters;
    }
    
    public Politics(){}

    public static int getNumParties() {
        return numParties;
    }

    public static void setNumParties(int numParties) {
        Politics.numParties = numParties;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public int getNumRegisteredVoters() {
        return numRegisteredVoters;
    }

    public void setNumRegisteredVoters(int numRegisteredVoters) {
        this.numRegisteredVoters = numRegisteredVoters;
    }
    
    @Override
    public void ideologyType(){
        System.out.println("This is a political ideology.");
    }
    
    @Override
    public void motivation(){
        System.out.println("To influence or hold power in government.");
    }
}
