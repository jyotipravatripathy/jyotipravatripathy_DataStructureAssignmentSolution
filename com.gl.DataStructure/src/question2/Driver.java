package question2;

public class Driver {

	public static void main (String[] args)
	 {
		 Question2 tree = new Question2();
		 Node n = new Node(0);
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left= new Node(55);
	    
	     
	     int order = 0;
	     
	     tree.flattenBTToSkewed(tree.node, order);
	     tree.traverseRightSkewed(tree.headNode);
		
	 }

}
