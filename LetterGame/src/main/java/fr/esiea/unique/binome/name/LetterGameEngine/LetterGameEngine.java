package fr.esiea.unique.binome.name.LetterGameEngine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class LetterGameEngine {

    private SharedBag shareBag;
    private Player player1;
    private Player player2;

    public LetterGameEngine() {
    	ArrayList<String> dictionary = new ArrayList<String>();
    	
    	String filepath = System.getProperty("user.dir");
    	filepath += "\\src\\main\\resources\\dico.txt";
        File file = new File(filepath);
        
        if (file.exists() == true) {
            System.out.println("true");  
        }

        try {
        	BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        	//StringBuilder str=new StringBuilder();
        	String ligne = null;
			while ((ligne = r.readLine()) != null)
            {
				dictionary.add(ligne);
                //str.append(ligne);
                
            }
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public static void main(String[] args) {
        LetterGameEngine g = new LetterGameEngine();
    }
}
