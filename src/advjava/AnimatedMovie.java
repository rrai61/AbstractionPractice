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
public class AnimatedMovie extends Animation {
    
    private static int numMovies;
    
    private double productionCost;
    private String producer;
    private String animationStyle;

    public AnimatedMovie(double productionCost, String producer) {
        this.productionCost = productionCost;
        this.producer = producer;
    }

    public AnimatedMovie() {
    }

    public static int getNumMovies() {
        return numMovies;
    }

    public static void setNumMovies(int numMovies) {
        AnimatedMovie.numMovies = numMovies;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    @Override
    public String getAnimationStyle() {
        return animationStyle;
    }
    
    @Override
    public void setAnimationStyle(String animationStyle) {
        this.animationStyle = animationStyle;
    }
    
    @Override
    public void artMedium(){
        System.out.println("The medium for this art style is video editing and graphic design.");
    }

    
}
