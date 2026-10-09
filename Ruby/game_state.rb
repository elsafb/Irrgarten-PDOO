#encoding: utf-8
module Irrgarten
  class GameState

    #CONSULTORES: la forma resumida, si no va sin el get y pones directametne el nombre del parametro
    attr_reader :labyrinth, :players, :monsters, :current_player, :winner, :log
    # Las buenas prácticas en Ruby recomiendan ponerlos al inicio, antes del constructor

    # Constructor de la clase GameState 
    # @param labyrinth Laberinto del juego
    # @param players Jugadores del juego
    # @param monsters Monstruos del juego
    # @param current_player Jugador actual del juego
    # @param winner Ganador del juego
    # @param log Log del juego
    def initialize(labyrinth, players, monsters, current_player, winner, log)
      @labyrinth = labyrinth
      @players = players
      @monsters = monsters
      @current_player = current_player
      @winner = winner
      @log = log
    end

  end
end