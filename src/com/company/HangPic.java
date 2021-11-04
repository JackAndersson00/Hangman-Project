package com.company;

public class HangPic {

    //Print out current Hangman's status, or rather how far you have until "Game over". ASCII hangman progression display.
    public static void GetStatus(int Status){
        switch (Status){
            case 1:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 2:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );

                break;
            case 3:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "  |   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 4:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 5:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                "      |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 6:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " /    |\n" +
                                "      |\n" +
                                "========="
                );
                break;
            case 7:
                System.out.println(
                                "  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " / \\  |\n" +
                                "      |\n" +
                                "========="
                );
                break;
        }
    } //The menu ASCII pic:
    public static void MenuPic(){
        System.out.println(" Welcome to HANGMAN!\n" +
                           "====================");
        System.out.println( "  O          +---+\n" +
                            " /|\\         0   |\n" +
                            " / \\             |\n");
    }
}
