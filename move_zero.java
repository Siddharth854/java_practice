import java.util.Scanner;

class move_zero {
    public static void moveZeroes(int[] nums) {
        int point = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                point++;
            } else {
                if (point != 0) {
                    nums[i - point] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call moveZeroes
        moveZeroes(nums);

        // Print result
        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
