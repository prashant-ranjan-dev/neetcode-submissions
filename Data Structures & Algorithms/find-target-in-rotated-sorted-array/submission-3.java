class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int n = nums.length-1;
        if(target == nums[pivot]){
            return pivot;
        }
        if(target <= nums[n] ){
            return searchInSpace(nums, target, pivot, n);
        } else if (target >= nums[0]){
            return searchInSpace(nums, target, 0, pivot);
        } else {
            return -1;
        }
        
    }

    public int searchInSpace(int [] nums, int target, int l, int r){
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == target){
                return mid;
            } else if(target < nums[mid]){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }

    public int findPivot(int [] nums){
        int  l = 0, r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l)/ 2;

            if(nums[l] <= nums[r]){
                return l;
            }
            if( nums[l] <= nums[mid] ){
                l = mid + 1;
            } else if(nums[mid] <= nums[r]){
                r = mid;
            }
        }

        return -1;
    }
}
