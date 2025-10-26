public class reverse_recursive 
{
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next= null;
        }
    }

    public static Node reverse(Node head)
    {
        if(head.next==null) return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    } 

    public static void main(String args[])
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
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
