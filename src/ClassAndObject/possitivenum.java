package ClassAndObject;

import java.util.Arrays;

public class possitivenum {
    public static void main(String[] args) {
        int arr_num[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        System.out.println("original arr" + Arrays.toString(arr_num));
        int j, temp, arr_size;
        arr_size = arr_num.length;
        for (int i = 0; i < arr_size; i++) {
            j = i;
            while ((j > 0) && (arr_num[j] > 0) && (arr_num[j - 1] < 0)) {
                temp = arr_num[j];
                arr_num[j] = arr_num[j - 1];
                arr_num[j - 1] = temp;
                j--;
            }
        }
        System.out.println("New array : " + Arrays.toString(arr_num));
    }
}
