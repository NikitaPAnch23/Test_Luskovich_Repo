package Lesson3;
public class nonEvenNumberisungFor
{
    public static void main(String[] args)
    {
        int value = 99;
        int i;
        for (i = 1; i <= value; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}