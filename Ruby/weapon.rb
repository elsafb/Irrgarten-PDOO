#encoding: utf-8
module Irrgarten
  class Weapon
    def initialize(power, uses)
      @power = power
      @uses = uses
    end

    def attack
      salida = @power

      if @uses > 0
        @uses -= 1
      else
        salida = 0.0
      end

      salida
    end

    def to_s
      "W[p: #{@power}, u: #{@uses}]"
    end
  end
end