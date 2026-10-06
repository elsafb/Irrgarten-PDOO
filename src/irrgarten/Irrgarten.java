/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author elsa-fdez
 */
public class Irrgarten {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Weapon w = new Weapon(1.0f, 2);
        
        for (int i = 0; i < 3; i++){
            System.out.println(w.toString());
            System.out.println(w.attack());
        }
       
        int test = 100;
        int nTrue = 0;
        for (int i = 0; i < test; i++){
            if (Dice.resurrectPlayer()){
                nTrue++;
            }
        }
        
        System.out.println("Nº de Trues: "+ ((float) nTrue / test) * 100 + "%");
    }  
}
