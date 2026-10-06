/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

import java.util.Random;

/**
 *
 * @author elsa-fdez
 */
public class Dice {
    static private final float RESURRECT_PROB = (float) 0.3;
   
    static private Random generator = new Random();
   
    static public boolean resurrectPlayer(){
        return (generator.nextFloat() < RESURRECT_PROB);
    }
}
