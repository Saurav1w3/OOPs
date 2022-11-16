package ClassAndObject;
import java.util.*;
public class oddeven {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        oddeven(num);
    }
    public static void oddeven(int num){
        if(num%2==0){
            System.out.println(num+"even");
        }else
            System.out.println(num+"odd");
    }
}
