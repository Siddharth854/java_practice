public class odd_even_linked_list
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
	public static void print(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"	");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void odd_even(Node head)
	{
		Node temp = head;
		Node odd = new Node(1);   //    temp_even 0    temp_odd   1
		Node temp_odd = odd;
		Node even = new Node(0);   ///      			   	2  3  5  4  1  2  8  10  13 
		Node temp_even = even;	   ///	 temp_even   0      2
								   ///   temp_odd    1         3 
			
		while(temp.next != null)
		{
			if(temp.data%2==0)
			{
				temp_even.next = temp;
				temp_even = temp_even.next;
				temp = temp.next;
			}else{
				temp_odd.next = temp;
				temp_odd = temp_odd.next;
				temp = temp.next;
			}
		}
		temp_odd.next = even.next;
		print(odd.next);
	}
	
public static void main(String[] args)
	{
		Node a = new Node(3);
		Node b = new Node(5);
		Node c = new Node(4);
		Node d = new Node(1);
		Node e = new Node(2);
		Node f = new Node(8);
		Node g = new Node(10);
		Node h = new Node(13);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		odd_even(a);
	}
}