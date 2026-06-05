

public class Main {

    public static boolean repeatedSubstringPattern(String s) {

        String pattern = s + s;
        return pattern.substring(1, s.length()-1).contains(s);
    }

    public static void main(String[] args) {

        System.out.println(repeatedSubstringPattern("abc"));
    }
}