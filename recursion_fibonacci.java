public class recursion_fibonacci {
        public static int fibonacci(int n)
        {
                if(n==0 || n==1)
                {
                        return n;
                }
                int prev = fibonacci(n-1);
                int prev_prev = fibonacci(n-2);
                return prev + prev_prev;
        }
        public static void main(String[] args) {
                int n=0;
                for(int i=0;i<10;i++){
                System.out.println(fibonacci(n));
                }
        }
}
