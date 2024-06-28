package Singly_Linked_Interview_Questions;
public class Question_2_Single_Traversal {
    public static node nthNode(node head, int n) {
        node slow = head;
        node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void display(node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        System.out.println();
        System.out.println(nthNode(a, 3).data);
    }
}