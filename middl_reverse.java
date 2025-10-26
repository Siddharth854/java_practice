public class middl_reverse
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
	public static Node reverse(Node head,int left,int right)
	{
		Node dummy = new Node(100);
		dummy.next = head;
		
		Node left_pre = dummy;
		Node curr_node = head;
		
		for(int i=0;i<left-1;i++)
		{
			left_pre = left_pre.next;
			curr_node = curr_node.next;
		}
		
		Node pre_node = null;
		Node sub_list = curr_node;
		
		for(int i=0;i<right-left;i++)
		{
			Node forward = curr_node.next;
			curr_node.next = pre_node;
			pre_node = curr_node;
			curr_node = forward;
		}
		left_pre.next = pre_node;
		sub_list.next = curr_node;
		return dummy.next;
	}
	public static void print(Node a)
	{
		while(a!=null)
		{
			System.out.print(a.data+"	");
			a = a.next;
		}
	}
	public static void main(String[] args)
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
		a = reverse(a,3,6);
		print(a);
	}
}