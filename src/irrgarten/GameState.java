/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irrgarten;

/**
 *
 * @author elsa-fdez
 */
public class GameState {
    private String labyrinth;
    private String players;
    private String monsters;
    private int currentPlayer;
    private boolean winner;
    private String log;
    
    /**
     * Onstructor de la clase GameState para inicializar todos los atributos que 
     * definen la partida.
     * @param aLabyrinth Representación del laberinto
     * @param aPlayers Representación de los jugadores
     * @param aMonsters Representación de los monstruos
     * @param aCurrentPlayer Índice del jugador que tiene turno actualmente
     * @param aWinner Indicador de si hay algún ganador en la partida
     * @param aLog Guarda eventos interesantes que han ocurrido en el turno anterior
     */
    public GameState(String aLabyrinth, String aPlayers, String aMonsters, int aCurrentPlayer, boolean aWinner, String aLog){
        labyrinth = aLabyrinth;
        players = aPlayers;
        monsters = aMonsters;
        currentPlayer = aCurrentPlayer;
        winner = aWinner;
        log = aLog;
    }
    
    //=============================CONSULTORES==================================
    
    /**
     * getter de labyrinth
     * @return Estado actual del laberinto
     */
    public String getLabyrinth(){
        return labyrinth;
    }
    
    /**
     * getter de players
     * @return Estado actual de los jugadores
     */
    public String getPlayers(){
        return players;
    }
    
    /**
     * getter de monsters
     * @return Estado actual de los monstruos
     */
    public String getMonsters(){
        return monsters;
    }
    
    /**
     * getter de currentPlayers
     * @return Índice del jugador que tiene el turno actualmente
     */
    public int getCurrentPlayer(){
        return currentPlayer;
    }
    
    /**
     * getter de winner
     * @return True si hay un ganador en la partida actual
     *         False en caso contrario
     */
    public boolean getWinner(){
        return winner;
    }
    
    /**
     * getter de log
     * @return Registro de eventos interesantes del último turno
     */
    public String getLog(){
        return log;
    }
    
}
