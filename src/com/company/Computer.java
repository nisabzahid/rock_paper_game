package com.company;

import java.util.Random;

public class Computer {
      int choice;
      String name;
      int points=0;

      public void showHand (){
          Random picker = new Random();
          choice = picker.nextInt(3)+1;
          switch (choice){
              case 1:
                  System.out.println(name+" show hand: Scissor");
                  break;
              case 2:
                  System.out.println(name+" show hand: Rock");
                  break;
              case 3:
                  System.out.println(name+" show hand: Paper");
                  break;
              default:
                  System.out.println("Invaid Choice");

          }
      }

}
