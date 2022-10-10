public class Hayk_Mkrtchyan {
    public static void main(String[] args) {
        max(new int[]{1, 2, 4, 5, 1, 2, 3});
        difchar("abcba");
    }

    private static void max(int[] arr) {
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > max) {
                max = arr[i] * arr[i + 1];
            }
        }
        System.out.println(max);
    }

    public static void difchar(String str) {
        String str1 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(i+1)){
                str1 = str1 + str.charAt(i);
            }
        }
        int length = str1.length();
        System.out.println(length);

    }
}
