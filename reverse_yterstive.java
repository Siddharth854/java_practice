public class reverse_yterstive {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverse(Node head)
    {
        if(head.next == null) return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String args[])
    {
        Node a = new Node(11);
        Node b = new Node(28);
        Node c = new Node(45);
        Node d = new Node(67);
        Node e = new Node(76);
        Node f = new Node(59);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp;
        temp = reverse(a);
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
}
