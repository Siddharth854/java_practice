public class power {
    public static int pow(int p, int q)
    {
        if(q == 0) return 1;
        int smallPow = pow(p,q/2);
        if(q%2==0)
            return smallPow * smallPow;
        return p * smallPow * smallPow;
    }

    public static void main(String[] args)
    {
        int p=2, q=5;
        System.out.print(pow(p,q));
    }
}
