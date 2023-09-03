/*
Create a class Game, which allows a user to play "Guess the Number" game once.
Game Should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input number
    3. isCorrectNumber() to detect whether the number entered by the user is true.
    4. getter and setter for noOfGuesses
       Use properties such as noOfGuesses(int), etc. to get this task done!
 */

package game;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int comInput;
    private int userInput;
    private int noOfGuesses;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random rnd = new Random();
        this.comInput = rnd.nextInt(100);
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        userInput = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(userInput == comInput){
            System.out.println("*********************************************************");
            System.out.println("                                                         ");
            System.out.printf("\tYou Have Won The Game!!!😊😊 with %d chances..\n",noOfGuesses);
            System.out.println("                                                         ");
            System.out.println("**********************************************************");
            return true;
        }
        else if(userInput > comInput){
            System.out.println("Too High........");
        }
        else if(userInput < comInput){
            System.out.println("Too Low........");
        }
            return false;
    }
    public void print(){
        takeUserInput();
        isCorrectNumber();
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
//            g.print();
        }
    }
}
