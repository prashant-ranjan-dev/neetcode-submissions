class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i =0; i < size; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = size-1;
            while(left < right){
                int calculate = nums[left] + nums[i] + nums[right];
                if(calculate == 0){
                    result.add(new ArrayList<>(Arrays.asList(nums[left], nums[right], nums[i])));
                    while(left < right && nums[left]== nums[left+1]) left++;
                    while(right > left && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                    continue;
                }
                if(calculate < 0){
                    left++;
                    continue;
                }
                else if(calculate > 0){
                    right--;
                    continue;
                }
                
            }
            
        }

        return result;
    }
}
