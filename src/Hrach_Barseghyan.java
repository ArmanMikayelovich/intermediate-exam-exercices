public class Hrach_Barseghyan {
    public static void main(String[] args) {
        largestNumber(new int[]{1, 2, 4, 5, 3});
    }

    public static void largestNumber(int[] tempArray){

        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                int largestNum = tempArray[i] > tempArray[j] ? tempArray[i] : tempArray[j];
            }
        }
        System.out.println(largestNumber());
    }
}
