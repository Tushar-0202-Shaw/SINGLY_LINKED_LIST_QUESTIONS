public class Question_5_Right_Mid_Even_Nodes_And_Odd_Nodes {
    public static node midElement(node head) {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static void display(node head) {
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
        node f = new node(6);
        node g = new node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        display(a);
        System.out.println();
        System.out.println(midElement(a).data);
    }
}
