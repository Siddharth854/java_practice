public class closest_three_sum
{
	static int closest_3_sum(int arr[],int target)
	{
		int n = arr.length;
		int minDiff = Integer.MAX_VALUE;
		int res= 0;

		//Generating all Possible Combination
		for(int i=0; i<n-2;i++)
		{
			for(int j=i+1; j<n-1; j++)
			{
				for(int k=j+1; k<n; k++)
				{
					int sum = arr[i]+arr[j]+arr[k];
					int diff = Math.abs(sum-target);
					if(diff<minDiff)
					{
						res = sum;
						minDiff = diff;
					}
					else if(diff==minDiff)
					{
						res = Math.max(res,sum);
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		int arr[]={-1,2,2,4};
		int target = 4;
		System.out.println(closest_3_sum(arr,target));
	}
}