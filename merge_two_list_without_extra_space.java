public class merge_two_list_without_extra_space 
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
    public static Node merge(Node list1, Node list2)
    {
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(0);
        Node temp = head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data < temp2.data)
            {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1!=null)
        {
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }
        return head.next;
    }

    public static void main(String[] args)
    {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node p = new Node(15);
        Node q = new Node(25);
        Node r = new Node(35);
        Node s = new Node(45);
        Node t = new Node(48);
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;
        Node temp;
        temp = merge(a,p);
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }
}
