public class delete_middle_odd
{
    public static void delete_mid(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
            slow.data = slow.next.data;
            slow.next = slow.next.next;

        while(head!=null)
        {
            System.out.print(head.data+"  ");
            head = head.next;
        }

    }
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }


    public static void main(String[] args) 
    {
        Node a = new Node(25);
        Node b = new Node(66);
        Node c = new Node(34);
        Node d = new Node(12);
        Node e = new Node(87);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        delete_mid(a);
    }
}
