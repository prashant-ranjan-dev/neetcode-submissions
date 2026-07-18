class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int maximumLength = 1;
        int currentLength = 1;

        int left = 0, right = 1;

        for(int i = 1; i < s.length(); i++){
            if(s.substring(left, right).indexOf(s.charAt(i)) == -1){
                right++;
                currentLength = s.substring(left, right).length();
                maximumLength = Math.max(currentLength, maximumLength);
            } else {
                while(s.substring(left, right).indexOf(s.charAt(i)) != -1){
                    left++;
                }
                right++;
                currentLength = s.substring(left, right).length();
                maximumLength = Math.max(currentLength, maximumLength);  
            }
        }

        return maximumLength;
    }
}
