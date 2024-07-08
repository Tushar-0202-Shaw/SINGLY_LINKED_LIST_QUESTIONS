package Singly_Linked_Interview_Questions;
public class Question_6_Del_Left_Mid_Even_Nodes {
    public static node delMid(node head){
        node slow = head;
        node fast = head;
        if(head.next.next == null) {
            head = head.next;
            return head;
        }
        while(fast.next.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
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
        display(a);
        System.out.println();
        display(delMid(a));
    }
}