package Trees;



public class AVL {
    public class Node {
        private int data;
        private Node left, right;
        private int height;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
        public int getValue() {
            return data;
        }
    }
    public AVL(){

    }

    private Node root;
    public boolean isEmpty(){
        return root==null;
    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
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
        } if(data>node.data){
            node.right = insert(node.right,data);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
           //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //form 1
                return rightRotate(node);
            }else if(height(node.left.right)>height(node.right.left)){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }if(height(node.right)-height(node.left)>1){
            //right heavy
            if(height(node.right.left)<height(node.right.right)){
                return leftRotate(node);
            }else if(height(node.right.right)<height(node.right.left)){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }
    private Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }
    private Node leftRotate(Node p){
        Node c=p.right;
        Node t=c.left;

        c.left=p;
        p.right=t;
        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);
        return c;
    }
    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|--->" + node.data);
        } else {
            System.out.println(node.data);
        }
        prettyDisplay(node.left, level + 1);
    }
}
