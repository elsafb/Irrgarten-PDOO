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
     * Devuelve un valor aleatorio de inteligencia del intervalo [0, MAX_INTELLIGENCE)
     * @return Valor en coma flotante de inteligencia
     */
    public static float randomIntelligence(){
        return generator.nextFloat() * MAX_INTELLIGENCE; 
    }
    
    /**
     * Devuelve un valor aleatorio de fuerza del intervalo [0, MAX_INTELLIGENCE)
     * @return Valor en coma flotante de inteligencia
     */
    public static float randomStrength(){
        return generator.nextFloat() * MAX_STRENGTH; 
    }
    
    /**
     * Indica si un jugador muerto debe ser resucitado o no.
     * @return True con una probabilidad equivalente a RESURRECT_PROB (30%)
     */
    static public boolean resurrectPlayer(){
        return (generator.nextFloat() < RESURRECT_PROB);
    }
    
    /**
     * Indica la cantidad de armas que recibirá el jugador por ganar el combate. 
     * Será un número aleatorio desde 0 (inclusive) que nunca debe superar el 
     * máximo indicado en la definición de los atributos de clase.
     * @return Número aleatorio en el intervalo [0, WEAPONS_REWARD]
     */
    public static int weaponsReward(){
        // Se suma 1 porque nextInt() excluye con limite superior
        return generator.nextInt(WEAPONS_REWARD + 1);
    }
    
    /**
     * Indica la cantidad de escudos que recibirá el jugador por ganar el combate. 
     * Será un número aleatorio desde 0 (inclusive) que nunca debe superar el 
     * máximo indicado en la definición de los atributos de clase.
     * @return Número aleatorio en el intervalo [0, SHIELDS_REWARD]
     */
    public static int shieldsReward(){
        return generator.nextInt(SHIELDS_REWARD + 1);
    }
    
    /**
     * Indica la cantidad de unidades de salud que recibirá el jugador por ganar el combate. 
     * Será un número aleatorio desde 0 (inclusive) que nunca debe superar el 
     * máximo indicado en la definición de los atributos de clase.
     * @return Número aleatorio en el intervalo [0, SHIELDS_REWARD]
     */
    public static int healthReward(){
        return generator.nextInt(HEALTH_REWARD + 1);
    }
    
    /**
     * Potencia aleatoria que se le asignrá a un arma nueva.
     * @return Número aleatorio en el intervalo [0, MAX_ATTACK)
     */
    public static float weaponPower(){
        return generator.nextFloat() * MAX_ATTACK;
    }
    
    /**
     * Nivel de protección aleatoria que se le asignrá a un escudo nuevo.
     * @return Número aleatorio en el intervalo [0, MAX_SHIELD)
     */
    public static float shieldPower(){
        return generator.nextFloat() * MAX_SHIELD;
    }
    
    /**
     * Numero de usos que se le asignará a un arma o escudo. No debe superar el 
     * maximo indicado en la definiciñon de los atributos
     * @return Númeo aleatorio en el intervalo [0, MAX_USES]
     */
    public static int usesLeft(){
        return generator.nextInt(MAX_USES+1);
    }
    
    /**
     * Devuelve la cantidad de competencia aplicada.
     * @param competence Nivel de competencia 
     * @return Valor aleatorio en el intervalo [0, competence)
     */
    public static float intensity(float competence){
        return generator.nextFloat() * competence;
    }
    
    /**
     * Devuelve una probabilidad inversamente proporcional a lo cercano que esté 
     * el parámetro del número máximo de usos que puede tener un arma o escudo.
     * CASOS EXTREMOS:
     *    - Numero de usos maximo --> false
     *    - Numero de usos 0 --> true
     * @param usesLeft Cantidad de usos que le quedan al arma/escudo
     * @return True si el objeto se destruye
     *         False en caso contrario
     */
    public static boolean discardElement(int usesLeft){
       float probability = (float) (MAX_USES - usesLeft) / MAX_USES;
       return generator.nextFloat() < probability;
    }
    
}
