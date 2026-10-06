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

    public Weapon (float aPower, int someUses){
        power = aPower;
        uses = someUses;
    }

    public float attack(){

        float salida = power;
       
        if (uses > 0){

            uses--;
}else{

            salida = 0f;
}
       
        return salida;
    }
       
    @Override
    public String toString(){
        return "W[p:"+power+", u:"+uses+"]";
    }
}
