package Lesson3;
import java.util.Scanner;
public class FindSeasonUByMonthNumberUsingSwitchCase
{
    public static void main(String[] args)
    {
        System.out.print("Please enter number of Month");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Atumn");
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
