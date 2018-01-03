public class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int number){ val = number; }
};

public class inorderTraversal{

	public List<Integer> inorderTraversalMethod(TreeNode root){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();

		TreeNode p = root;

		while(p!=null){
			stack.push(p);
			p = p.left;
		}

		while(!stack.isEmpty()){
			TreeNode t= stack.pop();
			result.add(t.val);

			if(t.right!=null){

				t = t.right;
				while(t!=null){
					stack.push(t);
					t = t.left;
				}
			}
		}

		return result;
	}
}