#encoding:utf-8
require_relative 'dice'

module Irrgarten
  class TestP1
    def self.main
      puts "=== PRUEBA CLASE DICE (100 ITERACIONES) ==="
      
      iteraciones = 100
      resurrect_trues = 0;
      discard_max_uses_trues = 0
      discard_zero_attack_trues = 0

      iteraciones.times do
        if Dice.resurrect_player
          resurrect_trues += 1
        end

        if Dice.discard_element(5) # Se espera 0
          discard_max_uses_trues += 1
        end

        if Dice.discard_element(0) # Se espera 100
          discard_zero_attack_trues += 1
        end

      end

      puts "Porcentaje de resurrección (30% aprox): #{(resurrect_trues.to_f / iteraciones) * 100}%"
      puts "Porcentaje de descarte con maximo usos (0% aprox): #{(discard_max_uses_trues.to_f / iteraciones) * 100}%"
      puts "Porcentaje de descarte con 0 usos (100% aprox): #{(discard_zero_attack_trues.to_f / iteraciones) * 100}%"

      puts "Posición aleatoria (0,9): #{Dice.random_pos(10)}"
      puts "Jugador que empieza (0,3): #{Dice.who_starts(4)}"
      puts "Inteligencia aleatoria: #{Dice.random_intelligence}"
      puts "Fuerza aleatoria: #{Dice.random_strength}"
      puts "Recompensa de arma: #{Dice.weapons_reward}"
      puts "Recompensa de escudo: #{Dice.shields_reward}"
      puts "Recompensa de salud: #{Dice.health_reward}"
      puts "Poder de arma: #{Dice.weapon_power}"
      puts "Poder de escudo: #{Dice.shield_power}"
      puts "Usos iniciales: #{Dice.uses_left}"
      puts "Intensidad: #{Dice.intensity(5.0)}"
    end
  end
end

Irrgarten::TestP1.main