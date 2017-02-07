package fr.esiea.unique.binome.name.LetterGameEngine;

import java.util.ArrayList;

public class SharedBag {

    private ArrayList<Character> lettersList = new ArrayList<Character>();

    public SharedBag() {
        this.lettersList = new ArrayList<Character>();
    }

    public boolean addLetter(Character pletter) {
        lettersList.add(pletter);
        return true;
    }
}
