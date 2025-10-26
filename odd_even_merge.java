public class odd_even_merge 
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
    public static Node odd_even(Node head)
    {
        Node odd = new Node(1);
        Node even = new Node(0);
        Node temp_odd = odd;
        Node temp_even = even;
        Node temp = head;
        while(temp != null)
        {
            temp_odd.next = temp;
            temp = temp.next;
            temp_odd = temp_odd.next;

            temp_even.next = temp;
            if(temp_even.next == null) break;
            temp = temp.next;
            temp_even = temp_even.next;
        }
        odd = odd.next;
        even = even.next;
        temp_odd.next = even;
        return odd;
    }
    public static void main(String[] args)
    {
        Node a = new Node(11);
        Node b = new Node(22);
        Node c = new Node(31);
        Node d = new Node(44);
        Node e = new Node(51);
        Node f = new Node(66);
        Node g = new Node(71);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node temp;
        temp = odd_even(a);
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
}
