#encoding:utf-8
require_relative 'dice'
require_relative 'directions'
require_relative 'orientation'
require_relative 'game_character'
require_relative 'weapon'
require_relative 'shield'
require_relative 'game_state'

module Irrgarten
  class TestP1
    def self.main

      puts "=== PRUEBA ENUMERADOS ==="

      dir = Directions::DOWN
      ori = Orientation::HORIZONTAL
      character = GameCharacter::MONSTER

      puts "Dirección: #{dir}"
      puts "Orientación: #{ori}"
      puts "Personaje: #{character}"

      puts "=== PRUEBA CLASES: WEAPON, SHIELD Y GAMESTATE ==="

      w = Weapon.new(2.5, 3)
      s = Shield.new(1.5, 2)

      puts "Arma: #{w.to_s}"
      puts "Escudo: #{s.to_s}"
      puts "Ataque del arma: #{w.attack}"
      puts "Defensa del escudo: #{s.protect}"
      puts "Arma tras ataque: #{w.to_s}"
      puts "Escudo tras defensa: #{s.to_s}"
      puts "Descarte de arma? #{w.discard}"
      puts "Descarte de escudo? #{s.discard}"

      state = GameState.new(
        "Laberinto de hielo",
        "Siete jugadores",
        "Vampiros y Minotauros",
        0,
        false, 
        "El jugador 1 ha matado al minotauro"
      )

      puts "\nEstado del juego:"
      puts "Laberinto: #{state.labyrinth}"
      puts "Jugadores: #{state.players}"
      puts "Monstruos: #{state.monsters}"
      puts "Turno: #{state.current_player}"
      puts "Ganador: #{state.winner}"
      puts "Log: #{state.log}"

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