public class merge_sort
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
	
	public static void merged(Node list1, Node list2)
	{
		Node temp_a = list1;
		Node temp_b = list2;
		Node head = new Node(100);
		Node temp = head;
		while(temp_a != null && temp_b != null)
		{
			if(temp_a.data < temp_b.data)
			{
				Node a = new Node(temp_a.data);
				temp.next = a;
				temp = a;
				temp_a = temp_a.next;
			}
			else
			{
				Node a = new Node(temp_b.data);
				temp.next = a;
				temp = a;
				temp_b = temp_b.next;
			}
		}
		if(temp_a==null)
		{
			temp.next = temp_b;
		}
		else
		{
			temp.next = temp_a;
		}
		
		Node start = head.next;
		while(start!=null)
		{
			System.out.print(start.data+"	");
			start = start.next;
		}
	}
	public static void main(String args[])
	{
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(5);
		Node d = new Node(7);
		Node e = new Node(9);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		Node p = new Node(2);
		Node q = new Node(4);
		Node r = new Node(6);
		Node s = new Node(8);
		Node t = new Node(10);
		p.next = q;
		q.next = r;
		r.next = s;
		s.next = t;
		merged(a,p);
	}
}