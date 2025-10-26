public class odd_even_split 
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
    public static Node split(Node head)
    {
        Node temp = head;
        Node odd = new Node(1);
        Node even = new Node(0);
        Node temp_odd = odd;
        Node temp_even = even;

        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                temp_odd.next = temp;
                temp_odd = temp_odd.next;
                temp = temp.next;
            }else{
                temp_even.next = temp;
                temp_even = temp;
                temp = temp.next;
            }
        }
        temp_odd.next = even.next;
        return odd.next;
    }

    public static void main(String[] args)
    {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(12);
        Node e = new Node(8);
        Node f = new Node(10);
        Node g = new Node(13);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node head;
        head = split(a);
        System.out.print(head.data);
        head = head.next;
    }
}
