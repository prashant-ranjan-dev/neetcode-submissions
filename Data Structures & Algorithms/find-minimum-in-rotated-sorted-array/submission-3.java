class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, mid = 0;
        if(nums[l] <= nums[r]){
            return nums[l];
        }
        while(l <= r){
            if(nums[l] <= nums[r]){
                return nums[l];
            }
            mid = l + (r - l) / 2;
            if(l == r){
                return nums[mid];
            }
            if(nums[l] <= nums[mid]){
                l = mid + 1;
            } else if(nums[mid] <= nums[r]){
                r = mid;
            }
        }
        return -1;
    }
}