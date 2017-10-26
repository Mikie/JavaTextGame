
import java.util.Random;
import java.util.Scanner;

public class Game {

    Main main = new Main();


    public static void main(String[] args) {


        //System Variables
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        //game Variables
        String[] enemies = {"Dave", "Richie", "Jordan", "KnightDev", "Pixelator"};
        int maxhealth = 85;
        int enemyattackdamage = 35;

        //player Variables
        int health = 500;
        int attackdamage = 70;
        int healthpotionsnum = 5;
        int potionhealamount = 40;
        int potiondropchance = 60;
        String[] teammates = {"Bob", "DJ", "Narwhal", "James", "Sean", "Aerh"};


        boolean running = true;

        System.out.println("Welcome to the game!" + "Would you like to play y/n");
        String input = in.nextLine();
        if (input.equals("n")) {
            System.out.println("BYE");
            return;
        }

        if (input.equals("y")) {
            //Starts while loop
            TEXTGAME:
            while (running) {
                System.out.println("----------------------------------------------------");
                int enemyhealth = rand.nextInt();
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("A while " + enemy + " Has showed up!");


                label:
                while (maxhealth > 0) {
                    System.out.println("Your HP: " + health);
                    System.out.println("Enemy Max Health: " + maxhealth);
                    System.out.println("What would you like to do?");
                    System.out.println("1. Run away");
                    System.out.println("2. Fight the enemy");
                    System.out.println("3. Call backup");
                    String inp = in.nextLine();
                    switch (inp) {
                        case "1":
                            System.out.println("You ran away like a pussy!");
                            System.out.println("THE END");
                            break label;
                        case "2":
                            int damageGiven = rand.nextInt(attackdamage);
                            int damageTaken = rand.nextInt(enemyattackdamage);
                            maxhealth -= damageGiven;
                            health -= damageTaken;
                            System.out.println("You damaged " + enemy + " for " + damageGiven + " HP");
                            System.out.println("However you took " + damageTaken + " HP");
                            break;
                        case "3":
                            String teammate = teammates[rand.nextInt(teammates.length)];
                            System.out.println("You have called for back up and your teammate " + teammate);
                            break;
                    }
                }
                break;
            }
        }
    }
}
                    /* DO TO LIST:
                    Add more to game
                    make more stuff to do and make it more complex/fun.
                     */