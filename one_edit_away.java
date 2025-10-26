import java.util.Scanner;
class one_edit_away
{
    public static boolean oneEdit(String str1, String str2)
    {
        if(Math.abs(str1.length() - str2.length()) > 1)
        { return false;}
        if(str1.length()==str2.length())
        {
            return one_edit_replace(str1,str2);
        }
        else if(str1.length()+1 == str2.length())
        {
            return one_edit_insert(str1,str2);
        }
        else if(str1.length() - 1 == str2.length())
        {
            return one_edit_insert(str2, str1);
        }
        return false;
    }

    public static boolean one_edit_insert(String str1, String str2)
    {
        int i=0, j=0;
        boolean foundDifference = false;
        while(i < str1.length() && j < str2.length())
        {
            if(str1.charAt(i) != str2.charAt(j))  
                {
                    if(foundDifference==true) { return false; }
                        foundDifference = true; 
                        j++;
                }
                else{
            i++;
            j++;
        }
        }
        return true;
    }

    public static boolean one_edit_replace(String str1, String str2)
    {
        boolean foundDifference = false;
        for(int i=0; i<str1.length(); i++)
        {  
            if(str1.charAt(i) != str2.charAt(i))
            {
                if(foundDifference==true)
            {
                return false;
            }foundDifference = true;
            }            
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(oneEdit("pale","ple"));
        System.out.println(oneEdit("pale","pales"));
        System.out.println(oneEdit("pale","bale"));
        System.out.println(oneEdit("pale","bake"));
    }
}