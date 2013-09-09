/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author ndaley
 */
public class GameCharacter {
    private int maxHealth;
    private int currentHealth;
    private int attackDmg;
    private int moveSpeed;
    private boolean isPlayerCharacter;
    private int idNumber;
    private boolean isDead;
    
    public GameCharacter(){
        
    }

    public GameCharacter(int maxHealth, int currentHealth, int attackDmg, int moveSpeed, boolean isPlayerCharacter) {
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.attackDmg = attackDmg;
        this.moveSpeed = moveSpeed;
        this.isPlayerCharacter = isPlayerCharacter;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public boolean isIsPlayerCharacter() {
        return isPlayerCharacter;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setIsPlayerCharacter(boolean isPlayerCharacter) {
        this.isPlayerCharacter = isPlayerCharacter;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
    
    public void takeDamage(int damage){
        this.currentHealth -= damage;
        
        if(this.currentHealth < 0){
            this.currentHealth = 0;
            this.isDead = true;
        }
        else if(this.currentHealth == 0){
            this.isDead = true;
        }
    }
    
}
