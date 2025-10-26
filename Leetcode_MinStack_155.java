import java.util.*;
public class Leetcode_MinStack_155 
    {
    static class MinStack {
        private Stack<Character> stack;      
        private Stack<Character> minStack;   

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(char val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (stack.isEmpty()) return;
            char removed = stack.pop();
            if (removed == minStack.peek()) {
                minStack.pop();
            }
        }

        public char top() {
            return stack.peek();
        }

        public char getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push('a');
        minStack.push('b');
        minStack.push('C');
        minStack.push('d');

        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top());    // 0
        System.out.println(minStack.getMin()); // -2
    }
}
