import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void findTheDifference(String s, String t) {

        int xor = 0;

        for (char c: s.toCharArray()) {
            xor ^= c;
        }

        for(char c: t.toCharArray()) {
            xor ^= c;
        }

        System.out.println((char) xor);
    }

    public static void main(String[] args) {

        String s = "a";
        String t = "aa";

        findTheDifference(s, t);
    }
}