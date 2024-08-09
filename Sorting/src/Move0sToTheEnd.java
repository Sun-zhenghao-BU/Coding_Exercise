import java.util.Arrays;

public class Move0sToTheEnd {
    public static void main(String[] args) {
        Move0sToTheEnd solution = new Move0sToTheEnd();
        int[] array = new int[]{1,3,0,9,0,4,0,8};
        System.out.println(Arrays.toString(solution.moveZero(array)));
    }

    public int[] moveZero(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            if (array[i] == 0) {
                swap (array, i, j);
                j--;
            } else {
                i++;
            }
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
