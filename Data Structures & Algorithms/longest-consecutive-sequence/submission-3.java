class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int result = 0;
        int currentSequenceLength = 1;
        Arrays.sort(nums);
        for(int i = 0, j = 1; j < nums.length; i++, j++){
            if(nums[i] == nums[j])
                continue;
            if(nums[i] == nums[j] - 1){
                currentSequenceLength++;
            } else{
                result = result >= currentSequenceLength ? result : currentSequenceLength;
                currentSequenceLength = 1;
            }
        }
        result = result >= currentSequenceLength ? result : currentSequenceLength;
        return result;
    }
}
