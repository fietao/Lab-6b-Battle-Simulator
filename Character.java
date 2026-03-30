package Lab6bBattleSimulation;
public class Character {
    final int StartingHealth = 50;
    final int baseamount = 10;
    String Name;
    boolean IsAlive;
    boolean tooManyPoints = false;
    int CurrentHealth = StartingHealth;
    int Health;
    int Strength;
    int Speed;
    public Character(String name, int strength, int speed) {
        this.Name = name;
        this.Strength = strength;
        this.Speed = speed;

        if(Strength + Speed == 5 ){
            tooManyPoints = true;
        }
    }
    void attack


}