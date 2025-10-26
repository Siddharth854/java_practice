public class linked_list_aray_implement
{
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class LL_stack
    {
        private Node head = null;
        private int size = 0;
        
        public void push(int temp)
        {
            Node x = new Node(temp);
            x.next = head;
            head = x; 
            size++;
        }

        public int peek()
        {
            if(head == null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }

        public int pop()
        {
            if (size == 0) {
                System.out.println("Stack is Empty"); 
                return -1;               
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args)
    {
        LL_stack s = new LL_stack();
        s.push(10);
        s.push(20);
        s.push(30);
        
        System.out.println("Top element: " + s.peek()); 
        System.out.println("Pop: " + s.pop());          
        System.out.println("New Top: " + s.peek());     
        System.out.println("Size: " + s.size());       
    }
}
