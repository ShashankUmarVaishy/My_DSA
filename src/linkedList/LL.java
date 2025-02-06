package linkedList;

public class LL {
private Node head;
private Node tail;
private int size;
 public LL() {
     this.size = 0;
 }


    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
            if(tail == null) {
                tail = head;
            }

        }

        public void addLast(int data) {

            if(tail == null) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        //insert using recursion
        private Node insRec(int data, int idx, Node node) {

            if (idx == 0) {
                //time to insert

                Node nn = new Node(data);
                nn.next = node;
                size++;
                return nn;
            }
            node.next = insRec(data, idx - 1, node.next);
            return node;
        }

        public void display() {
            Node cn = head;
            while (cn != null) {
                System.out.print(cn.data + "->");
                cn = cn.next;
            }
            System.out.println("END");
        }
        //recursion reverse
        public void recRev(Node node) {
        if(node == tail) {
            head=tail;
            return;
        }
        recRev(node.next);

        }
        public void rev(){
        Node prev=null;
        Node curr=head;
        if(curr.next==null){
            return;
        }
        Node agla=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=agla;
            if(curr==null){
                head=prev;
                
            }
           else agla=curr.next;

        }
        }
        public void bubbleSort(LL list){
        Node f=head,p=head,s=head.next;
            for (int i = 0; i <list.size; i++) {
                while(s!=null){
                    if(f.data>s.data) {
                        //swap
                        if (f == head) {
                            f.next = s.next;
                            head = s;
                            s.next = f;

                            f = head;
                            s = f.next;

                        } else {
                            p.next = s;
                            f.next = s.next;
                            s.next = f;

                            f=p.next;
                            s=f.next;
                        }
                    }
                        p = p.next;
                        s = s.next;
                        f = f.next;

                }
            }
        }

    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(24);
        list.addLast(44);
        list.addLast(30);
        list.addLast(40);
        list.insRec(22, 3, list.head);
        list.display();
        System.out.println(list.size);

        list.rev();
        list.display();
    }
}
