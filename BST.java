/**
*	@author Brendan Raimann
*	Binary Search Tree
*	1/12/16
*	Version 1.0
*/
public class BST<E extends Comparable<E>>
{
	/** The root for the search tree */
	private BinaryTree<E> root;
	
	public BST()
	{
		root = null;
	}
	
	/**
	*	Adds an item to the Binary Search Tree
	*	@param item The item to be added to the Binary Search Tree
	*/
	public boolean add(E item)
	{
		if (root == null)
		{
			root = new BinaryTree<E>(item);
			return true;
		}
		else
			return add(item, root);
	}
	
	/**
	*	Helper method for add
	*	@param item The item to be added to the Binary Search Tree
	*	@param curr The current Binary Tree for traversing
	*	@return Returns true if the value is not a duplicate and is successfully added
	*/ 
	private boolean add(E item, BinaryTree<E> curr)
	{
		if (item.compareTo(curr.value()) == 0)
			return false;
		if (item.compareTo(curr.value()) < 0)
		{
			if (curr.left() != null)
				return add(item, curr.left());
			else
			{
				curr.setLeft(new BinaryTree<E>(item));
				return true;
			}
				
		}
		else
		{
			if (curr.right() != null)
				return add(item, curr.right());
			else
			{
				curr.setRight(new BinaryTree<E>(item));
				return true;
			}
		}
	}
	
	/**
	*	Finds an item in the Binary Search Tree and returns the tree where the item is found
	*	@param item The value to be searched for in the Binary Search Tree
	*	@return Returns the tree with the given value
	*/
	public BinaryTree<E> find(E item)
	{
		if (root == null)
			return null;
		else
			return find(item, root);	
	}
	
	/**
	*	Helper method for find()
	*	@param item The value to be searched for in the list
	*	@param curr The current BinaryTree for traversing
	*	@return Returns the tree with the given value
	*/
	public BinaryTree<E> find(E item, BinaryTree<E> curr)
	{
		if (item.compareTo(curr.value()) == 0)
			return curr;
		if (item.compareTo(curr.value()) < 0)
		{
			if (curr.left() != null)
				return find(item, curr.left());
			else
				return null;
		}
		else
		{
			if (curr.right() != null)
				return find(item, curr.right());
			else
				return null;
		}
	}
	
	/**
	*	Returns a String representation of the Binary Search Tree
	*	@return Returns a String representation of the Binary Search Tree
	*/
	public String toString()
	{
		return root.toString();
	}
}