package com.company;

import java.util.Random;
import java.util.Scanner;

public class User {
    int choice;
    int points=0;

    public void showHand (){
        System.out.print("Please show your hand: 1.Scissors    2. Rock     3. Paper(input the related number):");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("You show hand: Scissor");
                break;
            case 2:
                System.out.println("You show hand: Rock");
                break;
            case 3:
                System.out.println("You show hand: Paper");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

}
