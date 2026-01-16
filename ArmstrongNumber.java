import java.util.Scanner;
public class ArmstrongNumber {
    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is NOT an Armstrong number");
        }
        sc.close();
    }
}
