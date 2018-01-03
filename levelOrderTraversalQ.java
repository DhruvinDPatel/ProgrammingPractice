import java.util.Queue;
import java.util.LinkedList;

class Node{
	int data;
	Node left, right;

	public Node(int item){
		data = item;
		left = null;
		right = null;
	}
}

class TreeQ{
	Node root;

	void printLevelOrder(){

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while(!queue.isEmpty()){

			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");

			if(tempNode.left != null){
				queue.add(tempNode.left)
			}

			if(tempNode.right != null){
				queue.add(tempNode.right)
			}
		}
	}

	public static void main(String args[]){

		TreeQ tree1 = new TreeQ();
		tree1.root = Node(1);
		tree1.root.left = Node(2);
		tree1.root.right = Node(5);

		printLevelOrder(tree1);	

	}
}