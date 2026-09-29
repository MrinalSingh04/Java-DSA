package DSA.Arrays;

import java.util.Arrays;

public class BubbleSorting {

    static void main(String[] args) {

        //sort in descending order
        int[] nums = {5, 3, 4, 1, 2};

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));

    }

}
