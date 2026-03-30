public class Character {
    final int StartingHealth = 50;
    public String name;
    private boolean IsAlive;
    private boolean tooManyPoints = false;
    public int CurrentHealth = StartingHealth;
    private int Health;
    private int Strength;
    private int Speed;


    public Character(String name, int strength, int speed) {
        this.name = name;
        this.Strength = strength;
        this.Speed = speed;
        if(Strength + Speed == 5 ){
            tooManyPoints = true;
        }
    }



}