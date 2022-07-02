import java.util.Scanner;

public class PositiveOrNegativ {
    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
        num = sc.nextInt();
        result = Integer.signum(num);
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
            System.out.print(result);
        }
    }
}