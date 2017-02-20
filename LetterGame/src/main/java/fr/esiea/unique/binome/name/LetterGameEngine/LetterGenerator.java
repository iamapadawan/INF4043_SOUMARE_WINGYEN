package LetterGameEngine;
import java.util.Random;


public class LetterGenerator {

	public char pickLetter(){
		Random rand = new Random();
		char letterPicked;
		String letters = "abcdefghijklmnopqrstuvwxyzàâèéîöôùû";
		int longueur = letters.length();
		int k = rand.nextInt(longueur);
		letterPicked =letters.charAt(k);
		return letterPicked;
		
	} 
	    
}
