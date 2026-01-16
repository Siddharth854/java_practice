import java.util.*;

public class longest_subarray_sum {

    public static int longest_subarray(int[] arr, int target) {
        Map<Integer, Integer> sumSeenIndexMap = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == target) {
                maxLen = i + 1;
            }

            if (sumSeenIndexMap.containsKey(prefixSum - target)) {
                maxLen = Math.max(maxLen, i - sumSeenIndexMap.get(prefixSum - target));
            }

            if (!sumSeenIndexMap.containsKey(prefixSum)) {
                sumSeenIndexMap.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int len = sc.nextInt();

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        int largest_sum = longest_subarray(arr, target);
        System.out.println("The largest subarray length is : " + largest_sum);
    }
}
