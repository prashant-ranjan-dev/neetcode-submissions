class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> nums = new LinkedHashMap<>();
        for(int i = 1; i <= numbers.length; i++){
            int complement = target - numbers[i-1];
            if(nums.containsKey(complement)){
                return new int[] {nums.get(complement), i};
            }
            nums.put(numbers[i-1], i);
        }
        return new int[]{};
    }
}
