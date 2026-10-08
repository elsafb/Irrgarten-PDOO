/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package irrgarten;

/**
 *
 * @author elsa-fdez
 */
public class TestP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== PRUEBA ENUMERADOS ===");
        
        Directions dir = Directions.DOWN;
        Orientation ori = Orientation.VERTICAL;
        GameCharacter character = GameCharacter.MONSTER;
        
        System.out.println("Dirección: "+dir);
        System.out.println("Orientatción: "+ori);
        System.out.println("Personaje: "+character);
        
        System.out.println("=== PRUEBA CLASES: WEAPON, SHIELD Y GAMESTATE ===");
        
        Weapon w = new Weapon(2.5f, 3);
        Shield s = new Shield(1.5f, 2);
        
        System.out.println("Arma inicial: " + w.toString());
        System.out.println("Escudo inicial: " + s.toString());
        System.out.println("Ataque del arma: " + w.attack());
        System.out.println("Defensa del escudo: " + s.protect());
        System.out.println("Arma tras uso: " + w.toString());
        System.out.println("Escudo tras uso: " + s.toString());
        System.out.println("Descarte de arma?: " + w.discard());
        System.out.println("Descarte de escudo?: " + s.discard());
        
        GameState state = new GameState(
        "Laberinto de hielo",
        "Siete jugadores",
        "Vampiros y Minotauros",
        0,
        false,
        "El jugador 1 ha matado al minotauro");
        
        System.out.println("\nEstado del juego:");
        System.out.println("Laberinto: " + state.getLabyrinth());
        System.out.println("Jugadores: " + state.getPlayers());
        System.out.println("Monstruos: " + state.getMonsters());
        System.out.println("Turno: " + state.getCurrentPlayer());
        System.out.println("Ganador: " + state.getWinner());
        System.out.println("Log: " + state.getLog());
        
        System.out.println("=== PRUEBA CLASE DICE (100 TERACIONES) ===");
        
        int iteraciones = 100;
        int resurrectTrues = 0;
        int discardMaxUsesTrues = 0;
        int discardZeroUsesTrues = 0;
        
        for(int i = 0; i < iteraciones; i++){
            
            if(Dice.resurrectPlayer()){
                resurrectTrues++; //del 30%
            }
            
            //Descartar elemento con usos maximos (se espera 0)
            if(Dice.discardElement(5)){
                discardMaxUsesTrues++;
            }
            
            //Descartar elemento con usos a 0 (se espera 100)
            if(Dice.discardElement(0)){
                discardZeroUsesTrues++;
            }
            
        }
        
        System.out.println("Porcentaje de resurrección (30% aprox): " + ((float)resurrectTrues / iteraciones) * 100 + "%");
        System.out.println("Descartar con usos máximos (0% aprox): " + ((float)discardMaxUsesTrues / iteraciones) * 100 + "%");
        System.out.println("Descartar con 0 usos (100% aprox): " + ((float)discardZeroUsesTrues / iteraciones) * 100 + "%");

        System.out.println("Posición aleatoria (0 a 9): " + Dice.randomPos(10));
        System.out.println("Jugador (4 jugadores, de 0 a 3): " + Dice.whoStarts(4));
        System.out.println("Inteligencia aleatoria (0.0 a 9.99): " + Dice.randomIntelligence());
        System.out.println("Fuerza aleatoria (0.0 a 9.99): " + Dice.randomStrength());
        System.out.println("Armas ganadas (0 a 2): " + Dice.weaponsReward());
        System.out.println("Escudos ganados (0 a 3): " + Dice.shieldsReward());
        System.out.println("Salud ganada (0 a 5): " + Dice.healthReward());
        System.out.println("Poder de arma (0.0 a 2.99): " + Dice.weaponPower());
        System.out.println("Poder de escudo (0.0 a 1.99): " + Dice.shieldPower());
        System.out.println("Usos iniciales (0 a 5): " + Dice.usesLeft());
        System.out.println("Intensidad aplicada (competencia 5.0): " + Dice.intensity(5.0f));
    }  
}
