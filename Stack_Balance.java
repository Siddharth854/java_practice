import java.util.*;
public class Stack_Balance
{
    public static void bracket(String str)
    {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            } else {
                if(st.size()==0) 
                System.out.println("Stack is Empty");
                if(st.peek()=='(') 
                {
                    st.pop();
                }
            }
        }
        if(st.size()==0)
                System.out.println("Stack is Empty");
        else System.out.println(st);
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		bracket(str);
        sc.close();
	}
}