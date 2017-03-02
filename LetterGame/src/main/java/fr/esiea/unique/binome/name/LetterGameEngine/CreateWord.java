/*
 * Creation : 21 févr. 2017
 */
package fr.esiea.unique.binome.name.LetterGameEngine;

import java.util.ArrayList;

public interface CreateWord {
    public ArrayList<String> getMatchingWord(final String pListOfOpponentWords);
}
