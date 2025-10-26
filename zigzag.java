import java.util.Scanner;
public class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        // Edge case
        if (numRows == 1) {
            System.out.println(str1);
            sc.close();
            return;
            
        }

        // Convert String to Array
        String[] ans = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = "";
        }
        int i = 0;
        while(i < str1.length())
        {
            // vertical arrangement
            for(int index = 0; index < numRows && i < str1.length(); i++)
            {
                ans[index] = ans[index] + str1.charAt(i++);
            }
            // Diagonal arrangement
            for(int index = numRows-2; index > 0 ; index--)
            {
                ans[index] = ans[index] + str1.charAt(i++); 
            }
        }

        // Build final result
        String res = "";
        for (String row : ans) {
            res += row;
        }

        // Print result
        System.out.println("Zigzag conversion: " + res);
        sc.close();
    }
}
