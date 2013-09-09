/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/** need more comments
 *
 * @author ndaley
 */
public class Game {
    private int gameNum;
    private boolean gameStillGoing = false;
    private int numEnemies;
    private int numEnemiesDead;
    private boolean playerDead;
    private GUI gui = new GUI();
    private int[][] currentPlayerLocation;
    private int[][][] currentEnemyLocations;
    private GameCharacter player;
    private GameCharacter[] enemies;
    private GameWorld gameWorld;
    
    public Game(int gameNum){
        this.gameNum = gameNum;
    }
    
    public void startGame(){
        this.gameStillGoing = true;
        
        this.loadMap();
        
        while(gameStillGoing){
            //if player pushes the attack button to attack closest enemy
            // this.playerAttack(enemyIndex);
            
            //after the player takes their turn, have the enemies attack in
            //order unless they are dead.
            //for(int x = 0; x < this.numEnemies; x++){
            //    if(enemies[x].getIsDead = false){
            //        this.enemyAttack(x);
            //    }
            //}
            
            if(playerDead){
                System.out.println("The player has lost!");
                gameStillGoing = false;
            }
            if(numEnemiesDead == numEnemies){
                gameStillGoing = false;
            }
        }
    }
    
    private void loadMap(){
        System.out.println("Which gameWorld would you like to play?");
        gameWorld = new GameWorld(gameNum);
        gui.loadGUI();
        //player = new GameCharacter();
        this.currentPlayerLocation = gameWorld.getPlayerSpawnPoint();
        this.currentEnemyLocations = gameWorld.getEnemySpawnPoints();
        
        for(int x = 0; x < this.numEnemies; x++){
            enemies[x] = new GameCharacter();
        }
    }
    
    private void playerAttack(int enemyIndex){
        enemies[enemyIndex].takeDamage(player.getAttackDmg());
        if(enemies[enemyIndex].getIsDead()){
            numEnemiesDead ++;
        }
    }
    
    private void enemyAttack(int enemyIndex){
        player.takeDamage(enemies[enemyIndex].getAttackDmg());
        if(player.getIsDead()){
            playerDead = true;
        }
    }
}
