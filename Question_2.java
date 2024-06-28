public class Question_2 {
    public static node nthNode(node head, int n) {
        int size = 0;
        node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size-n+1;
        temp = head;
        for (int i=1; i<=m-1 ; i++) {
            temp = temp.next;
        }
        return temp;
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
