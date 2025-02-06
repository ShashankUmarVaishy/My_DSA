package Trees;

public class SegmentTree {
    private static class Node{
         int data;
         Node left,right;
         int si,ei;

        public Node(int si, int ei){
            this.si=si;
            this.ei=ei;
        }
    }
     Node root;
    public SegmentTree(int[] arr){
        System.out.println("Creating tree");
        root= constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[]arr,int si, int ei){
        if(si==ei){
            //leaf node
            Node leaf= new Node(si,ei);

            leaf.data=arr[si];
            return leaf;
        }
        Node node=new Node(si,ei);
        int mid=(si+ei)/2;
        node.left=constructTree(arr,si,mid) ;
        node.right=constructTree(arr,mid+1,ei);
        node.data=node.left.data+node.right.data;

        return node;
    }
    public void display(){
        System.out.println("in public going to private");
        display(this.root);
    }
    private void display(Node node){

        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.si + "-" + node.left.ei + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.si + "-" + node.ei + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.si + "-" + node.right.ei + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }

    }
    public void query(int si,int ei){
        System.out.println(query(root,si,ei));
    }
    private int query(Node node,int si,int ei){
        //there are three case 1->when interval is inside,2->when partially inside 3->when completely outside
        int sum=0;
        //1)completely in and perfect
        if(node.si==si && node.ei==ei){
            return node.data;
        }
        //2)completely out
        else if(node.si>ei || node.ei<si){
            return 0;
        }
        //3)overlapping
        else {
            //search in right and left hand
            return query(node.left,si,ei)+query(node.right,si,ei);
        }
    }
    public void format(int idx,int val){
        this.root.data=format(this.root,idx,val);
    }
    private int format(Node node,int idx,int val){
        if(node.si==idx && node.ei==idx){
            node.data=val;
            return node.data;
        }
        else if(node.si>idx || node.ei<idx){
            return node.data;
        }
        else {
            node.data= format(node.left,idx,val)+format(node.right,idx,val);
            return node.data;
        }
    }
}
