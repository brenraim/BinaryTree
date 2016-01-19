public class BSTRunner
{
	@SuppressWarnings("unchecked")
	public static void main (String[] args)
	{
		BST bst = new BST<String>();
		bst.add("C");
		bst.add("A");
		bst.add("B");
		bst.add("D");
		System.out.println(bst.add("A"));
		System.out.println(bst.find("C"));
		System.out.println(bst.find("E"));
		System.out.println(bst.find("A"));
	}
}