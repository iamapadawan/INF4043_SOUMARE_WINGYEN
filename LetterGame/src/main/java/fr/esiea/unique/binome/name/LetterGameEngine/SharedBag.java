package fr.esiea.unique.binome.name.LetterGameEngine;

import java.util.ArrayList;

//import com.sun.istack.internal.logging.Logger;

public class SharedBag {

    // private Logger mLogger = Logger.getLogger(SharedBag.class);
    private ArrayList<Character> lListOfLetterOnSharedBag;

    public SharedBag() {

        this.lListOfLetterOnSharedBag = new ArrayList<Character>();

    }

    /*
     * public boolean addLetter(List<Character> pListOfletter) { if (pListOfletter == null || pListOfletter.isEmpty()) { return false; } for
     * (Character lLetterToAdd : pListOfletter) { lListOfLetterOnSharedBag.add(lLetterToAdd); // Show the letter added to the shared Bag //
     * mLogger.info("letter added to the shared Bag: " + lLetterToAdd.toString()); } return true; }
     */

    public boolean addLetter(char pletter) {
        if (pletter == '\u0000') {
            return false;
        } else {
            lListOfLetterOnSharedBag.add(pletter);
            return true;
        }

    }

    public boolean clearBag() {
        lListOfLetterOnSharedBag.clear();
        if (lListOfLetterOnSharedBag.isEmpty()) {
            return true;
        }
        return false;
    }

    public void removeLetters(String wordToRemove) {

        for (char c : wordToRemove.toCharArray()) {

            for (int i = 0; i < lListOfLetterOnSharedBag.size(); i++) {
                if (lListOfLetterOnSharedBag.get(i) == c) {
                    lListOfLetterOnSharedBag.remove(i);
                }
            }
        }
    }

    public ArrayList<Character> getlListOfLetterOnSharedBag() {
        return lListOfLetterOnSharedBag;

    }

    public boolean verifyletters(String word) {
        boolean check = true;
        for (char c : word.toCharArray()) {
            if (lListOfLetterOnSharedBag.contains(c) == false) {
                check = false;
            }
        }
        return check;
    }
    /*
     * public boolean verifyletters(ArrayList<String>listword, String word){
     * 
     * boolean check=true; ArrayList<Character> allLetters= new ArrayList<Character> (); allLetters.addAll(lListOfLetterOnSharedBag); for(String s :
     * listword){ char[] temp = s.toCharArray(); for (int i = 0;i<temp.length;i++){ String letter = ""+temp[i]; if(word.contains(letter)==false){
     * check=false; i=temp.length; } }
     * 
     * }
     * 
     * return check; }
     */

}
