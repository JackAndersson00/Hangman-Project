package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangGame {
    //initialisation with static implementations gets done.
    public static Scanner input = new Scanner(System.in);
    public static boolean RunCM;
    public static boolean RunMM;
    public static int Difficulty;
    public static int Category;
    public static boolean RunCG;
    public static int HangCount;
    public static boolean RunVS;
    public static boolean RunLG;

    public static void Initialize(){  //initializes necessary components.
        // RunCM = Run Classic Menu. RunMM = Run Main Menu. RunCG = Run Classic Game
        RunCM = true;
        RunMM = true;
        Difficulty = 1; //default difficulty.
        Category = 1; //default category.
        RunCG = true;
    }

    public static void Classic() { //method for the menu of the classic gamemode.
        //RunCM = Run Classic Menu
        RunCM = true;
        while (RunCM) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Welcome to HANGMAN Classic!");
            System.out.println("Type 1-4 to choose your options");
            System.out.println("1: Start                 *Starts the game with the settings you have.");
            System.out.println("2: Difficulty [" + DifficultyStatus(Difficulty) + "]       *Easy: short, Intermediate: medium-length, Hard: long, Chaos: All.");
            System.out.println("3: Category [" + CategoryStatus(Category) + "]      *Choose what category the words are selected from. Chaos: All.");
            System.out.println("4: Back                   *Goes back to main menu.");
            System.out.print("> ");
            int Choice = input.nextInt(); //reads players input regarding the 4 options.

            if (Choice == 1){ //Starts the game with current category and difficulty.
                ClassicStart(Difficulty, Category);
            }
            if (Choice == 2){ //Toggles between the different difficulties.
                DifficultyToggle();
            }
            if (Choice == 3){ //toggles between the different categories.
                CategoryToggle();
            }
            if (Choice == 4){ //quits the current game mode and returns to main menu.
                System.out.println("Backing out..");
                RunCM = false; //breaks classic game loop.
                break;
            }
        }
    }

    public static String DifficultyStatus(int Choice){ //depending on input, displays different strings of difficulty.
        String Answer;
        switch (Choice){
            case 1:
                Answer = "Easy";
                break;
            case 2:
                Answer = "Intermediate";
                break;
            case 3:
                Answer = "Hard";
                break;
            case 4:
                Answer = "Chaos";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Choice);
        }
        return Answer;
    }

    public static String CategoryStatus(int Choice){ //depending on input, displays different strings of category.
        String Answer;
        switch (Choice){
            case 1:
                Answer = "Animals";
                break;
            case 2:
                Answer = "People";
                break;
            case 3:
                Answer = "Places";
                break;
            case 4:
                Answer = "Chaos";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Choice);
        }
        return Answer;
    }

    public static void DifficultyToggle(){ //loops between the 4 difficulties.
        if (Difficulty < 4) {
            Difficulty++;
        } else {Difficulty = 1;}
    }
    public static void CategoryToggle(){ //loops between the 4 categories.
        if (Category < 4) {
            Category++;
        } else {Category = 1;}
    }

    public static void ClassicStart(int Difficulty, int Category){ //Method for classic gamemode. Player gets a random word based on the selected category and difficulty.
        String Word = HangWord.ChosenWord(Difficulty, Category); //word is randomly selected in regard to category and difficulty.
        RunCG = true; //makes sure that the game loops.
        HangCount= 1; //resets the hanging of the man progression
        ArrayList<Character> GuessArray = new ArrayList<>(); //creates array for guessing attempts.
        while (RunCG) {
            HangPic.GetStatus(HangCount); //shows current progression towards hanging the man.
            if (HangCount >= 7){ //if the progression towards hanging the man is complete, player loses and loop breaks.
                System.out.println("Game Over!\nThe secret word was: "+Word);
                PressAnyKeyToContinue(); //stalls for input.
                RunCG = false; //breaks loop.
                break;
            }

            if (HangWord.TestHiddenWord(Word, GuessArray)){ //Displays what letters of the word has been guessed and if all are guessed, player wins.
                System.out.println("\nYou win!");
                PressAnyKeyToContinue();
                RunCG = false;
                break;
            }
            if (!GetGuessing(input, Word, GuessArray)){ //penalizes the player for faulty inputs, progresses the hanging of the man.
                System.out.println("Wrong letter!");
                PressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                HangCount++;
            }
            System.out.println("Word inputs: "+GuessArray);
        }
    }
    public static void LoadStart() throws FileNotFoundException { //Method for Loading gamemode. Player gets a random word based on the selected file.
        String Word = HangLoad.LoadWord(); //Loads words from file and puts in an array. Randomly picks word from array.
        RunLG = true; //makes sure that the game loops.
        HangCount= 1; //resets the hanging of the man progression
        ArrayList<Character> GuessArray = new ArrayList<>(); //creates array for guessing attempts.
        while (RunLG) {
            HangPic.GetStatus(HangCount); //shows current progression towards hanging the man.
            if (HangCount >= 7){ //if the progression towards hanging the man is complete, player loses and loop breaks.
                System.out.println("Game Over!\nThe secret word was: "+Word);
                PressAnyKeyToContinue(); //stalls for input.
                RunLG = false; //breaks loop.
                break;
            }

            if (HangWord.TestHiddenWord(Word, GuessArray)){ //Displays what letters of the word has been guessed and if all are guessed, player wins.
                System.out.println("\nYou win!");
                PressAnyKeyToContinue();
                RunLG = false;
                break;
            }
            if (!GetGuessing(input, Word, GuessArray)){ //penalizes the player for faulty inputs, progresses the hanging of the man.
                System.out.println("Wrong letter!");
                PressAnyKeyToContinue();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                HangCount++;
            }
            System.out.println("Word inputs: "+GuessArray);
        }
    }

    public static void PressAnyKeyToContinue() //method for temporary pause until input is given.
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
    public static boolean GetGuessing(Scanner input, String Word, ArrayList<Character> GuessArray){  //adds input into the guess list. Checks for quit requests, and checks correct input.
        System.out.print("\n*Please enter a letter*\n< ");
        String MyGuess = input.next();
        GuessArray.add(MyGuess.charAt(0));
        System.out.println(GuessArray);
        if (MyGuess.equalsIgnoreCase("quit")){
            RunCG = false;
            return true;
        }
        if (Word.contains(MyGuess)){
            return true;
        } else {return false;}
    }

    public static void Menu() throws FileNotFoundException {
        //RunMM = Run Main Menu
        while (RunMM) { //Runs menu while RunMM is on.
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            HangPic.MenuPic(); //prints the main menu ASCII pic.
            System.out.println("Type 1-4 to choose!");
            System.out.println("1: Classic      *Challenge yourself with the original HANGMAN.");
            System.out.println("2: Custom       *Load in your own new words to challenge yourself!");
            System.out.println("3: Versus       *Challenge yourself against another player!");
            System.out.println("4: Quit         *Exits the program.");
            System.out.print("> ");
            int Choice = input.nextInt();
            if (Choice == 4) {
                System.out.println("Exiting..");
                RunMM = false;
            } else if (Choice == 1) { //If chosen option 1, run classic gamemode.
                System.out.println("You chose: Classic!");
                Classic();
            } else if (Choice == 2) { //If chosen option 1, run load words gamemode.
                System.out.println("You chose: Custom!");
                LoadStart();
            } else if (Choice == 3) { //If chosen option 1, run versus gamemode.
                System.out.println("You chose: Versus!");
                Versus();
            }
        }
    }



    private static void Versus() { //Method for versus mode, both players names are given. Player 1 inputs secret word. Player 2 guesses.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        String[] Player = VersusNames(); //Sets and gets player 1 and player 2 names.
        System.out.println(Player[0]+", please enter the word. " +Player[1]+ ", look away.");
        String Word = input.next(); //Player 1 inserts the chosen word.
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                HangCount = 1; //Resets the hangman counter, aka your progress to hanging the man.
                RunVS = true; //makes sure that the versus loop initialize
        ArrayList<Character> GuessArray = new ArrayList<>(); //Creates a new array made to collect the player's guesses.
        while (RunVS) { //Runs loop while RunVS is true.
            HangPic.GetStatus(HangCount); //shows the current progression towards hanging the man.
            if (HangCount >= 7) { //if the progression  towards hanging the man is completed, player 1 wins and player 2 loses.
                System.out.println("Game over, "+ Player[1]+". "+Player[0]+ " wins! \nThe secret word was: " + Word+".");
                PressAnyKeyToContinue(); //Waits for players input to continue.
                RunVS = false; //breaks the loop.
                break;
            }

            if (HangWord.TestHiddenWord(Word, GuessArray)) { //Checks what blanks of the word is revealed and if all is revealed player 2 wins.
                System.out.println("\n"+Player[1]+" wins! Better luck next time, "+Player[0]+".");
                PressAnyKeyToContinue(); //waits for player input to continue.
                RunVS = false; //breaks the loop.
                break;
            }
            if (!GetGuessing(input, Word, GuessArray)) { //penalizes the player for guessing wrong.
                System.out.println("Wrong letter, "+Player[1]+"!");
                PressAnyKeyToContinue(); //awaits player input to continue.
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                HangCount++; //progresses the hanging of the man.
            }
            System.out.println("Word inputs: " + GuessArray);
        }
    }

    private static String[] VersusNames() { //method for naming player 1 and player 2.
        System.out.print("\nEnter Player 1 name: > ");
        String Player1 = input.next(); //Player 1's name gets set.
        System.out.print("\nEnter Player 2 name: > ");
        String Player2 = input.next(); //Player 2's name gets set.
        String[] Player = new String[] {Player1, Player2};
        System.out.println("Player 1: "+ Player[0] + "\nPlayer 2: "+Player[1]);
        return Player; //return string of both player names.
    }
}
