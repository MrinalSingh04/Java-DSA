import java.util.Scanner;

public class ArraysPractice {


    static int max(int[] nums) {
        int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    static int min(int[] nums) {
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        return minNum;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 2, 7};

        int maxNumber = max(arr);
        int minNumber = min(arr);

        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);

        // Ctrl + alt + L  ---->  auto formatter

//        int[] nums ={1,2,4,5,6,7,9};

//        System.out.println(nums[4]);
//        int sum=0;
//       for (int i=0; i<nums.length; i++){
//           System.out.println(nums[i]);

//       sum=sum+nums[i];
//
//       }
//        System.out.println(sum);


//        int max= nums[0];
//        for (int i=0; i<nums.length; i++) {
//            if ( max<nums[i]){
//                max=nums[i+1];
//            }
//        }
//       System.out.println(nums[i]);

//       Scanner sc = new Scanner(System.in);
//
//       System.out.println("Enter the size of array: ");
//       int n = sc.nextInt();
//
//       int[] nums= new int[n];
//
//       System.out.println("Enter the elements of array: ");
//       for (int i=0; i<n; i++){
//           nums[i]=sc.nextInt();
//       }
//       System.out.print("Array elements are: ");
//       for (int i:nums){
//           System.out.print(i+" ");
//       }


//       int sum=0;
//       for (int i=0; i<n; i++){
//           sum=sum+nums[i];
//       }
//       System.out.println("\nSum: "+sum);

//       int max=nums[0];
//       for (int i=0; i<n; i++){
//           if (nums[i]>max){
//               max=nums[i];
//           }
//       }
//       System.out.println("\n The maximum number is "+max);

//       int min=nums[0];
//       for (int i=1; i<n; i++){
//           if (nums[i]<min){
//               min=nums[i];
//           }
//       }
//       System.out.println("\n The minimum number is "+min);
//
//       sc.close();

//       int[] nums={1,4,7,8,10,13};
//
//       int even = 0;
//       int odd = 0;
//
//       for (int i = 0; i < nums.length; i++) {
//           if (nums[i] % 2 == 0) {
//               even++;
//           } else {
//               odd++;
//           }
//       }
//       System.out.println(even);
//       System.out.println(odd);

//       int[] nums={1,-4,7,-8,0,13,0};
//
//       int positive = 0;
//       int negative = 0;
//       int zero=0;
//
//       for (int i = 0; i < nums.length; i++) {
//           if (nums[i] > 0) {
//               positive++;
//           } else if (nums[i] < 0) {
//               negative++;
//           } else {
//               zero++;
//           }
//       }
//       System.out.println(positive);
//       System.out.println(negative);
//       System.out.println(zero);


//        Scanner sc = new Scanner(System.in);
//
//        int[] nums = {10, 20, 30, 40, 50};
//
//        System.out.println("Enter the no. to search: ");
//        int n = sc.nextInt();
//
//        boolean found = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == n) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("Found");
//        } else {
//            System.out.println("Not found");
//        }
//        sc.close();

//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the no. to be searched: ");
//        int n= sc.nextInt();
//
//        int[] nums={2,5,2,7,2,9,5};
//
//        int occurence=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==n){
//                occurence++;
//            }
//        }
//        System.out.println(n+ " occurs "+ occurence);


    }
}
