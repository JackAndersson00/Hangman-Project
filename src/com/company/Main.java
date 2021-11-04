package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        HangGame.Initialize(); //Initializes things.
        HangGame.Menu(); //Runs the main menu which ultimately runs the game.
    }
}
