class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character, Integer> charactersFrequency = new HashMap<Character, Integer>(); 
        int maxLength = 0;
        int maxFrequency = 0;
        // for(Character c : s.toCharArray()){
        // }
        for (int i = 0, j = 0; j < s.length(); j++){
            int windowSize = j - i + 1;
            int newFrequency = charactersFrequency.compute(s.charAt(j), (key, val) -> val == null ? 1 : val + 1);
            if(newFrequency > maxFrequency){
                maxFrequency = newFrequency;
            }
            while((windowSize - maxFrequency) > k){
                newFrequency = charactersFrequency.compute(s.charAt(i), (key, val) -> val == null ? 0 : val - 1);
                i++;
                windowSize = j - i + 1;
            }
            maxLength = Math.max(maxLength, windowSize);
        }
        return maxLength;
    }
}
