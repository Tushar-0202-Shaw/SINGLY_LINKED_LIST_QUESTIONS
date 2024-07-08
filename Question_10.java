package Singly_Linked_Interview_Questions;
public class Question_10 {
    public static node deleteDuplicates(node head) {
        node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void display(node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(1);
        node c = new node(2);
        node d = new node(3);
        node e = new node(3);
        node f = new node(3);
        node g = new node(3);
        node h = new node(4);
        node i = new node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        System.out.print("Original List :- ");
        display(a);
        System.out.println();
        deleteDuplicates(a);
        System.out.print("List after removing duplicates :- ");
        display(a);
    }
}