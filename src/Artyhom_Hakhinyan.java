public class Artyhom_Hakhinyan {
    public static void main(String[] args) {

    }

    public static void largestProduct(int[] inputArray) {
        int maxProduct = -1000;
        for (int index = 0; index < inputArray.length; index++) {
            if (inputArray[index] * inputArray[index + 1] > maxProduct) {
                maxProduct = inputArray[index] * inputArray[index + 1];
                System.out.println("Max product is: " + maxProduct);
            }
        }
    }

    public static void commonChars(String s) {
        int countOfDiff = 0;
        for (int indexOne = 0; indexOne < s.length(); indexOne++) {
            if (s.charAt(indexOne) == ' ') {
                continue;
            }else {
                ++countOfDiff;
                for (int indexTwo = indexOne + 1; indexTwo < s.length(); indexTwo++) {
                    if (s.charAt(indexOne) == s.charAt(indexTwo)) {
                        s.replace(s.charAt(indexTwo), ' ');
                    }
                }
            }
            System.out.println(countOfDiff);
        }
    }
}
