public class Node{
        int coefficient;
        int data;
        Node next;

        public Node(int coefficient, int data){
            this.coefficient = coefficient;
            this.data = data;
            this.next = null;
        }

        public static Node addtolist(int coefficient,int data,Node lead){
            Node curr=new Node(coefficient,data);
            if(lead==null){
                lead=curr;
            }else{
                Node p=lead;
                while(p.next!=null){
                    p=p.next;
                }
                p.next=curr;
            }
            return lead;
        }
        public static void display(Node lead){
            if(lead==null){
                System.out.println("No Polynomial Found");
                return;
            }
            Node curr=lead;
            while(curr!=null){
                if(curr.data==0){
                    continue;
                }
                if(curr.coefficient==0){
                    System.out.println(curr.data+" ");
                }
                else System.out.print(curr.data+"x^"+curr.coefficient+" + ");
                curr=curr.next;
            }
        }
        public static void adder(Node head1,Node head2){

            Node list1=head1;
            Node list2=head2;

            display(list1);
            display(list2);

            Node head=new Node(1,1);



            while(list1!=null && list2!=null){
                if(list1==null){
                    while(list2!=null){
                       addtolist(list2.coefficient,list2.data,head);
                        list2=list2.next;
                    }
                    break;
                }
                else if(list2==null){
                    while(list1!=null){
                        addtolist(list1.coefficient,list1.data,head);
                        list1=list1.next;
                    }
                    break;
                }

                if(list1.coefficient==list2.coefficient){
                    addtolist(list1.coefficient,list1.data+list2.data,head);
                    list1=list1.next;
                    list2=list2.next;
                }else if(list1.coefficient>list2.coefficient){
                    addtolist(list1.coefficient,list1.data,head);
                    list1=list1.next;
                }else {
                    addtolist(list2.coefficient,list2.data,head);
                    list2=list2.next;
                }
            }
            display(head);
            return ;
        }
        public static void main(String[] args) {
            Node head1=new Node(4,1);
            Node head2=new Node(3,2);
            addtolist(3,1,head1);
            addtolist(2,2,head1);
            addtolist(1,1,head1);
            addtolist(1,3,head2);
            addtolist(0,2,head1);
            addtolist(0,3,head2);

            adder(head1,head2);


        }
    }


