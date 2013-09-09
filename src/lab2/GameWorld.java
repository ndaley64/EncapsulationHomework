/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ndaley
 */
public class GameWorld {
    private int gameWorldIndex;
    
    //first index is x, second is y coordinate
    private int[][] playerSpawnPoint;
    
    private int numEnemies;
    //first array index is the number of the enemy, second index is x, third is 
    //y coordinate
    private int[][][] enemySpawnPoints;
    
    private int mapHeight;
    private int mapLength;
    
    //2d array where first array limit is the hieght, and second is the length
    //any point below zero is empty(cannot be stood on or traveled over)
    private int[][] heightMap;
    
    public GameWorld(int gameWorldIndex){
        //load a gameWorld from another file
    }

    public void setPlayerSpawnPoint(int[][] playerSpawnPoint) {
        this.playerSpawnPoint = playerSpawnPoint;
    }

    public void setNumEnemies(int numEnemies) {
        this.numEnemies = numEnemies;
    }

    public void setEnemySpawnPoints(int[][][] enemySpawnPoints) {
        this.enemySpawnPoints = enemySpawnPoints;
    }

    public void setMapHeight(int mapHeight) {
        this.mapHeight = mapHeight;
    }

    public void setMapLength(int mapLength) {
        this.mapLength = mapLength;
    }

    public void setHeightMap(int[][] heightMap) {
        this.heightMap = heightMap;
    }

    public int[][] getPlayerSpawnPoint() {
        return playerSpawnPoint;
    }

    public int getNumEnemies() {
        return numEnemies;
    }

    public int[][][] getEnemySpawnPoints() {
        return enemySpawnPoints;
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public int getMapLength() {
        return mapLength;
    }

    public int[][] getHeightMap() {
        return heightMap;
    }
    
    
}
