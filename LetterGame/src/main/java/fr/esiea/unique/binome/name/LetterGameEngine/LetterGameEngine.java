package fr.esiea.unique.binome.name.LetterGameEngine;

import java.io.File;

public class LetterGameEngine {

    private SharedBag shareBag;
    private Player player1;
    private Player player2;

    public LetterGameEngine() {
        File file = new File("./LetterGames/src/main/resources/dico.txt");
        if (file.exists() == true) {
            System.out.println("true");
        }

    }

    public static void main(String[] args) {
        LetterGameEngine g = new LetterGameEngine();
    }
}
