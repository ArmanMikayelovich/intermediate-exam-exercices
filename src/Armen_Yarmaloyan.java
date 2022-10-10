public class Armen_Yarmaloyan {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 7, 5});
    }

    public static void solution(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if(array[i] * array[j] > max) {
                    max = array[i] * array[i + 1];
                    System.out.println(max);
                }
            }
        }
    }
}
