package HW4;


public class Main {

	public static void main(String[] args) {
		SearchTree myTree = new SearchTree();
		
		myTree.addWordNode("Hello");
		myTree.addWordNode("Bingo");
		myTree.addWordNode("Plane");
		myTree.addWordNode("Mathematics");
		myTree.addWordNode("Code");
		myTree.addWordNode("Icee");
		myTree.addWordNode("Cars");
		myTree.addWordNode("City");
		myTree.addWordNode("Pancakes");
		myTree.addWordNode("Game");
		myTree.addWordNode("Zebra");

		
		
		//AFTER IMPLEMENTATION OF THE SEARCH TREE, THESE ARE THE OUTPUTS FOR THE FOLLOWING CHECKWORD() FUNCTION
		myTree.checkWord("Icee");
		//Correctly eliminates Icee
		
		myTree.checkWord("City");
		//Correctly Eliminates City
		
		myTree.checkWord("Bingo");
		//correctly eliminates the 1st term, bingo
		
		myTree.checkWord("Zebra");
		//correctly eliminates the last term, zebra
		myTree.inOrder();
		
		
	}

}
