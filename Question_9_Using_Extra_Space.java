public class Question_9_Using_Extra_Space {
    public static node mergeTwoLists(node head1 , node head2){
        node temp1 = head1;
        node temp2 = head2;
        node head = new node(100);
        node temp = head;
        while(temp1 != null && temp2!=null){
            if(temp1.data < temp2.data){
                node a = new node(temp1.data);
                temp.next= a;
                temp = temp.next;
                temp1 = temp1.next;
            }
            else{
                node a = new node(temp2.data);
                temp.next = a;
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        return head.next;
    }
    public static void display(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        node a = new node(1);
        node a1 = new node(3);
        node a2 = new node(5);
        node a3 = new node(8);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        node b = new node(2);
        node b1 = new node(4);
        node b2 = new node(6);
        node b3 = new node(7);
        b.next = b1;
        b1.next = b2;
        b2.next = b3;
        System.out.print("List 1 :- ");
        display(a);
        System.out.println();
        System.out.print("List 2 :- ");
        display(b);
        System.out.println();
        System.out.print("Sorted List :- ");
        display(mergeTwoLists(a,b));
    }
}
