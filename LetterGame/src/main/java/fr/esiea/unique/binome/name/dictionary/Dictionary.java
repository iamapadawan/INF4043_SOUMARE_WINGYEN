/*
 * Creation : 21 févr. 2017
 */
package fr.esiea.unique.binome.name.dictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Dictionary {

    private ArrayList<String> dictionary;

    public Dictionary() {

        dictionary = new ArrayList<String>();

        String filepath = System.getProperty("user.dir");
        filepath += "\\src\\main\\resources\\dico.txt";
        File file = new File(filepath);

        if (file.exists() == true) {
            System.out.println("true");
        }

        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String ligne = null;
            while ((ligne = r.readLine()) != null) {
                if (ligne.length() > 1) {
                    dictionary.add(ligne);
                }

            }

        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TOD1O Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean isAword(String word) {

        if (dictionary.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> getDictionary() {
        return dictionary;
    }

    /*
     * @Override public String isWord(ArrayList<String> word) { // TODO Auto-generated method stub return null; }
     */
}
