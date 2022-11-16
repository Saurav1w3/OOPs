package ClassAndObject;

class Rectangle{
    int length;
    int breadth;

}

public class Variable {
    int length;
    int breadth;

    public static int MaxNum(int[] newArray) {
        int max = newArray[0];
        int size = newArray.length;
        for (int i = 0; i < size; i++) {
            if ( newArray [i] > max)
                max = newArray[i];

        }
        return max;
    }
         public static void main(String [] args)
        {
            int arr[] = {45, 62, 2, 75, 45, 90, 60};
            MaxNum(arr);
            System.out.println("largesst number"+" "+arr);

        }
    }
