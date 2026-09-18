// tree traversal -- level order (BFS)

import java.util.LinkedList;
import java.util.Queue;

public class Btree_3LevelOrderTraversal {
  // node class
  static class Node {
    int data;
    Node left;
    Node right;

    // constructor
    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // tree class
  static class BinaryTree {
    private int idx = -1;

    // build tree:
    public Node buildTree(int[] nodes) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }

  }

  public static void level(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
      Node curr=q.remove();
      if(curr==null){
        System.out.println();
        if(q.isEmpty())
          break;
        else
          q.add(null);
      }else{
        System.out.print(curr.data+" ");
        if(curr.left!=null)
          q.add(curr.left);
        if(curr.right!=null)
          q.add(curr.right);
      }
    }
  }

  public static void main(String[] args) {
    int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);
    level(root);

  }
}
