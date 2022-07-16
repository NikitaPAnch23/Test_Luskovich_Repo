package Lesson3;
import  java.util.Scanner;
public class folding
{
    public static void main(String[] args)
    {
        System.out.print("Please enter number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}
