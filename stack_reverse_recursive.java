import java.util.Stack;
public class stack_reverse_recursive
{
    public static void reverse(Stack<Integer> st, int x)
    {
        if(st.size()==1)
            return;
        int top = st.pop();
        reverse(st,x);
        push_at_Bottom(st,top);
    }

    public static void push_at_Bottom(Stack<Integer> st, int x)
    {
        if(st.size()==0) 
        {
            st.push(x);
            return;
        }
        int top = st.pop();
        push_at_Bottom(st,x);
        st.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int x = 100;
        System.out.println("Original Stack: \n"+st);
        reverse(st,x);
        System.out.println("Reversed Stack: \n"+st);
    }
}