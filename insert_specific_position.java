public class insert_specific_position 
{
        public static class Node
        {
            String data;
            Node next;
            Node(String data)
            {
                this.data = data;
                this.next = null;
            }
        }
    public static Node insert(Node head, int pos,Node val)
    {
        Node temp = head;
        for(int i=1;i<pos;i++)
        {
            temp = temp.next;
        }
        val.next = temp.next;
        temp.next = val;
        print(head);
        return head;
    }
    public static void print(Node temp)
    {
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[])
    {
        Node v1 = new Node("Red");
        Node v2 = new Node("Blue");
        Node v3 = new Node("Green");
        Node v4 = new Node("Purple");
        Node v5 = new Node("White");
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        Node val = new Node("Lime");
        insert(v1,3,val);    
    }
}
