#encoding: utf-8
module Irrgarten
  class Weapon

    # Constructor de la clase Weapon
    # @param power Potenica de daño del arma
    # @param uses Numero inicial de usos disponibles del arma
    def initialize(power, uses)
      @power = power
      @uses = uses
    end

    # Calcula la intensidad del ataque si te quedan usos.
    # @return Valor de potencia del arma si quedan usos.
    def attack
      salida = @power

      if @uses > 0
        @uses -= 1
      else
        salida = 0.0
      end

      salida
    end

    # Decide si el arma debe ser descartada a partir del metodo discardElement(uses)
    # de la clase Dice
    # @return True si el arma se descarta
    #         False en caso contrario
    def discard
      Dice.discard_element(@uses)
    end
 
    # Devuelve el texto del estado interno del arma.
    # @return Estado interno del arma en formato "W[p:power, u:uses]"
    def to_s
      "W[p: #{@power}, u: #{@uses}]"
    end


  end
end