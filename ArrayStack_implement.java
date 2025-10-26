public class ArrayStack_implement 
{
    public static class Stack
    {
        private int arr[] = new int[5];
        private int index = 0;

        void push(int x)
        {
            arr[index] = x;
            index++;
        }

        int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[index-1];
        }

        int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }

        int size()
        {
            return index;
        }
        
        void display()
        {
            for(int i=0;i<=index-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty()
        {
            if(index==0) return true;
            else return false;
        }
    }

    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(0);
        System.out.println(st.isEmpty());
    }
}
