public class Question_4 {
    public static node intersection(node head1 , node head2){
        node temp1 = head1;
        node temp2 = head2;
        int length1 = 0;
        while(temp1!=null){
            length1++;
            temp1 = temp1.next;
        }
        int length2 = 0;
        while(temp2!=null){
            length2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if(length1>length2){
            for(int i=1;i<=Math.abs(length1-length2);i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=1;i<=Math.abs(length1-length2);i++){
                temp2 = temp2.next;
            }
        }
        while(temp1.data!=temp2.data){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public static void display(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        node a = new node(1);
        node a1 = new node(2);
        node a2 = new node(3);
        node a3 = new node(4);
        node a4 = new node(5);
        node a5 = new node(6);
        node a6 = new node(7);
        a.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        node b = new node(8);
        node b1 = new node(9);
        node b2 = new node(5);
        node b3 = new node(6);
        node b4 = new node(7);
        b.next = b1;
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        display(a);
        System.out.println();
        display(b);
        System.out.println();
        System.out.println(intersection(a,b).data);
    }
}
