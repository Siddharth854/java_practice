import java.util.Stack;
public class remove_from_bottom 
{
    public static Stack remove_and_insert(Stack<Integer> s1, Stack<Integer> temp, int remove, int value)
    {
        while(!s1.isEmpty() && s1.peek()!=remove)
        {
            temp.push(s1.pop());
        }
        if(!s1.isEmpty() && s1.peek()==remove)
        {
            s1.pop();
        }
        s1.push(value);
        while(!temp.isEmpty())
        {
            s1.push(temp.pop());
        }
        return s1;
    }
    public static void main(String[] args)
    {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        remove_and_insert(s1,temp,3,0);
        System.out.print(s1+" ");
    }
}
