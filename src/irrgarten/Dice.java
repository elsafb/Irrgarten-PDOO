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
    
    // Constantes privadas (atributos de clase)
    private static final int MAX_USES = 5; //número máximo de usos de armas y escudos
    private static final float MAX_INTELLIGENCE = 10.0f; //valor máximo para la inteligencia de jugadores y monstruos
    private static final float MAX_STRENGTH = 10.0f; //valor máximo para la fuerza de jugadores y monstruos
    private static final int WEAPONS_REWARD = 2; //numero máximo de armas recibidas al ganar un combate
    private static final int SHIELDS_REWARD = 3; //numero máximo de escudos recibidos al ganar un combate
    private static final int HEALTH_REWARD = 5; //numero máximo de unidades de salud recibidas al ganar un combate
    private static final int MAX_ATTACK = 3; //máxima potencia de las armas
    private static final int MAX_SHIELD = 2; //máxima potencia de los escudos
    /* OJO: el final es para que no pueda cambiarse en ningun momento una vez iniciadas*/
    
    static private final float RESURRECT_PROB = (float) 0.3;
    
    // Generador de números aleatorios
    static private Random generator = new Random();
   
    /**
     * Devuelve un número de fila o columna aleatoria siendo el valor del parámetro 
     * el número de filas o columnas del tablero. La fila y la columna de menor valor 
     * tienen como índice el número cero.
     * @param max Número de fila o columnas del tablero
     * @return Número aleatorio en el intervalo [0, max)
     */
    public static int randomPos(int max){
        return generator.nextInt(max);
    }
    
    /**
     * Devuelve el índice del jugador que comenzará la partida. El parámetro 
     * representa el número de jugadores en la partida. Los jugadores se numeran 
     * comenzando con el número 0.
     * @param nplayers Número de jugadores en la partida
     * @return Índice del jugador que empieza en el intervalo [0, nplayers)
     */
    public static int whoStarts(int nplayers){
        return generator.nextInt(nplayers);
    }
    
    /**
     * Indica si un jugador muerto debe ser resucitado o no.
     * @return True con una probabilidad equivalente a RESURRECT_PROB (30%)
     */
    static public boolean resurrectPlayer(){
        return (generator.nextFloat() < RESURRECT_PROB);
    }
    
}
