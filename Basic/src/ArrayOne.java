import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = 10 * i;
        }
        int res = findMax(arr1);
        System.out.println(res);
        int[] resArr = insertElement(arr1, 38, 7);
        System.out.println(Arrays.toString(resArr));
        reverseArray(resArr);
        System.out.println(Arrays.toString(resArr));
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

    private static int[] insertElement(int[] arr, int ele, int pos) {
            int len = arr.length;
            int[] arr1 = new int[len + 1];
            for (int i = 0, j = 0; i < arr1.length; i++, j++) {
                arr1[i] = arr[j];
                if (i == pos) {
                    arr1[i] = ele;
                    arr1[++i] = arr[j];
                }
            }
            return arr1;
    }

    private static void reverseArray (int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
