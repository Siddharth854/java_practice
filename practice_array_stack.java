public class practice_array_stack
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
                System.out.println("Stack is Empty \n");
                return -1;
            }
            return arr[index-1];
        }

        int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Empty \n");
                return -1;
            }
            int top = arr[index-1];
                arr[index-1] = 0;
                index--;
                return top;
        }

        boolean isEmpty()
        {
            if(index==0) return true;
            else return false;
        }
        
        int size()
        {
            return index;
        }

        void display()
        {
            if(isEmpty())
            {
                System.out.print("Stack is Empty");
            }
            for(int i=0;i<=index-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isFull()
        {
            if(index==arr.length)
            {
                return true;
            }return false;
        }
    }
    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(11);
        st.display();
        st.push(22);
        st.display();
        st.push(33);
        st.display();
        System.out.println("The last element of Stack is: "+st.peek());
        st.pop();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.display();
        st.push(66);
        st.push(44);
        st.display();
        System.out.println(st.isEmpty());
        st.push(12);
        st.display();
    }
}
