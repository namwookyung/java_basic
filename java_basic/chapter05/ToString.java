package chapter05;

import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12}, {21, 22}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));
    }
}
