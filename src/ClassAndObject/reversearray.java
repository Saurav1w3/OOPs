package ClassAndObject;
public class reversearray {
    public static void main(String[]args){
        int []arr={24,45,6,85,75,90};
        int size=arr.length;
        reversearray(arr,0,size-1);
        for(int i=0;i<size;i++){
            System.out.print(" "+arr[i]+"");
        }
    }
    public static void reversearray( int [] arrayValue, int start, int end){
        int temp=0;
        while(start<=end){
            temp=arrayValue [start];
            arrayValue[start] = arrayValue[end];
            arrayValue[end] = temp;
            start++;
            end--;

        }


    }
}
