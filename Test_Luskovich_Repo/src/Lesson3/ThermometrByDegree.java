package Lesson3;
import java.util.Scanner;
public class ThermometrByDegree
{
    public static void main(String[] args)
    {
        System.out.print("Please enter Temperature degree");
        Scanner scan = new Scanner(System.in);
        int temperuture = scan.nextInt();
        if (temperuture >-5)
        {
            System.out.println("Warm");
        }
        else if (temperuture> -20 || temperuture == -20)
        {
            System.out.println("Normal");
        }
        else if (temperuture < -20)
        {
            System.out.println("Cold");
        }
    }
}
