package String;

import java.util.ArrayList;
import java.util.List;

public class _1002FindCommonCharacters {
    class Solution {
        public List<String> commonChars(String[] words) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < words[0].length(); i++) {
                boolean flag = true;
                char c = words[0].charAt(i);
                for (int j = 1; j < words.length; j++) {
                    int index = words[j].indexOf(c);
                    if (index == -1) {
                        flag = false;
                        break;
                    } else
                        words[j] = words[j].substring(0, index) + words[j].substring(index + 1);
                }
                if (flag)
                    result.add(Character.toString(c));
            }
            return result;
        }
    }
}
