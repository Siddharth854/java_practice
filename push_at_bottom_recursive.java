import java.util.Stack;

public class push_at_bottom_recursive {

    public static void push_at_bottom_rec(Stack<Integer> st, int element) {
        if (st.size() == 0) {
            st.push(element);
            return;
        }

        int top = st.pop();
        push_at_bottom_rec(st, element);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int element = 5;
        push_at_bottom_rec(st, element);

        System.out.println(st);
    }
}
