package Trees;

import java.util.Stack;

public class Inorder_iterative {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    Node root;

    public void inorder(){
        if (root==null) {
            System.out.println("Tree is empty");
        }
        Stack<Node>s=new Stack<Node>();
        Node curr=root;
        //traversing of the node
        while (curr!=null || s.size()>0) {
            
            // Reach the left most Node of the 
           // curr Node 
            while (curr!=null) {
                /* place pointer to a tree node on 
                the stack before traversing 
                the node's left subtree */
                s.push(curr);
                curr=curr.left;
            }
            /* Current must be NULL at this point */
            curr=s.pop();
            System.out.println(" "+curr.data);
            
            /* we have visited the node and its 
            left subtree.  Now, it's right 
            subtree's turn */
            curr=curr.right;
        }
    }
    
    public static void main(String args[]) 
    { 
  
        /* creating a binary tree and entering 
        the nodes */
        Inorder_iterative tree = new Inorder_iterative(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.inorder(); 
    } 
}
