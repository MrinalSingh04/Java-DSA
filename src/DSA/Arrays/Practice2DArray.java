package DSA.Arrays;

public class Practice2DArray {
    public static void main(String[] args) {

//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum = sum + matrix[i][j];
//            }
//
//        }
//        System.out.println(sum);

//
//        int[][] matrix = {
//                {4, 6, 3},
//                {3, 1, 7},
//                {5, 8, 6}
//        };
//
//        int max = matrix[0][0];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] > max) {
//                    max = matrix[i][j];
//                }
//            }
//
//        }
//        System.out.println(max);


//        int[][] matrix = {
//                {4, 8, 2},
//                {7, 1, 9},
//                {5, 6, 3}
//        };
//
//        for (int j = 0; j < matrix[0].length; j++) {
//
//            int sum = 0;
//            for (int i = 0; i < matrix.length; i++) {
//                sum += matrix[i][j];
//            }
//            System.out.println(sum);
//        }


//        int[][] matrix = {
//                {4, 8, 2},
//                {2, 1, 9},
//                {5, 6, 3}
//        };
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to check: ");
//        int n = sc.nextInt();
//
//        boolean found = false;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == n) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("Yes Found");
//        } else {
//            System.out.println("Not founds");
//        }


        int[][] matrix = {
                {4, 8, 2},
                {7, 1, 9},
                {5, 6, 3}
        };

        int max = 0;
        int maxRow = 0;

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                if (sum > max) {
                    max = sum;
                    maxRow = i;
                }
            }
        }
        System.out.println("Row with index " + maxRow + " has max sum: " + max);

    }
}
