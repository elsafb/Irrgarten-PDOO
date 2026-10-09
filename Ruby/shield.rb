#encoding: utf-8
module Irrgarten
  class Shield
    
    # Constructor de la clase Shield
    # @param aProtection Protección inicial del escudo.
    # @param someUses Número inicial de usos disponibles del escudo.
    def initialize(protection, uses)
        @protection = protection
        @uses = uses
    end

    # Calcula la intensidad de defensa del escudo si quedan usos.
    # @return Valor de protección si quedan usos.
    def protect
        salida = @protection

        if @uses > 0
            @uses -= 1
        else
            salida = 0.0
        end

        return salida
    end

    # Decide si el escudo debe ser descartado a partir del metodo discardElement(uses)
    # de la clase Dice
    # @return True si el escudo se descarta
    #         False en caso contrario
    def discard
      Dice.discard_element(@uses)
    end

    # Devuelve el texto del estado interno del escudo.
    # @return Estado interno del arma en formato "S[p:protection, u:uses]"
    def to_s
        "S[p;#{@protection}, u:#{@uses}]"
    end

  end
end
  