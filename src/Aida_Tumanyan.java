import java.io.FilterOutputStream;

public class Aida_Tumanyan {
    public static void main(String[] args) {
        largestProduct(new int[]{1, 2, 4, 5});
    }

    private static void largestProduct(int[] arr) {
        if (arr.length < 2) {
            System.out.println("There are no pairs");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * arr[i + 1] > temp) {
                int temp = 0;
                temp = arr[i] * arr[i + 1];
            }
        }
        System.out.println(temp);
    }

}
class NumberOfDifferentCharacters {
    public static void main(String[] args) {
        int count = 0;
    }
    private static int numberOfDifferentCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                if(str[i] != str[j]) {
                    char a = str.charAt(i);
                    String string = new String();
                    string += a;
                }else {
                    count++
                }
            }
        }
        System.out.println(count + string.length);
    }
}
