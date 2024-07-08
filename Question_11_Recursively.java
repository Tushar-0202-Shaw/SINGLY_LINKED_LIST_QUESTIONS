public class Question_11_Recursively{
    public static node reverseList(node head){
        if(head.next == null) return head;
        node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void display(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        node a = new node(5);
        node b = new node(3);
        node c = new node(1);
        node d = new node(4);
        node e = new node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.print("Original List :- ");
        display(a);
        System.out.println();
        System.out.print("Reversed List :- ");
        display(reverseList(a));
    }
}
