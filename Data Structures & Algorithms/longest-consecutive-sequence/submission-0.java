class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int longestSequence = 1;
        int currentLongestSequence = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                continue;
            else if(nums[i] == nums[i-1]+1){
                currentLongestSequence++;
            } else {
                longestSequence = Math.max(longestSequence, currentLongestSequence);
                currentLongestSequence = 1;
            }
        }

        return Math.max(longestSequence, currentLongestSequence);
    }
}
