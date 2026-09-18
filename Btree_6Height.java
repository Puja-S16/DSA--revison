// height of tree O(n)
public class Btree_6Height{
  // node class
  static class Node {
    int data;
    Node left;
    Node right;

    // constructor
    Node(int data) {
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }

  // tree class
  static class BinaryTree{
    private int idx=-1;
    // build tree:
    public Node buildTree(int[] nodes){
      idx++;
      if(nodes[idx]==-1){
        return null;
      }
      Node newNode= new Node(nodes[idx]);
      newNode.left=buildTree(nodes);
      newNode.right=buildTree(nodes);
      return newNode;
    }

  }

  public static int height(Node root){
    if(root==null){
      return 0;
    }
    return Math.max(height(root.left),height(root.right))+1 ;
  }

  public static void main(String[] args) {
    int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree tree=new BinaryTree();
    Node root= tree.buildTree(nodes);

    System.out.println("height : "+height(root));
  }
}
