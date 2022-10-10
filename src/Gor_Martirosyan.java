public class Gor_Martirosyan {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, 2, 3, 4, 6, 6, 7}));
        System.out.println(numberOfDifferentChars("abcba"));
    }



    private static int maxProduct(int[] arr) {
        int max = arr[0] * arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            int currentProd = arr[i] * arr[i + 1];
            if (currentProd > max) {
                max = currentProd;
            }
        }

        return max;
    }

    private static int numberOfDifferentChars(String s) {
        char[] unique = new char[s.length()];
        unique[0] = s.charAt(0);
        int j = 1;
        for (int i = 1; i < s.length(); i++) {
            if (unique.indexOf(s.charAt(i)) == -1) {
                unique[j] = s.charAt(i);
                j++;
            }
        }
        return unique.length;
    }
}
