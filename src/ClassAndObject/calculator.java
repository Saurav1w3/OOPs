package ClassAndObject;
import java.util.*;
public class calculator {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int t= sc.nextInt();
        while (t!=0){
            System.out.println("Enter the first number");
            int num1= sc.nextInt();
            System.out.println("Enter the second number");
            int num2= sc.nextInt();
            System.out.println("enter 1 for addition");
            System.out.println("enter 2 for substarction");
            System.out.println("enter 3 for multi");
            System.out.println("enter4 for division");
            System.out.println("enter 5 for reminder");
            int choice= sc.nextInt();
            int result =num1+num2;
            int result2=num1-num2;
            int result3=num1*num2;
            int result4=num1/num2;
            int result5=num1%num2;
            switch (choice){
                case 1:
                    System.out.print("Addition: "+ result);
                    break;
                case 2:
                    System.out.print("Subtraction: "+ result2);
                    break;
                case 3:
                    System.out.print("Multiplication: "+ result3);
                    break;
                case 4:
                    System.out.print("Division: " + result4);
                    break;
                case 5:
                    System.out.println("Reminder: "+ result5);

                    break;
                default:
                    System.out.println("Unknown choice");
            }
            System.out.println();
            t--;
            }


        }
    }

