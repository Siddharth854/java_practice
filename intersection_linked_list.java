public class intersection_linked_list 
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
    public static void intersection(Node headA, Node headB)
    {
        Node tempA = headA;
        Node tempB = headB;
        int sizeA=0;
        int sizeB=0;
        while(tempA!=null)
        {
            sizeA++;
            tempA = tempA.next;
        }tempA=headA;
        while(tempB!=null)
        {
            sizeB++;
            tempB = tempB.next;
        }tempB=headB;
        if(sizeA>sizeB)
        {
            int steps = sizeA-sizeB;
            for(int i=0;i<steps;i++)
            {
                tempA = tempA.next;
            }
        }else{
            int steps = sizeB-sizeA;
            for(int i=0;i<steps;i++)
            {
            tempB = tempB.next;
            }
        }
        while(tempA.data!=tempB.data && tempA.next!=null && tempB.next!=null)
        {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        System.out.print(tempA.data);
    }
    public static void main(String args[])
    {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(8);
        Node f = new Node(9);
        Node g = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node p = new Node(2);
        Node q = new Node(4);
        Node r = new Node(6);
        Node s = new Node(8);
        Node t = new Node(9);
        Node u = new Node(10);
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;
        t.next = u;
        intersection(a,p);
    }
}

