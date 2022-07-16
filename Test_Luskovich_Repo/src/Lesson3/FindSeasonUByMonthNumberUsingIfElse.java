package Lesson3;
import java.util.Scanner;
public class FindSeasonUByMonthNumberUsingIfElse
{
    public static void main(String[] args)
    {
        System.out.print("Please enter number of Month");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        if (month > 11 && month < 3)
        {
            System.out.println("Winter");
        }
        else if(month > 2 && month < 6)
        {
            System.out.println("Spring");
        }
        else if(month > 5 && month < 9)
        {
            System.out.println("Summer");
        }
        else if(month > 8 && month < 12)
        {
            System.out.println("Summer");
        }
        else System.out.println("Incorrect number");
    }

}

