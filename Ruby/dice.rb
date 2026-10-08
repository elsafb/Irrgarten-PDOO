#encoding: utf-8
module Irrgarten
  class Dice
    
    #Atributos de clase 
    @@MAX_USES = 5
    @@MAX_INTELLIGENCE = 10.0
    @@MAX_STRENGTH = 10.0
    @@WEAPONS_REWARD = 2
    @@SHIELDS_REWARD = 3
    @@HEALTH_REWARD = 5
    @@MAX_ATTACK = 3.0 #Definido como float para que rand() pueda devolver decimales (porque devuelve según el numero que le pongas)
    @@MAX_SHIELD = 2.0

    @@RESURRECT_PROB = 0.3
    @@generator = Random.new

    # Devuelve numero de fila o columna aleatoria
    # @param max [Integer] Numero de filas o columnas del tablero
    # @return [Integer] Numero aleatorio en el intervalo [0, max)  
    def self.random_pos(max)
      @@generator.rand(max)
    end

    # Devuelve el indice del jugador que comineza la partida
    # @param nplayers [Integer] Numero de jugadores
    # @return [Integer] Indice del jugador en el intervalo [0, nplayers)
    def self.who_starts(nplayers)
      @@generator.rand(nplayers)
    end 

    # Devuelve un valor aleatorio de inteligencia
    # @return [Float] Valor aleatorio de inteligencia en el intervalo [0, @@MAX_INTELLIGENCE)
    def self.random_intelligence
      @@generator.rand(@@MAX_INTELLIGENCE)
    end

    # Devuelve un valor aleatorio de fuerza
    # @return [Float] Valor aleatorio de fuerza en el intervalo [0, @@MAX_STRENGTH)
    def self.random_strength
      @@generator.rand(@@MAX_STRENGTH)
    end

    # Indica si un jugador debe ser resucitado o no
    # @return [Boolean] True si el jugador debe ser resucitado
    #                   False en caso contrario
    def self.resurrect_player
      @@generator.rand < @@RESURRECT_PROB
    end

    # Cantidad de armas que recibirá el jugador por ganar la batlla
    # @return [Integer] Numero aleatorio de armas en el intervalo [0, @@WEAPONS_REWARD]
    def self.weapons_reward
      @@generator.rand(@@WEAPONS_REWARD + 1)
    end

    # Cantidad de escudos que recibirá el jugador por ganar la batalla
    # @return [Integer] Numero aleatorio de escudos en el intervalo [0, @@SHIELDS_REWARD]
    def self.shields_reward
      @@generator.rand(@@SHIELDS_REWARD + 1)
    end

    # Cantidad de salud que recibirá el jugador por ganar la batalla
    # @return [Integer] Numero aleatorio de salud en el intervalo [0, @@HEALTH_REWARD]
    def self.health_reward
      @@generator.rand(@@HEALTH_REWARD + 1)
    end

    # Valor aleatorio para la potencia de un arma
    # @return [Float] Valor aleatorio de potencia en el intervalo [0, @@MAX_ATTACK)
    def self.weapon_power
      @@generator.rand(@@MAX_ATTACK)
    end

    # Valor aleatorio para la protección que otorga un escudo
    # @return [Float] Valor aleatorio de protección en el intervalo [0, @@MAX_SHIELD)
    def self.shield_power
      @@generator.rand(@@MAX_SHIELD)
    end

    # Valor aleatorio para el número de usos que se asignará a un arma o escudo
    # @return [Integer] Valor aleatorio de usos en el intervalo [0, @@MAX_USES]
    def self.uses_left
      @@generator.rand(@@MAX_USES + 1)
    end

    # Cantidad de competencia 
    # @param competence [Float] Valor de competencia del jugador
    # @return [Float] Valor aleatorio de competencia en el intervalo [0, competence)
    def self.intensity(competence)
      @@generator.rand(competence)
    end

    # Indica  de forma probabilística si un arma o escudo debe ser descartado o no. 
    # Se calcula de forma inversamente proporcional.
    # @param uses_left [Integer] Numero de usos que le quedan al arma o escudo
    # @return [Boolean] True si el arma o escudo debe ser descartado
    #                   False en caso contrario
    def self.discard_element(uses_left)
      probability = (@@MAX_USES - uses_left).to_f / @@MAX_USES
      @@generator.rand < probability
    end

  end
end