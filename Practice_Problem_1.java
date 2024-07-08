package Singly_Linked_Interview_Questions;
public class Practice_Problem_1 {
    public static node[] sort(node head){
        node oddHead = new node(0);
        node oddCurr = oddHead;
        node evenHead = new node(0);
        node evenCurr = evenHead;
        while(head!=null){
            if(head.data%2 == 0){
                node a = new node(head.data);
                evenCurr.next = a;
                evenCurr = evenCurr.next;
                head = head.next;
                oddCurr.next = null;
            }
            else{
                node a = new node(head.data);
                oddCurr.next = a;
                oddCurr = oddCurr.next;
                head = head.next;
                evenCurr.next = null;
            }
        }
        return new node[]{oddHead.next,evenHead.next};
    }
    public static void display(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.print("Original List :- ");
        display(a);
        node[] ans = sort(a);
        node oddHead = ans[0];
        node evenHead = ans[1];
        System.out.println();
        System.out.print("Odd List :- ");
        display(oddHead);
        System.out.println();
        System.out.print("Even List :- ");
        display(evenHead);
    }
}