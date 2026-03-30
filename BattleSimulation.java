import java.util.Random;
public class BattleSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        Character character1 = new Character("Jet", 3, 2);
        Character character2 = new Character("V", 4, 1);
        System.out.println("It's a dual to the death. Let's welcome our opponents:");
        System.out.println(character1.name + " has " + character1.CurrentHealth + " health.");
        System.out.println(character2.name + " has " + character2.CurrentHealth + " health.");
        System.out.println("Let the battle begin!");
        System.out.println("***************************************");}





        /**while(character1.CurrentHealth > 0 && character2.CurrentHealth > 0){
            if(rand.nextDouble() < 0.7){
                character1.CurrentHealth -= character2.attack;
                System.out.println(character2.Name + " attacks!"+ character2.damage)
                character2.CurrentHealth -= character1.attack;
                System.out.println(character2.Name + " attacks!"+ character2.damage)
            }
            else(){
                character2.Name += character2.heal;
                System.out.println(character2.Name + " Heal!")
                character1.Name += character1.heal;
                System.out.println(character1.Name + " Heal!")
            }
            System.out.println("curent health:" + character1.Name + ": " + character1.CurrentHealth);
            System.out.println("curent health:" + character2.Name + ": " + character2.CurrentHealth);
            System.out.println("-------------------");
            */

        
            




        }

    