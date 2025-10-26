public class cycle_linked_list 
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
        }
    }

    public static void cycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
            if(fast==slow) break;
        }
        Node temp = head;
        while(temp!=slow)
        {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);

    }

    public static void main(String args[])
    {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = c;
        cycle(a);
    }
}
