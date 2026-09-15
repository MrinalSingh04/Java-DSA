public class ArraysInterviewQS {
    static void main() {

        // 1. Find the second-largest number

        int[] nums = {2, 4, 5, 9, 7};

        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        System.out.println(secondLargest);
    }
}
