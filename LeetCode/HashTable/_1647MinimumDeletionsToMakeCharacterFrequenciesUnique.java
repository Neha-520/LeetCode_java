public class _1647MinimumDeletionsToMakeCharacterFrequenciesUnique {
    class Solution {
    public int minDeletions(String s) {
       int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }       
        int deleteCount = 0;
        HashSet<Integer> seenFrequencies = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            while (frequency[i] > 0 &&                
                seenFrequencies.contains(frequency[i])) {
                frequency[i]--;
                deleteCount++;
            }
            seenFrequencies.add(frequency[i]);
        }        
        return deleteCount;
    }
}
}
