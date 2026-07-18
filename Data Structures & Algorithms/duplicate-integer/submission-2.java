class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[i] != nums[j]){
                i++;
                j++;
            } else{
                return true;
            }
        }
        return false;
    }
}