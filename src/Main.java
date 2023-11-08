import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println(sortStringLetters("Akademia108"));
        System.out.println(sortStringLetters2("Akademia108"));
    }

    public static String sortStringLetters(String str) {
        char[] charArray = str.toCharArray();
        boolean swapped = false;

        for (int n = 1; n < str.length(); n++) {

            for (int i = 0; i < str.length() - n; i++) {

                if (charArray[i] > charArray[i + 1]){
                    char temp = charArray[i];
                    charArray[i] = charArray[i + 1];
                    charArray[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            else swapped = false;
        }
        return new String(charArray);
    }

    public static String sortStringLetters2(String str) {
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);
    }
}


