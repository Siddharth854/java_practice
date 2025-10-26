public class leetcode_01 {
    public static void main(String[] args)
    {
        int arr[]={1,2,4,8,15,16,23,42};
        int left=0, right=arr.length-1;
        int target = 19;
        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if(sum==target) 
            {
            System.out.println(left+" , "+right);
            break;
            }
            else if(sum>target) {right--;}
            else {left++;}
        }
    }
}
