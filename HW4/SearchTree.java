package HW4;


public class SearchTree {

	public WordNode root;

	//constructor
	public SearchTree() {
		root = null;
	}

	public void addWordNode(String word) {
		//create temporary node
		WordNode temp = new WordNode(word);

		//if the tree is empty, place the first item at the root
		if(root == null)
			root = temp;
		//using insert() to insert it into the correct location
		else {
			insert(root, temp);
		}
	}
	
	private void insert(WordNode myRoot, WordNode temp) {
		while(true) {
			//ignore duplicate words
			if(temp.getWord().compareTo(myRoot.getWord()) == 0)
				return;
			//Traveling to the left side
			if(temp.getWord().compareTo(myRoot.getWord()) <= -1) {
				if (myRoot.left != null)
					myRoot = myRoot.left;
				else {
					myRoot.left = temp;
					break;
				}
			}
			//traveling to the right side
			else {
				if(myRoot.right != null)
					myRoot = myRoot.right;
				else {
					myRoot.right = temp;
					break;
				}
			}
		}
	}


	//Calling delete rec
    public void checkWord(String str) { 
    	
    	//I have this here so you can call the checkWord function and only input the string you're deleting. It will then
    	//call the main method that also inputs the BST
    	root = checkingWord(root, str); 
    }
    // deleting the specific location
    public WordNode checkingWord(WordNode node, String str)
    {
        // Base Case: If the tree is empty 
        if (node == null)
            return node;
  
        // Otherwise, recur down the tree
        if (str.compareTo(node.getWord()) <= -1) {
            node.left = checkingWord(node.left, str);
        }
        else if (str.compareTo(node.getWord()) > 0)
            node.right = checkingWord(node.right, str);
  
        // if str is same as node's str, then This gets deleted
        else {
            // if the node only has one child or no child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
  
            //if the node has 2 children
            node.setWord(node.right);
  
            //recursively adjusting it
            node.right = checkingWord(node.right, node.getWord());
        }
        //returning the node
        return node;
    }
    
    
	public void inOrder() {
		inOrderRecursive(root);
	}
	@SuppressWarnings("unused")
	//Using the recursion that we implemented in class
	private void inOrderRecursive(WordNode myRoot) {
		if(myRoot != null) {
			inOrderRecursive(myRoot.left);
			System.out.println(myRoot.getWord());
			inOrderRecursive(myRoot.right);
		}
	}
}
