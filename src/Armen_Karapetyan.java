public class Armen_Karapetyan {
    public static void main(String[] args) {

    }

    public static void largestProduct(int[] inputArray) {
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length - 1; j++) {
                if (inputArray[i] * inputArray[j] > max) {
                    max = inputArray[i] * inputArray[j];
                }
            }
        }
        System.out.println(max);
    }

    public static void commonChars(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length() - 1; j++) {
                s.charAt(i) != s.charAt(j);
                    count++;
                    s.replace(i);
                    s.replace(j);
            }
        }
        System.out.println(count);
    }
}
