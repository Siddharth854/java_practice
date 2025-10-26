import java.util.Stack;
public class stack_implement
{       public static void main(String[] args)
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
            st.push(99);

            int n = st.size();
            int arr[] = new int[n];
            
            for(int i=n-1;i>0;i--)
            {
                arr[i] = st.pop();
            }
            for(int i=0;i<n;i++)
            {
                System.out.print("The array is: "+arr[i]+" \n");
                st.push(arr[i]);
            }
                System.out.println("The Stack is: "+st);
        }
}

