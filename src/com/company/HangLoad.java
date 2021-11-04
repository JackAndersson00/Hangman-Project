package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class HangLoad {

    public static String LoadWord() throws FileNotFoundException { //loads words into a String array list, takes out one word (separated by new lines), returns the random word into the game loop.
        Scanner file = new Scanner(new File(".\\src\\Words.txt"));
        ArrayList<String> words = new ArrayList<>();

        while (file.hasNext()) {
            words.add(file.nextLine());
        }
        Random rng = new Random();
        String Word = words.get(rng.nextInt(words.size()));
        return Word;
    }
}
