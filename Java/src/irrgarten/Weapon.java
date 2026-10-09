/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author elsa-fdez
 */
public class Weapon {
    private float power;
    private int uses;

    /**
     * Constructor de la clase Weapon
     * @param aPower Potencia de daño del arma
     * @param someUses Numero inicial de usos disponibles del arma
     */
    public Weapon (float aPower, int someUses){
        power = aPower;
        uses = someUses;
    }

    /**
     * Calcula la intensidad del ataque si te quedan usos.
     * @return Valor de potencia del arma si quedan usos.
     */
    public float attack(){

        float salida = power;
       
        if (uses > 0){
            uses--;
        }else{
            salida = 0f;
        }
       
        return salida;
    }
       
    /**
     * Devuelve el texto del estado interno del arma.
     * @return Estado interno del arma en formato "W[p:power, u:uses]"
     */
    @Override
    public String toString(){
        return "W[p:"+power+", u:"+uses+"]";
    }
    
    /**
     * Decide si el arma debe ser descartada a partir del metodo discardElement(uses)
     * de la clase Dice
     * @return True si el arma se descarta
     *         False en caso contrario
     */
    public boolean discard(){
        return Dice.discardElement(uses);
    }
}
