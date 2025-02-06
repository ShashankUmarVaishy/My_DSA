package Trees;

public class BST {

    public class Node {
       private int data;
       private Node left, right;
       private int height;

       public Node(int data) {
           this.data = data;
           left = right = null;
       }
       private Node root;
       public int height(Node node){
           if(node == null){
               return -1;
           }
           return node.height;
       }
       public boolean isEmpty(){
           return root==null;
       }
        public void insert(int data) {
        root = insert(root,data);
        }
        private Node insert(Node node, int data) {
           if(node == null){
               node=new Node(data);
               return node;
           }
           if(data<node.data){
               node.left = insert(node.left,data);
           }else if(data>node.data){
               node.right = insert(node.right,data);
           }
           node.height = Math.max(height(node.left),height(node.right))+1;
           return node;
        }
    }
}
