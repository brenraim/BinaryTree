/**
*	Brendan Raimann
*	12/15/15
*	Runner for BinaryTree
*/
public class Runner
{
	public static void main(String[] args)
	{
		BinaryTree<String> root = new BinaryTree<String>("R");  //root
		root.setLeft(new BinaryTree<String>("A"));
		root.setRight(new BinaryTree<String>("B"));
		root.left().setLeft(new BinaryTree<String>("C"));
		root.left().setRight(new BinaryTree<String>("D"));
		/*	
				R
			   / \
			  A	  B
			 / \
			C   D
		*/
		
		System.out.println(root);
		
		System.out.println("Size of T: " + root.size());
		System.out.println("Size of A: " + root.left().size());
		
		System.out.println("Height of T: " + root.height());
		System.out.println("Height of A: " + root.left().height());
		
		System.out.println("isBalanced of T: " + root.isBalanced());
		System.out.println("isBalanced of A: " + root.left().isBalanced());
		
		System.out.println("isFull of T: " + root.isFull());
		System.out.println("isFull of A: " + root.left().isFull());
		
		System.out.println("isComplete of T: " + root.isComplete());
		System.out.println("isComplete of A: " + root.left().isComplete());
		
	
		for (Object x: root) //InOrder
			System.out.println(x);
		
	}
}