import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean isAnagram(String s, String t) {

        int[] freq = new int[26];
        boolean isAnagram = true;

        if(s.length() != t.length())   return false;

        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for(int i : freq){
            if(i != 0) isAnagram = false;
        }

        return isAnagram;
    }


    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
    }


}