/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ndaley
 */
public class GUI {
    private void showPlayerHealthBar(){
        // Display the players healthbar composing of current health and
        // maximum health for the player's character.
    }
    
    private void showTargetHealthBar(){
        // Display the last enemy hit by the player's healthbar composing of 
        // current health and maximum health for the player's character.
    }
    
    private void showMap(){
        //Show the map the player and enemies move on
    }
    
    private void showPlayer(){
        //show the player on top of the map at its current location
    }
    
    private void showEnemies(){
        //show the current enemies that are on the map and not dead
    }
    
    public void loadGUI(){
        this.showEnemies();
        this.showMap();
        this.showPlayer();
        this.showPlayerHealthBar();
        this.showTargetHealthBar();
    }
}
