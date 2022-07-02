import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double First, Second, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, /");
        operator = input.next().charAt(0);
        System.out.println("Enter first number");
        First = input.nextDouble();
        System.out.println("Enter second number");
        Second = input.nextDouble();
        switch (operator) {

            case '+':
                result = First + Second;
                System.out.println(First + " + " + Second + " = " + result);
                break;
            case '-':
                result = First - Second;
                System.out.println(First + " - " + Second + " = " + result);
                break;
            case '*':
                result = First * Second;
                System.out.println(First + " * " + Second + " = " + result);
                break;
            case '/':
                result = First / Second;
                System.out.println(First + " / " + Second + " = " + result);
                break;

        }
    }
}

