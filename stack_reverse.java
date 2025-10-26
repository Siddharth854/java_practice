import java.util.Stack;
public class stack_reverse
{
    public static void main(String[] args)
    {
        Stack <Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
        }
            System.out.println("Reverse is:"+rt);
        while(rt.size()>0)
        {
            st.push(rt.pop());
        }
            System.out.println("Stack is:"+st);
    }
}