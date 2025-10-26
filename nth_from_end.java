public class nth_from_end 
{
    public static Node nth_end(Node head, int pos)
    {
        Node slow = head;
        Node fast = head;
        for(int i=0;i<pos;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
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
    public static void main(String args[])
    {
        // 100 11 32 78 450 34
        Node a = new Node(100);
        Node b = new Node(11);
        Node c = new Node(32);
        Node d = new Node(78);
        Node e = new Node(450);
        Node f = new Node(34);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f; 
        Node temp;
        temp = nth_end(a,5);
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
