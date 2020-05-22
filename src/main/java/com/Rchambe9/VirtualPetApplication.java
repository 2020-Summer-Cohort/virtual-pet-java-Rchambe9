package com.Rchambe9;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        VirtualPet puppy = new VirtualPet("Scruffy");

        System.out.println("Practice Caring for " + puppy.getName());

        System.out.println("Here is a list of all the activities you can do with your new pet to achieve your pet goals:");

        String[] choice = new String[5];

        choice[0] = "Feed the puppy";
        choice[1] = "Get some exercise";
        choice[2] = "Give him some water";
        choice[3] = "Just chill";
        choice[4] = "Quit";

        for (int i = 0; i < choice.length; i++)
            System.out.println((i + 1) + " - " + choice[i]);


        System.out.println("Where do you want to start:");
        int userinput = input.nextInt();

        while (true) {
            if (userinput == 0) {
                System.out.println("Scruffy loves to eat!");
                System.out.print("Scruffy's hunger level is now " + puppy.getHunger() + ". Select another activity.");
                userinput = input.nextInt();
            }
            if (userinput == 1) {
                System.out.print("Any type of exercise with your pup is great! " + "Scruffy's exercise level is now " + puppy.getEnergy() + ". After he rests, what's next?");
                userinput = input.nextInt();
            }
            if (userinput == 2) {
                System.out.println("Thanks for giving the puppy water!");
                System.out.println("the puppy's thirst level is now " + puppy.getThirst() + ". Select another activity:");
                userinput = input.nextInt();
            }

            if (userinput == 3) {
                System.out.println("Take this time to bond with your new pup. After chilling, Scruffy's chill level is " + puppy.getChill() + ".");
                System.out.println("If you want to do another activity, please do so.  If not, select number 4 to quit interacting.");
                userinput = input.nextInt();
            }
            if (userinput == 4) {
                System.out.println("You have quit the game!");
                break;
            }
            puppy.tick();
        }   System.out.println("The End.");
    }
}



