public class Artur_Aghajanyan {
    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(largestProduct(inputArray));

        String str = "cabca";
        System.out.println(findDiffChars(str));

    }

    private static int largestProduct(int[] arr) {
        int maxProd = arr[0] * arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > maxProd) {
                maxProd = arr[i] * arr[i + 1];
            }
        }
        return maxProd;
    }

    private static int findDiffChars(String str) {
        int count = 1;
        boolean isSame;
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(str.charAt(i) = str.charAt(j)) {
                    isSame = true;
                    break;
                }
            }
            if(!isSame) {
                count++;
            }
        }
        return count;
    }
}
