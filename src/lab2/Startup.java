/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author ndaley
 */
public class Startup {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numGame;
        
        System.out.println("Which game would you like to play?");
        numGame = Integer.parseInt(keyboard.nextLine());
        
        Game game = new Game(numGame);
        
        game.startGame();
    }
}
