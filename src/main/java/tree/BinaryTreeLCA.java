package tree;

public class BinaryTreeLCA {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    Node findLCA(Node node, int n1, int n2) {
        if(node==null) return null;
        if(node.data==n1|| node.data==n2) return  node;

        Node leftLCA = findLCA(node.left,n1,n2);
        Node rightLCA = findLCA(node.right,n1,n2);

        //if(leftLCA!=null && rightLCA!=null)
        return node;
        //return (leftLCA!=null)? leftLCA: rightLCA;

    }
    public static void main(String[] args){
        BinaryTreeLCA tree= new BinaryTreeLCA();
        tree.root=new Node(3);
        tree.root.left=new Node(5);
        tree.root.right=new Node(1);
        tree.root.left.left=new Node(6);
        tree.root.left.right=new Node(2);
        tree.root.right.left=new Node(0);
        tree.root.right.right=new Node(8);

        System.out.println("LCA of 6 and 4: "+tree.findLCA(tree.root,6,2).data);
    }


}
