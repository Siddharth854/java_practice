import java.util.Stack;
public class stack_push_at_bottom 
{
    public static void transfer_from_s1_to_s2(Stack<Integer> s1, Stack<Integer> s2)
    {
        // Recursive function to transfer from s1 to s2 & s2 to s1
        if(s1.size()==0)
        return;
        int top = s1.pop();
        transfer_from_s1_to_s2(s1,s2);
        s2.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(11);
        s1.push(22);
        s1.push(33);
        s1.push(44);
        s1.push(55);
        //System.out.println("Transferring the values from s1 to s2");
        transfer_from_s1_to_s2(s1,s2);
        //System.out.println("displaying S1 & S2");
        //System.out.print(s1+" ");
       // System.out.print(s2+" ");
        //System.out.println("\nInserting new value to s1");
        s1.push(100);
       // System.out.print(s1+" ");
       //System.out.println("Transferring the values again from s2 to s1");
        transfer_from_s1_to_s2(s2,s1);
        //System.out.println("\n Final output of S1");
        System.out.print(s1+" ");
    }
}
