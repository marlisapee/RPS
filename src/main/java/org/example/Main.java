package org.example;

import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String playerChoice;
        String computerChoice;
        Scanner scanner = new Scanner(System.in);

        // map of choices
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Rock");
        map.put(2, "Paper");
        map.put(3, "Scissors");

        // start game
        System.out.println("Lets play Rock, Paper, Scissors!");
        System.out.println("Choices: " + map);
        System.out.print("Type your choice: ");

        // player input
        Integer choice = scanner.nextInt();
        playerChoice = map.get(choice);
        System.out.println("Your choice: " + playerChoice);

        // computer choice
        int randomNum = (int) Math.floor(Math.random() * 3 + 1);
        computerChoice = map.get(randomNum);

        // outcomes
        String outcome = null;

        if(playerChoice.equals("Rock") && computerChoice.equals("Rock"))
            outcome = "Its a tie!";
        if(playerChoice.equals("Rock") && computerChoice.equals("Paper"))
            outcome = "Computer wins!";
        if(playerChoice.equals("Rock") && computerChoice.equals("Scissors"))
            outcome = "Player wins!";
        if(playerChoice.equals("Paper") && computerChoice.equals("Rock"))
            outcome = "Player wins!";
        if(playerChoice.equals("Paper") && computerChoice.equals("Paper"))
            outcome = "Its a tie!";
        if(playerChoice.equals("Paper") && computerChoice.equals("Scissors"))
            outcome = "Computer wins!";
        if(playerChoice.equals("Scissors") && computerChoice.equals("Rock"))
            outcome = "Computer wins!";
        if(playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
            outcome = "Player wins!";
        if(playerChoice.equals("Scissors") && computerChoice.equals("Scissors"))
            outcome = "Its a tie!";

        System.out.println("Computer chose " + computerChoice + ".");
        System.out.println(outcome);
    }
}