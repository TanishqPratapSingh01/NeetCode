class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);

            // Characters that need to be replaced
            int windowSize = right - left + 1;
            int replacements = windowSize - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
