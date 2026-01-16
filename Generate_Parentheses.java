import java.util.*;
public class Generate_Parentheses
{
    public static List<String> BacktrackParentheses(int n)
    {
        LinkedList<String> result = new LinkedList<>(); 
        backtrack(result,"",0,0,n);
        return result;
    }
    public static void backtrack(LinkedList<String> result,String current,
                                int open,
                                int close,
                                int n
    )
    {
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if (open < n) {
            backtrack(result, current+"(", open+1, close,n);
        }
        if (close < open) {
            backtrack(result, current+")", open, close+1, n);
        }
    }
    public static void main(String[] args)
    {
        int n = 3;
        List<String> result = BacktrackParentheses(n);
        System.out.println("Valid Parantheses Combinations: ");
        for(String s: result)
        {
            System.out.println(s);
        }
    }
}