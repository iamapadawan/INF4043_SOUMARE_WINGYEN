package fr.esiea.unique.binome.name.LetterGameEngine;

import java.util.ArrayList;
import java.util.List;

import com.sun.istack.internal.logging.Logger;

public class SharedBag {

    private Logger mLogger = Logger.getLogger(SharedBag.class);
    private ArrayList<Character> lListOfLetterOnSharedBag;

    public SharedBag() {
        this.lListOfLetterOnSharedBag = new ArrayList<Character>();
    }

    public boolean addLetter(List<Character> pListOfletter) {
        if (pListOfletter == null || pListOfletter.isEmpty()) {
            return false;
        }
        for (Character lLetterToAdd : pListOfletter) {
            lListOfLetterOnSharedBag.add(lLetterToAdd);
            // Show the letter added to the shared Bag
            mLogger.info("letter added to the shared Bag: " + lLetterToAdd.toString());
        }
        return true;
    }

    public boolean clearBag() {
        lListOfLetterOnSharedBag.clear();
        if (lListOfLetterOnSharedBag.isEmpty()) {
            return true;
        }
        return false;
    }
}
