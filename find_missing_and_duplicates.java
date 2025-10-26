import java.util.HashSet;
public class find_missing_and_duplicates
{
    public static void main(String[] args)
    {
        int[][] grid = {{1,2},{2,4}};
        int result[] = find_missing(grid);
        System.out.println("Repeated: "+result[0]);
        System.out.println("Missing: "+result[1]);
    }
    public static int[] find_missing(int[][] grid)
    {
        HashSet<Integer> s = new HashSet<>();
        int n = grid.length;
        int repeated = -1, missing = -1;
        int expected_Sum = (n*n*(n*n+1))/2;
        int actual_Sum = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num = grid[i][j];
                actual_Sum += num;
                if(s.contains(num))
                {
                    repeated = num;
                }else{
                    s.add(num);
                }
            }
        }
        missing = expected_Sum - actual_Sum + repeated;
        return new int[]{repeated,missing};
    }
}