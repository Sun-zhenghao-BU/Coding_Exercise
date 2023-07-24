import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = 10 * i;
        }
        int res = findMax(arr1);
        System.out.println(res);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
