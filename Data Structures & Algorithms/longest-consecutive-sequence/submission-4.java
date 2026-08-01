class Solution {
    // We will implement the HashSet in this question as this will take O(n) time Complexity
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums) set.add(num);

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest = longest >= length ? longest : length;
            }
        }
        return longest;
    }
}
