package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        char resume;
        Scanner scanner = new Scanner(System.in);
        game.initial();
        System.out.println("Do you want to play now?  (y/n)  ");
        resume= scanner.next().charAt(0);
        while (resume =='y' || resume=='Y') {
            game.startGame();
            System.out.println("Want to play another round? (y/n) ");
            resume= scanner.next().charAt(0);
        }
        game.showResults();
    }
}
