import java.util.Random;
import java.util.Scanner;
public class BattleSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        char choice;
         String name1 , name2;
        int strength1, strength2, speed1, speed2;
        System.out.println("Welcome to the Battle Simulator!");
        choice = scanner.next().charAt(0);
        System.out.println("do you want to customize your characters? (y/n)");
            if(choice == 'y' || choice =='Y'){
            System.out.println("Name your character 1");
            scanner.nextLine();
            name1 = scanner.nextLine();
            System.out.println("put your character 1 strength (0-5)");



            }
        else{}
        Character character1 = new Character("Jet", 3, 2);
        Character character2 = new Character("V", 4, 1);

        System.out.println("It's a dual to the death. Let's welcome our opponents:");
        System.out.println(character1.getName() + " has " + character1.getCurrentHealth() + " health.");
        System.out.println(character2.getName() + " has " + character2.getCurrentHealth() + " health.");
            scanner.nextLine();
            System.out.println("Let the battle begin!");
            System.out.println("***************************************");        
            while(character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0){
                if(rand.nextDouble() < 0.7){
                    int damage1 = character1.attack(character2);
                    System.out.println(character1.getName() + " attacks! make "+ damage1+" damage to V");
                        if(character2.IsAlive() == false){
                        System.out.println("Current health " + character1.getName() + ": " + character1.getCurrentHealth());
                        System.out.println("Current health " + character2.getName() + ": " + character2.getCurrentHealth());
                        System.out.println(character1.getName() + " has  defeat " + character2.getName() + " " + character1.getName() + " wins!"); break;
                        
                        
                        }
                        
                    int damage2 = character2.attack(character1);
                    System.out.println(character2.getName() + " attacks! make "+ damage2+" damage to Jet");
                        if(character1.IsAlive() == false){
                        System.out.println("Current health " + character1.getName() + ": " + character1.getCurrentHealth());
                        System.out.println("Current health " + character2.getName() + ": " + character2.getCurrentHealth());
                            System.out.println(character2.getName() + " has defeat " + character1.getName() + " " + character2.getName() + " wins!"); break;
                        }
                    System.out.println("Current health " + character1.getName() + ": " + character1.getCurrentHealth());
                    System.out.println("Current health " + character2.getName() + ": " + character2.getCurrentHealth());
                    scanner.nextLine();
                }
                else{
                    int heal1 = character1.heal();
                    System.out.println(character1.getName() + " Heal! Gained " + heal1 + " health.");
                    int heal2 = character2.heal();
                    System.out.println(character2.getName() + " Heal! Gained " + heal2 + " health.");
                    System.out.println("Current health " + character1.getName() + ": " + character1.getCurrentHealth());
                    System.out.println("Current health " + character2.getName() + ": " + character2.getCurrentHealth());
                scanner.nextLine();
                }
               
              
            }
        }
        
    }
    
