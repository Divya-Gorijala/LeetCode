package tree;

public class BinaryTreeHeight {
    Node root;
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        int height(Node node){
            if(node==null) return 0;
            return 1+Math.max(height(node.left),height(node.right));
        }

    public static void main(String[] args){
        BinaryTreeHeight tree =new BinaryTreeHeight();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println("Height of the tree: "+tree.height(tree.root));
    }
}
