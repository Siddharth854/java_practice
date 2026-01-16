class latest_time_by_replacing_hidden_digits
{
    public static void main(String[] args)
    {
        String time = "2?:?0";
        char[] t = time.toCharArray();
        if (t[0] == '?') {
            if (t[1] == '?' || t[1] <= '3')
                t[0] = '2';
            else
                t[0] = '1';
        }

        if (t[1] == '?') {
            if (t[0] == '2')
                t[1] = '3';
            else
                t[1] = '9';
        }

        if (t[3] == '?')
            t[3] = '5';

        if (t[4] == '?')
            t[4] = '9';

        System.out.println(t); 
    }
}
        