import java.util.Random;

public class Character {

    //Attributes
    public static final int STARTING_HEALTH =50;
    private static final int BASE_ATTACK = 10;
    private static final int BASE_HEAL = 5;

    public  int CurrentHealth ;
    private int Strength;
    private int Speed;
    public String name;



//    private boolean IsAlive;
    private boolean tooManyPoints = false;
//    private static int Health=5;
//    private boolean critical_attack ;
    private static boolean endGame ;


    //Constructor
    public Character(String name, int strength, int speed) {
        this.Strength = strength;
        this.Speed = speed;
        this.name = name;
        this.CurrentHealth = STARTING_HEALTH;

        if(Strength + Speed > 5 ){
            tooManyPoints = true;
        }
    }
    //Methods
    Random rnd = new Random();
    public int attack( Character opponent ){

        int chance= rnd.nextInt(10)+1;
       int Damage = BASE_ATTACK+Strength;
        if (chance==1){
            Damage +=5;
        }
        opponent.takeDamage(Damage);
        return Damage;
    }

    public int heal(){
       int healthGained = (2*Speed)+BASE_HEAL;
       if (healthGained >STARTING_HEALTH){
        healthGained=STARTING_HEALTH;
       }
        return healthGained;
    }

    public void takeDamage (int Damage){
        CurrentHealth-=Damage;
    }

    //Several get methods


    public int getStrength() {
        return Strength;
    }

    public int getSpeed() {
        return Speed;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return CurrentHealth;
    }

    public String toString(){
        return name + " [ Strength: " + Strength + ", Speed: " + Speed + " ] ";

    }


}



