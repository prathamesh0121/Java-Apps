package Prathamesh.com;

import java.util.Scanner;

public class Calculator
{
    public  static void main(String args[])
    {
        Scanner scanner =new Scanner(System.in);
        while (true) {
            System.out.println("Enter Frist value :");
            int num1 = scanner.nextInt();

            System.out.println("Enter second value :");
            int num2 = scanner.nextInt();

            System.out.println("Enter \n+ for Addition \n- for Substraction \n* for multiplication \n/ for division \n% for mod");

            String input = scanner.next();
            switch (input) {
                case "+":
                    System.out.println("Addition is :" + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Substraction is :" + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Multiplication is :" + (num1 * num2));
                    break;
                case "/":
                    if(num2==0)
                        System.out.println("Cannot divide by zero");
                    else
                        System.out.println("Divison is:" + (num1 / num2));
                    break;
                case "%":
                    System.out.println("Mod is:" + (num1 % num2));
                    break;
                default:
                    System.out.println("incorrect option select !!");
            }
            System.out.println("Enter Y to Continue and N to exit");
            String op = scanner.next();
            if(op.equals("N") || op.equals("n"))
                break;

        }

    }
}
