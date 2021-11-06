public class Rough {
    public static String isPangram(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            checkIfPangram(strings.get(i));
        }
    }

    public static boolean checkIfPangram(String s) {
        int[] x = new int[26];
        for (int i = 0; i < s.length(); i++) {
            x[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0)
                return false;
        }
        return true;
    }
}
