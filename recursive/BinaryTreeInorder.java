package Trees.recursive;

public class BinaryTreeInorder {
    public static  class TreeNode{
        TreeNode left;
        TreeNode right;
        int data;

        TreeNode(int data){
            this.data=data;
        }
    }

    public void InorderTraversal(TreeNode root){
        if (root!=null) {
            InorderTraversal(root.left);
            System.out.printf("%d ",root.data);
            InorderTraversal(root.right);
        }
    }

    public static void main(String[] args)
	{
		BinaryTreeInorder bi = new BinaryTreeInorder();
		// Creating a binary tree
		TreeNode rootNode=createBinaryTree();
		System.out.println("Using Recursive solution:");
 
		bi.InorderTraversal(rootNode);
	}
 
	

    public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
}
