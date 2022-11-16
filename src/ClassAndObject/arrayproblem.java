package ClassAndObject;
 import java.util.*;
public class arrayproblem {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the array");
        byte arraySize= sc.nextByte();
        int[] arrayvalues= new int [arraySize];
        System.out.println("array values");
        for(int i=0;i<arraySize;i++){
            System.out.println(arrayvalues[i]+"");
        }
    }
}
