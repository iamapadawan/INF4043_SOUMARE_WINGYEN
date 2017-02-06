
public class LetterGameEngine {

	private SharedBag shareBag;
	private Player player1;
	private Player player2;
	
	public LetterGameEgine(){
		File file = new File("./LetterGames/src/main/resources/dico.txt");
		if(file.exists() == true) { 
		System.out.println("true");
		}
		
		
	}
	
	
	public static void main (string[] args){
		LetterGameEngine g= new LetterGameEngine();		
	}
}
