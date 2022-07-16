package Lesson3;
import java.util.Scanner;
public class IndicatorOfEven
{
    public static void main(String[] args)
    {
        System.out.print("Please enter number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Even");
        }
        else
            System.out.println("UnEven");
    }
}
