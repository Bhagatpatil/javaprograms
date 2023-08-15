import java.util.Scanner;
import java.util.Random;

public class game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String userChoice = scanner.nextLine().toLowerCase();

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) {
                System.out.println("You win! Rock beats Scissors.");
            } else {
                System.out.println("You lose! Paper beats Rock.");
            }
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) {
                System.out.println("You win! Paper beats Rock.");
            } else {
                System.out.println("You lose! Scissors beats Paper.");
            }
        } else if (userChoice.equals("scissors")) {
            if (computerChoice.equals("paper")) {
                System.out.println("You win! Scissors beats Paper.");
            } else {
                System.out.println("You lose! Rock beats Scissors.");
            }
        } else {
            System.out.println("Invalid input. Please choose rock, paper, or scissors.");
        }
    }
}

//it is game of rock paper scissors 
