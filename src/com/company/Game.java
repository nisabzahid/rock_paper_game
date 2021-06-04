package com.company;


import java.util.Scanner;

public class Game {

    User user = new User();
    Computer computer= new Computer();
    int rounds=0;

    public void showTitle() {
        System.out.println("-----------------Welcome to ROCK-PAPER-SCISSORS-----------------");
        System.out.println();
        System.out.println();
        System.out.println("                      ********************         ");
        System.out.println("                       *     STARTS     *         ");
        System.out.println("                      ********************         ");
    }

    public void showRule(){
        System.out.println("Game rule:1.Scissors    2. Rock     3. Paper");
    }
    public void chooseOpponent (){
        String[] names = {"Computer","Bill Gates", "Elon Mask", "Steve Jobs"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose the opposite role (1. "+names[1]+"  2. "+names[2]+"   3. "+names[3]+"): ");
        int name_choice = scanner.nextInt();
        switch (name_choice){
            case 1:
                 computer.name=names[1];
                break;
            case 2:
                computer.name=names[2];
                break;
            case 3:
                computer.name=names[3];
                break;
            default:
                computer.name=names[0];

        }
        System.out.println("You chose "+computer.name+" to play with you");

    }
    public void initial(){
        showTitle();
        showRule();
        chooseOpponent();
    }

    public void startGame (){
        int result;
        user.showHand();
        computer.showHand();
        if(user.choice==computer.choice) result=0;
        else if(user.choice==1 && computer.choice==3) result=1;
        else if(user.choice==2 && computer.choice==1) result=1;
        else if(user.choice==3 && computer.choice==2) result=1;
        else result=2;

        if(result==0) System.out.println("Ended in a tie");
        else if(result==1) {
            user.points++;
            System.out.println("Congrats, you win");
        }
        else {
            computer.points++;
            System.out.println("Sorry, you lose");
        }
        rounds++;

    }
    public void showResults(){
        System.out.println(computer.name +"  Vs  User");
        System.out.println("Total number of rounds "+rounds);
        System.out.println("Name           Score");
        System.out.println("User           "+user.points);
        System.out.println(computer.name+"     "+computer.points);
        System.out.println("Come on Next Time!!");
    }

}
