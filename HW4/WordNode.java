package HW4;


public class WordNode {
	private String word;
	public WordNode left;
	public WordNode right;
	
	public WordNode(String word) {
		this.word = word;
		left = null;
		right = null;
	}
	public String getWord() {
		return word;
	}
	public void setWord(WordNode word) {
		this.word = word.toString();
	}
}
