import java.util.Random;

public class Character {

    private static final int STARTING_HEALTH =50;// starting
    private static final int BASE_ATTACK = 10;
    private static final int BASE_HEAL = 5;

    private  int CurrentHealth ;// gets updated
    private int Strength;
    private int Speed;
    public String Name;
    public boolean tooManyPoints = false;
    
    //Constructor
    public Character(String name, int strength, int speed) {
        this.Strength = strength;
        this.Speed = speed;
        this.Name = name;
        this.CurrentHealth = STARTING_HEALTH;

        if(Strength + Speed != 5 ){
            tooManyPoints = true;
        }
    }
    //Methods for attacking, and taking damage
    Random rnd = new Random();
    public int attack( Character opponent ){
        int Damage = calculateDamage();
        opponent.takeDamage(Damage);
        return Damage;
    }
    //method for calculating damage
    public int calculateDamage(){
        int chance= rnd.nextInt(10)+1;
        int damage = BASE_ATTACK + Strength;
        if (chance==1){
            damage +=5;
            System.out.println("Critical Attack! this turn " + this.getName() + " make " + damage);
        }
        return damage;
    }
    public int heal(){
       int healthAmount = (2*Speed)+BASE_HEAL;
       if (CurrentHealth+healthAmount>STARTING_HEALTH){// if 45+13(58)>50
           healthAmount=STARTING_HEALTH-CurrentHealth;// healthAmount is 50-45= 5
           // healthAmount is 5 gained
           // now current health is 50
       }
       //if 20+8=28 and health amount gained is 8
       CurrentHealth+=healthAmount;// Updates the Current Health by adding heal amount
        return healthAmount;// returns health gained by heal
    }

    public void takeDamage (int Damage){

        CurrentHealth-=Damage;// updates current health by reducing the damage
    }


 
    //Several get methods
    public int getStrength() {
        return Strength;
    }
    public boolean IsAlive() {
        if (CurrentHealth > 0) {
            return true;
        } else {
            return false;
        }
    }
    public int getSpeed() {
        return Speed;
    }

    public String getName() {
        return Name;
    }

    public int getCurrentHealth() {
        return CurrentHealth;
    }
    void checkhealth(){
            System.out.println("Current health " + this.getName() + ": " + this.getCurrentHealth());
    }
    void winningMessage(Character opponent){
                System.out.println(this.getName() + " has been wins!" + opponent.getName() + " has been defeated!");
    }


    public String toString(){//Prints the String representation
        return Name + " [ Strength: " + Strength + ", Speed: " + Speed + " ] ";


}
}


