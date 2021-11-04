package com.company;

import java.util.ArrayList;
import java.util.Random;

public class HangWord {

    //Chooses a random word depending on the category and difficulty chosen.
    public static String ChosenWord(int difficulty, int category){
            Random RNG = new Random();
            String[] WordArry;
            String ChoosenWord = "";
            int WordAmount = 0;
            String Word = "Big eye holes";
         switch (category){
             case 1: //Animals
                 switch (difficulty){
                     case 1: // Easy
                         WordArry = new String[]{"dog", "cat", "rat", "cow", "ant", "pig", "bat", "ape", "fox", "hog", "owl", "ewe", "doe", "hen", "elk", "ram",
                                 "bee", "fly", "eel", "wolf", "goat", "frog", "duck", "crab", "fish", "lamb", "lion", "mule", "worm", "seal", "swan", "toad", "kiwi", "crow"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 2: //Intermediate
                         WordArry = new String[] {"tiger", "horse", "whale", "zebra", "mouse", "moose", "camel", "koala", "sheep", "hyena", "rhino", "otter", "bison",
                                 "panda", "dingo", "llama", "lemur", "skunk", "sloth", "monkey", "rabbit", "donkey", "jaguar", "badger", "coyote", "ferret", "beaver",
                                 "cougar", "walrus", "weasel", "jackal", "possum"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 3: //Hard
                         WordArry = new String[] {"gorilla", "cheetah", "giraffe", "dolphin", "leopard", "raccoon", "buffalo", "panther", "hamster", "elephant", "kangaroo", "aardvark",
                                 "antelope", "squirrel", "tortoise", "anaconda", "flamingo", "chipmunk", "hedgehog", "mongoose", "goldfish", "bullfrog", "crayfish", "honeybee", "malamute"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 4: //Chaos
                         WordArry = new String[] {"dog", "cat", "rat", "cow", "ant", "pig", "bat", "ape", "fox", "hog", "owl", "ewe", "doe", "hen", "elk", "ram",
                                 "bee", "fly", "eel", "wolf", "goat", "frog", "duck", "crab", "fish", "lamb", "lion", "mule", "worm", "seal", "swan", "toad", "kiwi", "crow",
                                 "tiger", "horse", "whale", "zebra", "mouse", "moose", "camel", "koala", "sheep", "hyena", "rhino", "otter", "bison",
                                 "panda", "dingo", "llama", "lemur", "skunk", "sloth", "monkey", "rabbit", "donkey", "jaguar", "badger", "coyote", "ferret", "beaver",
                                 "cougar", "walrus", "weasel", "jackal", "possum", "gorilla", "cheetah", "giraffe", "dolphin", "leopard", "raccoon", "buffalo", "panther",
                                 "hamster", "elephant", "kangaroo", "aardvark", "antelope", "squirrel", "tortoise", "anaconda", "flamingo", "chipmunk", "hedgehog",
                                 "mongoose", "goldfish", "bullfrog", "crayfish", "honeybee", "malamute"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                 }
                 break;
             case 2: //People
                 switch (difficulty){
                     case 1: //Easy
                         WordArry = new String[] {"jim", "max", "john", "jack", "joe", "bill", "zack", "zoey", "james", "logan", "mason", "jacob", "zince", "ethan", "isaac", "elias",
                                 "eddie", "gavin", "david", "bjorn", "billy", "clyde", "danny", "brian", "blake", "chris", "bruno", "henri", "clark", "casey", "peter", "pedro",
                                 "keanu", "kim", "alex", "jill", "jinn", "jen", "elli", "finn", "frisk", "kris", "chara"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 2: //Intermediate
                         WordArry = new String[] {"charlie", "stanley", "vincent", "amanda", "jackie", "bailey", "baxter", "andrea", "angela", "bernie", "annika", "monika", "bradly", "corina", "corrie",
                                 "colson", "cooper", "daniel", "duncan", "dorian", "dwight", "dillie", "evelyn", "edward", "finley", "jaimie", "jeffry", "justine", "kalvin", "leanna", "lucius",
                                 "malvin", "marcel", "oliver", "philip", "reggie", "steven", "xavier", "shelby", "taylor", "teresa", "violet", "yvonne", "william", "michael", "matthew",
                                 "jackson", "anthony", "lincoln", "ezekiel", "jameson", "charles", "cameron", "dominic", "greyson", "grayson", "gabriel", "madison", "paisley", "natalie",
                                 "genesis", "kennedy", "arianna"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 3: //Hard
                         WordArry = new String[] {"alexander", "isabella", "scarlett", "victoria", "penelope", "savannah", "brooklyn", "samantha", "caroline", "jennifer", "beatrice",
                                 "celestia", "fantasia", "jacintha", "penelope", "veronica", "augustus", "benedict", "emmanuel", "franklin", "lawrence", "giovanni", "felicity", "kristian",
                                 "winfield", "rochelle", "stanford", "izabella", "nickolas", "nicklaus", "napoleon", "mohammed", "mercedes", "sunshine", "treasure", "winifred",
                                 "catherine", "catharine", "katharine", "katherine", "elisabeth", "sylvester", "rosabelle", "theodosia", "chantelle", "antonetta", "christian", "alexandria"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 4: //Chaos
                         WordArry = new String[] {"jim", "max", "john", "jack", "joe", "bill", "zack", "zoey", "james", "logan", "mason", "jacob", "zince", "ethan", "isaac", "elias",
                                 "eddie", "gavin", "david", "bjorn", "billy", "clyde", "danny", "brian", "blake", "chris", "bruno", "henri", "clark", "casey", "peter", "pedro",
                                 "keanu", "kim", "alex", "jill", "jinn", "jen", "elli", "finn", "frisk", "kris", "chara", "charlie", "stanley", "vincent", "amanda", "jackie", "bailey",
                                 "baxter", "andrea", "angela", "bernie", "annika", "monika", "bradly", "corina", "corrie",
                                 "colson", "cooper", "daniel", "duncan", "dorian", "dwight", "dillie", "evelyn", "edward", "finley", "jaimie", "jeffry", "justine", "kalvin", "leanna", "lucius",
                                 "malvin", "marcel", "oliver", "philip", "reggie", "steven", "xavier", "shelby", "taylor", "teresa", "violet", "yvonne", "william", "michael", "matthew",
                                 "jackson", "anthony", "lincoln", "ezekiel", "jameson", "charles", "cameron", "dominic", "greyson", "grayson", "gabriel", "madison", "paisley", "natalie",
                                 "genesis", "kennedy", "arianna", "alexander", "isabella", "scarlett", "victoria", "penelope", "savannah", "brooklyn", "samantha", "caroline", "jennifer", "beatrice",
                                 "celestia", "fantasia", "jacintha", "penelope", "veronica", "augustus", "benedict", "emmanuel", "franklin", "lawrence", "giovanni", "felicity", "kristian",
                                 "winfield", "rochelle", "stanford", "izabella", "nickolas", "nicklaus", "napoleon", "mohammed", "mercedes", "sunshine", "treasure", "winifred",
                                 "catherine", "catharine", "katharine", "katherine", "elisabeth", "sylvester", "rosabelle", "theodosia", "chantelle", "antonetta", "christian", "alexandria"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                 }
                 break;
             case 3: //Places
                 switch (difficulty){
                     case 1: //Easy
                         WordArry = new String[] {"oslo", "oulu", "omsk", "oral", "oran", "rome", "ruse", "reno", "riga", "qufu", "perm", "nara", "hell", "suez", "sfax", "vigo", "wuhu", "pisa",
                                 "apia", "metz", "lyon", "linz", "lima", "lviv", "loja", "kiev", "kobe", "kofu", "juba", "jena", "homs", "giza", "graz", "gary", "gaya", "gifu", "guri", "fuji",
                                 "erie", "dili", "doha", "dali", "caen", "cali", "cork", "coro", "baku", "bari", "bath", "paris", "lagos"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 2: //Intermediate
                         WordArry = new String[] {"ankara", "asmara", "dublin", "berlin", "london", "astana", "athens", "avarua", "bamako", "bengui", "banjui", "beirut", "bissau", "dodoma", "dublin",
                                 "harare", "havana", "kigali", "lisbon", "luanda", "lusaka", "madrid", "majuro", "malabo", "manama", "manila", "maputo", "maseru", "monaco", "moroni", "moscow",
                                 "muscat", "nassau", "niamey", "prague", "riyadh", "roseau", "saigon", "saipan", "skopje", "taipei", "tehran", "tirana", "vienna", "warsaw", "zagreb"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 3: //Hard
                         WordArry = new String[] {"algiers", "baghdad", "bangkok", "beijing", "belfast", "bishkek", "caracas", "cardiff", "colombo", "conakry", "douglas", "honiara", "jakarta",
                                 "kampala", "karachi", "managua", "marigot", "mbabane", "nairobi", "nicosia", "palikir", "papeete", "rangoon", "stanley", "tallinn", "tbilisi", "thimphu",
                                 "tripoli", "vilnius", "yerevan", "ashgabat", "belgrade", "belmopan", "brasilia", "brussels", "Budapest", "canberra", "castries", "chisinau", "damascus",
                                 "djibouti", "dushanbe", "freetown", "funafuti", "gaborone", "gustavia", "hamilton"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 4: //Chaos
                         WordArry = new String[] {"oslo", "oulu", "omsk", "oral", "oran", "rome", "ruse", "reno", "riga", "qufu", "perm", "nara", "hell", "suez", "sfax", "vigo", "wuhu", "pisa",
                                 "apia", "metz", "lyon", "linz", "lima", "lviv", "loja", "kiev", "kobe", "kofu", "juba", "jena", "homs", "giza", "graz", "gary", "gaya", "gifu", "guri", "fuji",
                                 "erie", "dili", "doha", "dali", "caen", "cali", "cork", "coro", "baku", "bari", "bath", "paris", "lagos", "ankara", "asmara", "dublin", "berlin", "london", "astana", "athens", "avarua", "bamako", "bengui", "banjui", "beirut", "bissau", "dodoma", "dublin",
                                 "harare", "havana", "kigali", "lisbon", "luanda", "lusaka", "madrid", "majuro", "malabo", "manama", "manila", "maputo", "maseru", "monaco", "moroni", "moscow",
                                 "muscat", "nassau", "niamey", "prague", "riyadh", "roseau", "saigon", "saipan", "skopje", "taipei", "tehran", "tirana", "vienna", "warsaw", "zagreb", "algiers", "baghdad", "bangkok", "beijing", "belfast", "bishkek", "caracas", "cardiff", "colombo", "conakry", "douglas", "honiara", "jakarta",
                                 "kampala", "karachi", "managua", "marigot", "mbabane", "nairobi", "nicosia", "palikir", "papeete", "rangoon", "stanley", "tallinn", "tbilisi", "thimphu",
                                 "tripoli", "vilnius", "yerevan", "ashgabat", "belgrade", "belmopan", "brasilia", "brussels", "Budapest", "canberra", "castries", "chisinau", "damascus",
                                 "djibouti", "dushanbe", "freetown", "funafuti", "gaborone", "gustavia", "hamilton", "plymouth"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                 }
                 break;
             case 4: //Chaos
                 switch (difficulty){
                     case 1: //Easy
                         WordArry = new String[] {"dog", "cat", "rat", "cow", "ant", "pig", "bat", "ape", "fox", "hog", "owl", "ewe", "doe", "hen", "elk", "ram",
                                 "bee", "fly", "eel", "wolf", "goat", "frog", "duck", "crab", "fish", "lamb", "lion", "mule", "worm", "seal", "swan", "toad", "kiwi", "crow",
                                 "jim", "max", "john", "jack", "joe", "bill", "zack", "zoey", "james", "logan", "mason", "jacob", "zince", "ethan", "isaac", "elias",
                                 "eddie", "gavin", "david", "bjorn", "billy", "clyde", "danny", "brian", "blake", "chris", "bruno", "henri", "clark", "casey", "peter", "pedro",
                                 "keanu", "kim", "alex", "jill", "jinn", "jen", "elli", "finn", "frisk", "kris", "chara", "oslo", "oulu", "omsk", "oral", "oran", "rome", "ruse", "reno", "riga",
                                 "qufu", "perm", "nara", "hell", "suez", "sfax", "vigo", "wuhu", "pisa",
                                 "apia", "metz", "lyon", "linz", "lima", "lviv", "loja", "kiev", "kobe", "kofu", "juba", "jena", "homs", "giza", "graz", "gary", "gaya", "gifu", "guri", "fuji",
                                 "erie", "dili", "doha", "dali", "caen", "cali", "cork", "coro", "baku", "bari", "bath", "paris", "lagos"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 2: //Intermediate
                         WordArry = new String[] {"tiger", "horse", "whale", "zebra", "mouse", "moose", "camel", "koala", "sheep", "hyena", "rhino", "otter", "bison",
                                 "panda", "dingo", "llama", "lemur", "skunk", "sloth", "monkey", "rabbit", "donkey", "jaguar", "badger", "coyote", "ferret", "beaver",
                                 "cougar", "walrus", "weasel", "jackal", "possum", "charlie", "stanley", "vincent", "amanda", "jackie", "bailey", "baxter", "andrea", "angela", "bernie",
                                 "annika", "monika", "bradly", "corina", "corrie",
                                 "colson", "cooper", "daniel", "duncan", "dorian", "dwight", "dillie", "evelyn", "edward", "finley", "jaimie", "jeffry", "justine", "kalvin", "leanna", "lucius",
                                 "malvin", "marcel", "oliver", "philip", "reggie", "steven", "xavier", "shelby", "taylor", "teresa", "violet", "yvonne", "william", "michael", "matthew",
                                 "jackson", "anthony", "lincoln", "ezekiel", "jameson", "charles", "cameron", "dominic", "greyson", "grayson", "gabriel", "madison", "paisley", "natalie",
                                 "genesis", "kennedy", "arianna", "ankara", "asmara", "dublin", "berlin", "london", "astana", "athens", "avarua", "bamako", "bengui", "banjui", "beirut", "bissau",
                                 "dodoma", "dublin",
                                 "harare", "havana", "kigali", "lisbon", "luanda", "lusaka", "madrid", "majuro", "malabo", "manama", "manila", "maputo", "maseru", "monaco", "moroni", "moscow",
                                 "muscat", "nassau", "niamey", "prague", "riyadh", "roseau", "saigon", "saipan", "skopje", "taipei", "tehran", "tirana", "vienna", "warsaw", "zagreb"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 3: //Hard
                         WordArry = new String[] {"gorilla", "cheetah", "giraffe", "dolphin", "leopard", "raccoon", "buffalo", "panther", "hamster", "elephant", "kangaroo", "aardvark",
                                 "antelope", "squirrel", "tortoise", "anaconda", "flamingo", "chipmunk", "hedgehog", "mongoose", "goldfish", "bullfrog", "crayfish", "honeybee", "malamute",
                                 "alexander", "isabella", "scarlett", "victoria", "penelope", "savannah", "brooklyn", "samantha", "caroline", "jennifer", "beatrice",
                                 "celestia", "fantasia", "jacintha", "penelope", "veronica", "augustus", "benedict", "emmanuel", "franklin", "lawrence", "giovanni", "felicity", "kristian",
                                 "winfield", "rochelle", "stanford", "izabella", "nickolas", "nicklaus", "napoleon", "mohammed", "mercedes", "sunshine", "treasure", "winifred",
                                 "catherine", "catharine", "katharine", "katherine", "elisabeth", "sylvester", "rosabelle", "theodosia", "chantelle", "antonetta", "christian", "alexandria",
                                 "algiers", "baghdad", "bangkok", "beijing", "belfast", "bishkek", "caracas", "cardiff", "colombo", "conakry", "douglas", "honiara", "jakarta",
                                 "kampala", "karachi", "managua", "marigot", "mbabane", "nairobi", "nicosia", "palikir", "papeete", "rangoon", "stanley", "tallinn", "tbilisi", "thimphu",
                                 "tripoli", "vilnius", "yerevan", "ashgabat", "belgrade", "belmopan", "brasilia", "brussels", "Budapest", "canberra", "castries", "chisinau", "damascus",
                                 "djibouti", "dushanbe", "freetown", "funafuti", "gaborone", "gustavia", "hamilton"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                     case 4: //Chaos
                         WordArry = new String[] {"dog", "cat", "rat", "cow", "ant", "pig", "bat", "ape", "fox", "hog", "owl", "ewe", "doe", "hen", "elk", "ram",
                                 "bee", "fly", "eel", "wolf", "goat", "frog", "duck", "crab", "fish", "lamb", "lion", "mule", "worm", "seal", "swan", "toad", "kiwi", "crow",
                                 "tiger", "horse", "whale", "zebra", "mouse", "moose", "camel", "koala", "sheep", "hyena", "rhino", "otter", "bison",
                                 "panda", "dingo", "llama", "lemur", "skunk", "sloth", "monkey", "rabbit", "donkey", "jaguar", "badger", "coyote", "ferret", "beaver",
                                 "cougar", "walrus", "weasel", "jackal", "possum", "gorilla", "cheetah", "giraffe", "dolphin", "leopard", "raccoon", "buffalo", "panther",
                                 "hamster", "elephant", "kangaroo", "aardvark", "antelope", "squirrel", "tortoise", "anaconda", "flamingo", "chipmunk", "hedgehog",
                                 "mongoose", "goldfish", "bullfrog", "crayfish", "honeybee", "malamute",
                                 "jim", "max", "john", "jack", "joe", "bill", "zack", "zoey", "james", "logan", "mason", "jacob", "zince", "ethan", "isaac", "elias",
                                 "eddie", "gavin", "david", "bjorn", "billy", "clyde", "danny", "brian", "blake", "chris", "bruno", "henri", "clark", "casey", "peter", "pedro",
                                 "keanu", "kim", "alex", "jill", "jinn", "jen", "elli", "finn", "frisk", "kris", "chara", "charlie", "stanley", "vincent", "amanda", "jackie", "bailey",
                                 "baxter", "andrea", "angela", "bernie", "annika", "monika", "bradly", "corina", "corrie",
                                 "colson", "cooper", "daniel", "duncan", "dorian", "dwight", "dillie", "evelyn", "edward", "finley", "jaimie", "jeffry", "justine", "kalvin", "leanna", "lucius",
                                 "malvin", "marcel", "oliver", "philip", "reggie", "steven", "xavier", "shelby", "taylor", "teresa", "violet", "yvonne", "william", "michael", "matthew",
                                 "jackson", "anthony", "lincoln", "ezekiel", "jameson", "charles", "cameron", "dominic", "greyson", "grayson", "gabriel", "madison", "paisley", "natalie",
                                 "genesis", "kennedy", "arianna", "alexander", "isabella", "scarlett", "victoria", "penelope", "savannah", "brooklyn", "samantha", "caroline", "jennifer", "beatrice",
                                 "celestia", "fantasia", "jacintha", "penelope", "veronica", "augustus", "benedict", "emmanuel", "franklin", "lawrence", "giovanni", "felicity", "kristian",
                                 "winfield", "rochelle", "stanford", "izabella", "nickolas", "nicklaus", "napoleon", "mohammed", "mercedes", "sunshine", "treasure", "winifred",
                                 "catherine", "catharine", "katharine", "katherine", "elisabeth", "sylvester", "rosabelle", "theodosia", "chantelle", "antonetta", "christian", "alexandria",
                                 "oslo", "oulu", "omsk", "oral", "oran", "rome", "ruse", "reno", "riga", "qufu", "perm", "nara", "hell", "suez", "sfax", "vigo", "wuhu", "pisa",
                                 "apia", "metz", "lyon", "linz", "lima", "lviv", "loja", "kiev", "kobe", "kofu", "juba", "jena", "homs", "giza", "graz", "gary", "gaya", "gifu", "guri", "fuji",
                                 "erie", "dili", "doha", "dali", "caen", "cali", "cork", "coro", "baku", "bari", "bath", "paris", "lagos", "ankara", "asmara", "dublin", "berlin", "london", "astana", "athens", "avarua", "bamako", "bengui", "banjui", "beirut", "bissau", "dodoma", "dublin",
                                 "harare", "havana", "kigali", "lisbon", "luanda", "lusaka", "madrid", "majuro", "malabo", "manama", "manila", "maputo", "maseru", "monaco", "moroni", "moscow",
                                 "muscat", "nassau", "niamey", "prague", "riyadh", "roseau", "saigon", "saipan", "skopje", "taipei", "tehran", "tirana", "vienna", "warsaw", "zagreb", "algiers", "baghdad", "bangkok", "beijing", "belfast", "bishkek", "caracas", "cardiff", "colombo", "conakry", "douglas", "honiara", "jakarta",
                                 "kampala", "karachi", "managua", "marigot", "mbabane", "nairobi", "nicosia", "palikir", "papeete", "rangoon", "stanley", "tallinn", "tbilisi", "thimphu",
                                 "tripoli", "vilnius", "yerevan", "ashgabat", "belgrade", "belmopan", "brasilia", "brussels", "Budapest", "canberra", "castries", "chisinau", "damascus",
                                 "djibouti", "dushanbe", "freetown", "funafuti", "gaborone", "gustavia", "hamilton", "plymouth"};
                         WordAmount = WordArry.length; //value needed for the RNG effect.
                         Word = WordArry[RNG.nextInt(WordAmount)];
                         break;
                 }
                 break;
         }
         return Word;
    }
    //displays the chosen word as underscores, checks if any of the players guesses are correct and fills in those blanks. If all blanks are filled, it returns a true value, otherwise false.
    public static boolean TestHiddenWord(String Word, ArrayList<Character> GuessArray){
        int CorrectCount = 0;
        for (int i = 0; i < Word.length();i++){
            char HiddenCharAt = Word.charAt(i);
            if (GuessArray.contains(HiddenCharAt)) {
                CorrectCount++;
                System.out.print(HiddenCharAt);
            }
            else if (HiddenCharAt != ' ') {
                System.out.print("_");
            }
            else {
                System.out.println(" ");
            }
        }
        if (CorrectCount == Word.length()){
            return true;
        } else return false;
    }
}
