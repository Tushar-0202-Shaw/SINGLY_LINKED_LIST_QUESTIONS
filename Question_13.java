public class Question_13 {
    public static node oddEvenList(node head){
        node even = new node(0);
        node odd = new node(0);
        node tempOdd = odd;
        node tempEven = even;
        node temp = head;
        while(temp != null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            tempEven.next = temp;
            if(temp == null) break; // => Without this statement the program will show error if no. of nodes are odd.
            temp = temp.next;
            tempEven = tempEven.next;
        }
        odd = odd.next;
        even = even.next;
        tempOdd.next = even;
        return odd;
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
        System.out.println();
        System.out.print("Odd Even List :- ");
        display(oddEvenList(a));
    }
}
