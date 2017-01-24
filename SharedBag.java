
public class SharedBag {

	private ArrayList<char>() letters;
	
	public ShareBag(){
		this.letters = new ArrayList<char>();
	}
	
	public boolean addLetter(char letter){
		
		letters.add(letter);
		return true;
	}
}
