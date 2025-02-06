package Trees;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class binaryTree {
    public binaryTree(){

    }

    private static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    private Node root;
    public void populate(Scanner scanner) {
        System.out.println("Enter the root data: ");
        int val= scanner.nextInt();
        root = new Node(val);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of "+node.data+" ?");
        boolean left= scanner.nextBoolean();
        if(left){
            System.out.println("Enter value of left node:");
            int ld= scanner.nextInt();
            node.left= new Node(ld);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of "+node.data+" ?");
        boolean right= scanner.nextBoolean();
        if(right){
            System.out.println("Enter value of right node:");
            int rd= scanner.nextInt();
            node.right= new Node(rd);
            populate(scanner,node.right);
        }

    }
    public void dispaly() {
    dispaly(root," ");
    }

    private void dispaly(Node node, String indent) {
        if(node == null){
            return;
        }
        System.out.println(indent + node.data);
        dispaly(node.left, indent +"\t");
        dispaly(node.right, indent+"\t" );
    }


}
