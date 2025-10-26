import java.util.Stack;

public class is_greater_without_extra_space 
{
    public static void main(String[] args) 
    {

        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        int n = arr.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();

            st.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
