import java.util.Random;
public class BattleSimulation {
    public static void main(String[] args) {
        Random rand = new Random();
        Character character1 = new Character("Jet", 3, 2);
        Character character2 = new Character("V", 4, 1);
        System.out.println("It's a dual to the death. Let's welcome our opponents:");
        System.out.println(character1.name + " has " + character1.getHealth() + " health.");
        System.out.println(character2.name + " has " + character2.getHealth() + " health.");
            System.out.println("Let the battle begin!");
            System.out.println("***************************************");
            System.out.println(character1.getHealth());
            System.out.println(character2.getHealth());
            while(character1.getHealth() > 0 && character2.getHealth() > 0){
                if(rand.nextDouble() < 0.7){
                    
                }
                else{
                
                }
                System.out.println("Current health: " + character1.name + ": " + character1.getHealth());
                System.out.println("Current health: " + character2.name + ": " + character2.getHealth());
            }
        }
            /*while(character1.CurrentHealth > 0 && character2.CurrentHealth > 0){
                if(rand.nextDouble() < 0.7){
                    character1.CurrentHealth -= character2.attack;
                    System.out.println(character2.name + " attacks!"+ character2.damage);
                    character2.CurrentHealth -= character1.attack;
                    System.out.println(character1.name + " attacks!"+ character1.damage);
                }
                else{
                    character2.CurrentHealth += character2.heal;
                    System.out.println(character2.name + " Heal!");
                    character1.CurrentHealth += character1.heal;
                    System.out.println(character1.name + " Heal!");
                }
                System.out.println("curent health:" + character1.name + ": " + character1.getHealth());
                System.out.println("curent health:" + character2.name + ": " + character2.getHealth());
                System.out.println("-------------------");
            }
        } */
    }
    