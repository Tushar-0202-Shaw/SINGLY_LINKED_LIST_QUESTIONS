public class Question_8 {
    public static node detectCycle(node head){
        node slow = head;
        node fast = head;
        if(head == null || head.next == null) return null;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return null;
        node temp = head;
        while (temp != slow) {
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
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
        f.next = c;
        System.out.println(detectCycle(a).data);
    }
}
