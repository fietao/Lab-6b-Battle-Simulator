import java.util.Random;
import java.util.Scanner;
public class BattleSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
   
        System.out.println("Welcome to the Battle Simulator!");
        Character character1 = new Character("Jet", 3, 2);
        Character character2 = new Character("V", 4, 1);
        System.out.println("It's a dual to the death. Let's welcome our opponents:");
        System.out.println(character1.getName() + " has " + character1.getCurrentHealth() + " health.");
        System.out.println(character2.getName() + " has " + character2.getCurrentHealth() + " health.");
        scanner.nextLine();
        System.out.println("Let the battle begin!");
        System.out.println("***************************************");        
        while (character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0) {
            double roll1 = rand.nextDouble();
            double roll2 = rand.nextDouble();
            int damage1 = 0;
            int damage2 = 0;

            if (roll1 < 0.7) {
                                damage1 = character1.calculateDamage();

                System.out.println(character1.getName() + " attacks!  " + character2.getName() + " takes " + damage1 + " damage.");

            }
            else {
                int heal1 = character1.heal();
                System.out.println(character1.getName() + " Heal! Gained " + heal1 + " health.");
            }

            if (roll2 < 0.7) {
                damage2 = character2.calculateDamage();
                System.out.println(character2.getName() + " attacks! " + character1.getName() + " takes " + damage2 + " damage.");
            }
            else {
                int heal2 = character2.heal();
                System.out.println(character2.getName() + " Heal! Gained " + heal2 + " health.");
            }

            if (damage1 > 0) {
                character2.takeDamage(damage1);
            }
            if (damage2 > 0) {
                character1.takeDamage(damage2);
            }

            if(!character1.IsAlive() && !character2.IsAlive()){
                System.out.println("The battle is over! Both fighters are no longer alive.");
                System.out.println("***************************************");
                break;
            }

            if (character1.IsAlive() == false) {
                character1.checkhealth();
                character2.checkhealth();
                character2.winningMessage(character1);
                System.out.println("***************************************");
                break;


            }
             if (character2.IsAlive() == false) {
                character1.checkhealth();
                character2.checkhealth();
                character1.winningMessage(character2);

                System.out.println("***************************************");
                break;
            }
            character1.checkhealth();
            character2.checkhealth();
            scanner.nextLine();
        }
    }
}