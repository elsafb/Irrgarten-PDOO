/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author elsa-fdez
 */
public class Shield {
    private float protection;
    private int uses;
    
    /**
     * Constructor de la clase Shield
     * @param aProtection Protección inicial del escudo.
     * @param someUses Número inicial de usos disponibles del escudo.
     */
    public Shield(float aProtection, int someUses){
        protection = aProtection;
        uses = someUses;
    }
    
    /**
     * Calcula la intensidad de defensa del escudo si quedan usos.
     * @return Valor de protección si quedan usos.
     */
    public float protect(){
        
        float salida = protection;
        
        if (uses > 0){
            uses--;
        }else{
            salida = 0f;
        }
        
        return salida;
    }
    
    /**
     * Decide si el escudo debe ser descartada a partir del metodo discardElement(uses)
     * de la clase Dice
     * @return True si el escudo se descarta
     *         False en caso contrario
     */
    public boolean discard(){
        return Dice.discardElement(uses);
    }
    
    /**
     * Devuelve el texto del estado interno del escudo.
     * @return Estado interno del arma en formato "S[p:protection, u:uses]"
     */
    @Override
    public String toString(){
        return "S[p:"+protection+", u:"+uses+"]";
    }
}
