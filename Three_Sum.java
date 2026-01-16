import java.util.Arrays;
class Three_Sum
{
public static int ThreeSum(int nums[], int result[][], int count)
{
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i+1;
            int right = n - 1;
            while(left < right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0) {
                    result[count][0] = nums[i];
                    result[count][1] = nums[left];
                    result[count][2] = nums[right];
                    count++;

                    // skip duplications
                    while(left<right && nums[left] == nums[left+1]) left++;
                    while(left>right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return count;
    }
public static void main(String[] args) 
    {
        int[] nums = {-1, 0, 2, -1, -4};
        int[][] result = new int[100][3];
        int count = 0;
        count = ThreeSum(nums,result,count);
        System.out.println("Triplets Found:");
        // print the found triplets
        for(int i =0; i<count; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}