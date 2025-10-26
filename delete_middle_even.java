public class delete_middle_even 
{
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
        public static void delete_right_mid(Node head)
        {
            Node slow = head;
            Node fast = head;
            while(fast.next.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            System.out.println("After Right middle node deleted");
            print(head);
        }

        public static void delete_left_mid(Node head)
        {
            Node slow = head;
            Node fast = head;
            while(fast.next.next.next.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            System.out.println("After Left middle node deleted");
            print(head);
        }

    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) 
    {
        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);
        Node g = new Node(700);
        Node h = new Node(800);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        //delete_right_mid(a);
        delete_left_mid(a);
    }
}
