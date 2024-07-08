package Singly_Linked_Interview_Questions;
public class Question_7 {
    public static boolean checkCycle(node head){
        node slow = head;
        node fast = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(slow==fast) return true;
        }
        return false;
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
        System.out.println(checkCycle(a));
    }
}