class Node
{
	int data;
	Node left, right;
	public Node(int item){
		data = item
		left = right = null;
	}
}

class Tree{
	Node root;

	public Tree(){
		root = null;
	}

	void printLevelOrder(){
		int h = height(root);
		int i;
		for ( i=1; i <= h; i++)
			printGivenLevel(root, i);
	}

	void printGivenLevel(level){
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.data + " ");

		else if( level > 1){
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.left, level - 1);
		}

	}

	public static void main(String args[]){
		Tree tree1 = new Tree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		tree.printLevelOrder();
	}
}