import java.util.*;
public class Stockspan
{
    public static int[] Calculate_Span(int arr[])
    {
        int n = arr.length;
        int span[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++)
        {
        if( !st.isEmpty() && arr[st.peek()] <= arr[i] ) 
        st.pop();
        
        span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
        st.push(i);
        }
        return span;
    }
    public static void main(String[] args)
    {
        int[] prices = { 100,80,60,70,60,75,85 };
        int[] span = Calculate_Span(prices);
        System.out.println("Stock span for each day: ");
        for(int s: span)
        System.out.print(s+" ");
    }
}
