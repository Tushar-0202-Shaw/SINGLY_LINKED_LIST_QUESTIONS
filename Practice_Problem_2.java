public class Practice_Problem_2 {
    public static node reverse(node head){
        node curr = head;
        node prev = null;
        node after = null;
        while(curr!=null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
    public static int maxTwinSum(node head){
        node fast = head;
        node slow = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node p1 = head;
        node p2 = reverse(slow.next);
        int twinSum = Integer.MIN_VALUE;
        while(p2 != null){
            if((p1.data+p2.data)>twinSum) twinSum = p1.data + p2.data;
            p1 = p1.next;
            p2 = p2.next;
        }
        return twinSum;
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(3);
        node e = new node(2);
        node f = new node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.print("Max twin sum of the given list :- "+maxTwinSum(a));
    }
}