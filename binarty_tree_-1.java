import java.util.*;

public class Main {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }
  public static ArrayList<TreeNode>list = new ArrayList<TreeNode>();
  public static boolean find(TreeNode node, int data) {
    if (node == null) {
      return false;
    }
    if (node.val == data) {
      list.add(node);
      return true;
    }
    else if (find (node.left, data) == true) {
      list.add(node);
      return true;
    }
    else if (find(node.right, data) == true) {
      list.add(node);
      return true;
    }
    return false;

  }

  public static ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data) {
    boolean found = find(node, data);
    return list;
  }

  // input_section=================================================

  public static TreeNode createTree(int[] arr, int[] IDX) {
    if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
      IDX[0]++;
      return null;
    }
    TreeNode Treenode = new TreeNode(arr[IDX[0]++]);
    Treenode.left = createTree(arr, IDX);
    Treenode.right = createTree(arr, IDX);

    return Treenode;
  }

  public static void solve() {
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();

    int[] IDX = new int[1];
    TreeNode root = createTree(arr, IDX);

    int data = scn.nextInt();
    ArrayList<TreeNode> ans = nodeToRootPath(root, data);
    if (ans.size() == 0)  System.out.println(" ");
    for (TreeNode node : ans)
      System.out.print(node.val + " ");

  }

  public static void main(String[] args) {
    solve();
  }
}
