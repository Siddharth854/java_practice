public class check_palindrome 
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
    public static Node reverse(Node head)
        {
            if(head.next!=null) return head;
            Node newNode = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return newNode;
        }   
    public static void palindrome(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2!=null)
        {
            if(p1.data!=p2.data)
            {
                System.out.println("No");
            }else
            {
                p1 = p1.next;
                p2 = p2.next;
            }System.out.println("Yes");
        }
    }
    public static void main(String[] args)
    {
        Node a = new Node(11);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(12);
        Node e = new Node(11);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        palindrome(a);
    }
}
