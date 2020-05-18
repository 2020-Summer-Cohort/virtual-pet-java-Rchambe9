package com.Rchambe9;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        {

            input.nextLine();
            int usersDogName = input.nextInt();
            System.out.println("Practice Care for a Dog");

            System.out.println("What do you want to name your dog?:");

            System.out.println("Your new dog's name is " + usersDogName);

            System.out.println("Here is a list of all the activities you can do with your new pet:");

            System.out.println("[1] Feed your dog");
            System.out.println("[2] Play with your dog");
            System.out.println("[3] Give your dog water");
            System.out.println("[4] Groom your dog");
            System.out.println("[5] Take a nap with your dog");
            System.out.println("[6] Clean up after your dog");
            System.out.println("[7] Take your dog to the vet");

            System.out.println("You must complete all tasks in order to fully take care of your new pet.");
        }

    }
}
