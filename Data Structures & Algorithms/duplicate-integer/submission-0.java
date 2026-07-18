class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> arraySet = new HashSet<Integer>(Arrays.stream(nums).boxed().toList());
        return arraySet.size() != nums.length;
    }
}