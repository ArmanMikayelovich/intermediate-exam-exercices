public class Vahe_Ghazaryan {
    public static void main(String[] args) {
        foo(new int[]{1, 2, 4, 5, 1});
    }

    private static void foo(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] * arr[i + 1] > largest) {
                largest = arr[i] * arr[i + 1];
            }
        }
        System.out.println(largest);
    }
}
