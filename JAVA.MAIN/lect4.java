
import java.util.Scanner;

public class lect4 {

    public static void main(String[] args) {
        System.err.println("enter a character:");
        Scanner sc = new Scanner(System.in);
        char arr = sc.next().charAt(0);
        switch (Character.toLowerCase(arr)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
