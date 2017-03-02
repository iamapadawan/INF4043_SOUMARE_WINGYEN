/**Creation:21 févr.2017*/
package fr.esiea.unique.binome.name.LetterGameEngine.internal;

import java.util.ArrayList;

import fr.esiea.unique.binome.name.LetterGameEngine.CreateWord;
import fr.esiea.unique.binome.name.dictionary.Dictionary;

public class CreateWordImpl implements CreateWord {

    @Override
    public ArrayList<String> getMatchingWord(final String pListOfOpponentWords) {
        ArrayList<String> matches = new ArrayList<String>();

        Dictionary ldictionary = new Dictionary();
        // get the list of possible word from dictionary
        ArrayList<String> lListOfWordFromDictionary = ldictionary.getDictionary();

        // for each word in dictionary
        for (String word : lListOfWordFromDictionary) {

            // match flag
            Boolean nonMatch = true;

            // for each character of dictionary word
            for (char chW : word.toCharArray()) {

                String w = Character.toString(chW);

                // if the count of chW in word is equal to its count in input,
                // then, they are match
                if (word.length() - word.replace(w, "").length() != pListOfOpponentWords.length() - pListOfOpponentWords.replace(w, "").length()) {
                    nonMatch = false;
                    break;
                }
            }
            if (nonMatch) {
                matches.add(word);
            }
        }

        System.out.println(matches);
        return matches;

    }
}