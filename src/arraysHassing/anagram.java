package arraysHassing;

import java.util.Arrays;

public class anagram {

    public static void main(String[] args) {
        System.out.println();
        anagram obj = new anagram();
        System.out.println(obj.isAnagram("racecar","carrace"));
        System.out.println(obj.isAnagram("jam", "jem"));
    }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        String newS = tosort(s);
        String newT = tosort(t);

        for (int i = 0; i < newS.length(); i++) {
            if (newS.charAt(i) != newT.charAt(i)) return false;
        }

        return true;
    }

    public String tosort(String str){
        char[] tem = str.toCharArray();
        Arrays.sort(tem);
        String sortedString = new String(tem);
        return sortedString;
    }
}
