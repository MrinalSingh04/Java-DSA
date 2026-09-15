public class StringBasics {
    static void main(String[] args) {
//        String str = "Jammy";
//        // find the length of the string
//        int count = 0;
//        for (char ch : str.toCharArray()) {
//            count++;
//        }
//        System.out.println(count);

        //count vowels in the string
        String str = "Radio";
        char[] arr = str.toCharArray();

        int vowels = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vowels++;
            }
        }
        System.out.println(vowels);
    }
}
