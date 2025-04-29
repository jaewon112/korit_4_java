package ch12_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array10 {

    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        // 이사의 2차 배열에 1 ~ 100 까지 값을 집어넣으시오.

        // Arrays.deepToString(nums); 를 통해 출력
//        실행 예
        /*

         */
        int num = 0;
        for (int i = 0; i < nums.length; i++) {         // nums.length == 20
            for (int j = 0; j < nums[i].length; j++) {  // nums[i].length == 5
                 nums[i][j]=++num;
            }
        }
        System.out.println(Arrays.deepToString(nums));


    }
}
