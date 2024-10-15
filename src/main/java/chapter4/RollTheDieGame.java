package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDieGame {
    public static void main(String[] args) {
        int boardSpaces = 20;
        int numberOfTurns = 5;
        //generate a random number between 1-6

        //Advance user that many times
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < boardSpaces; i++){

            for(int j = 0; j<numberOfTurns; j++){
               System.out.println("Press Enter to roll the die");
               scanner.nextLine();
                int die = random.nextInt(6) + 1;
                int spacesMoved = i+= die;
                System.out.println("You rolled a " + die + "."  + "You are on space " + spacesMoved);

                if(spacesMoved < boardSpaces){
                    int spacesLeft = boardSpaces - spacesMoved;
                    System.out.println("You have " + spacesLeft + " spaces left.");
                } if(spacesMoved == boardSpaces){
                    System.out.println("You win!");
                    return;
                }
//                if (spacesMoved < boardSpaces){
//                    System.out.println("You lose! You landed on " + spacesMoved);
//                } else if (spacesMoved > boardSpaces){
//                    System.out.println("You lose! You landed past the space!");

                }
                scanner.close();

            }


        }



        }
        //Tell user what space they landed on each roll + how many spaces it'll take to win
        // loop 4 more times
        //if user gets to 20 before 5 rolls - they won
        //if they are greater than or less than 20 spaces exactly they lose
        //If they are more than 20 spaces - bug message "You advanced to space 22".



