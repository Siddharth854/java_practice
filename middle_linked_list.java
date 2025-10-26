public class middle_linked_list 
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
        public static void find_middle(Node head)
        {  // 1 2 3 4 5 6 
            Node slow = head;
            Node fast = head;
            while(fast!=null&&fast.next!=null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.print(slow.data);
        }

    public static void main(String[] args) 
    {
        Node a = new Node(21);
        Node b = new Node(23);
        Node c = new Node(45);
        Node d = new Node(34);
        Node e = new Node(56);
        Node f = new Node(87);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        find_middle(a);
    }
}
