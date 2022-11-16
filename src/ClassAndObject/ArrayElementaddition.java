package ClassAndObject;
import java.util.*;
public class ArrayElementaddition {
 public static void main(String[]args){
     Scanner sc =new Scanner (System.in);
  System.out.println("Enter array size");
  byte arraySize= sc.nextByte();
  int [] arrayvalues= new int [arraySize];
  System.out.println("Enter a array value");
  for (int i=0;i<arraySize;i++){
   arrayvalues[i]=sc.nextInt();
  }
  int sum=0;
  for (int i=0;i<arraySize;i++){
   sum+=arrayvalues[i];
  }
  System.out.println("sumn of all the values"+sum);
 }
}
