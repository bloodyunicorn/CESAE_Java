package Game;

import Entities.*;

import javax.swing.text.html.parser.Entity;

public class Game {

    public Game() {
    }
    NPC karen = new NPC("Wild Karen", 50, 5);
    NPC balrog = new NPC("Devious Balrog", 120, 50);
    NPC cereberus = new NPC("Cerberus", 100, 30);
    NPC bowser = new NPC("Bowser", 80, 20);
    NPC ogre = new NPC("Ogre", 60, 40);

    public boolean fight(Hero player, NPC enemy) {

        if (player instanceof Knight) {
            enemy.attack(player);
            if (player.getHp() <= 0) {
                return false;
            }
        }
        while (player.getHp() >= 0 && enemy.getHp() >= 0) {
            player.attack(enemy);
            if (player.getHp() <= 0) {
                return false;
            }
            enemy.attack(player);
        }

            return true;

    }
    public boolean maze(Hero player, int option) {

        switch (option){
            case 1: break; //vendedor
            case 2:
                    System.out.println("A wild Karen appears! \nShe tries to nag you with a complaint about how blue the sky is. \nIts hopeless to argue against her.");

                    karen.showDetails();

                    System.out.println("Role the dice to throw a rock at her.");
                    boolean win = fight(player, karen);
                    if (!win){
                        System.out.println("GAME OVER");
                        return false;
                    } else {
                        maze(player, 3);
                    }
                break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break; //unicornio
            case 11: break;
            case 12: break;
        }

        return true;
    }
}

