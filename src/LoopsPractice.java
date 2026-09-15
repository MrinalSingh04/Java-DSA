public class LoopsPractice {
    static void main(String[] args) {

//        for (int i=1; i<=10; i++){
//            System.out.println("Code");
//        }

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=5; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++){
//            for (int j=5; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++){
//            for(int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=2*i-1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=i-1; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=8-2*i+1; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars and inner spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
