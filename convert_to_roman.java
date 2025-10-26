public class convert_to_roman
{
    public static void main(String[] args)
    {
        int[] base={1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman={"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder res = new StringBuilder();
        int i = base.length-1;
        int x = 3549;
        while(x>0)
        {
            int div = x / base[i];
            while(div>0){
                res.append(roman[i]);
                div--;
            }
            x = x % base[i];
            i--;
        }
        System.out.println(res.toString());
    }
}