import java.util.*;

public class is_Balanced {
    public static boolean Balance(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push all opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else { // For closing brackets
                if (st.isEmpty()) return false;

                char top = st.peek();
                // Check for valid matching pair
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                } else {
                    return false; // Mismatch found
                }
            }
        }

        // If stack is empty → all brackets matched
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        System.out.println(Balance(str));
        sc.close();
    }
}
