import java.util.Stack;
public class stack_recursive {
    public static void display_reverse_Rec(Stack<Integer> st)
    {
        if(st.size()==0)
            return;
        int top = st.pop();
        System.out.print(top+" ");
        display_reverse_Rec(st);
        st.push(top);
    }
    
    public static void display_stack(Stack<Integer> st)
    {
        if(st.size()==0)
            return;
        int top = st.pop();
        display_stack(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String args[])
    {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        st.push(66);
        st.push(77);
        st.push(88);
        System.out.print("The reverse of Stack is: \n");
        display_reverse_Rec(st);
        System.out.print("\nThe stack is: \n");
        display_stack(st);
    }
}
