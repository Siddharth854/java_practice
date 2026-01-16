public class Remove_nth_from_end_of_list
{
    public static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
    }
    
    public static Node remove_from_last(Node head, int n)
    {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy;
        Node slow = dummy;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void printList(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node createList(int arr[])
    {
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i=1;i<arr.length;i++)
        {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 2;
        Node head = createList(arr);
        System.out.println("The Original List is: \n");
        printList(head);
        head = remove_from_last(head, n);
        System.out.println("After Removing "+n+"th Node from from End: ");
        printList(head);
    }
}