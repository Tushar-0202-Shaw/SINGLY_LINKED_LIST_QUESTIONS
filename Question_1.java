package Singly_Linked_Interview_Questions;
class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}
public class Question_1 {
    static void deleteElement(node a){
        a.data = a.next.data;
        a.next = a.next.next;
    }
    static void display(node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        System.out.println();
        deleteElement(c);
        display(a);
        System.out.println();
    }
}