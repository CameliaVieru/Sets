import java.util.ArrayList;
import java.util.HashSet;

public class KeyBoard {
	public String[] findWords(String[] words) {
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";

        ArrayList<String> out = new ArrayList<String>();

        HashSet<Character> set1 = new HashSet<>();
        for (char ch : row1.toCharArray()) {
            set1.add(ch);
        }

        HashSet<Character> set2 = new HashSet<>();
        for (char ch : row2.toCharArray()) {
            set2.add(ch);
        }

        HashSet<Character> set3 = new HashSet<>();
        for (char ch : row3.toCharArray()) {
            set3.add(ch);
        }

        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];
			
            String word = word1.toLowerCase();
	
            boolean valid = true;
			
            char ch1 = word.charAt(0);
            if (set1.contains(ch1)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!set1.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            } else if (set2.contains(ch1)) {
                for (int j = 1; j < word.length(); j++) {
                    if (!set2.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            } else {
                for (int j = 1; j < word.length(); j++) {
                    if (!set3.contains(word.charAt(j))) {
                        valid = false;
                        break;
                    }
                }
            }
			
            if (valid)
                out.add(word1);
        }
		
        String[] toReturn = new String[out.size()];
        int i = 0;
        for (String s : out) {
            toReturn[i] = s;
            i += 1;
        }
        return toReturn;
    }

}
