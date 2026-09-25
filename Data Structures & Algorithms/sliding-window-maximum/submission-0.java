class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0){
            return new int[0];
        }
        int n = nums.length;
        int [] ans = new int[n - k + 1];
        PriorityQueue<Pair> valueInWindow = new PriorityQueue<>((a, b)-> Integer.compare(b.val, a.val));

        for(int i = 0; i < n; i++){
            valueInWindow.add(new Pair(nums[i], i));

            while(!valueInWindow.isEmpty() && valueInWindow.peek().index <= i - k){
                valueInWindow.poll();
            }

            if(i >= k - 1){
                ans[i - k + 1] = valueInWindow.peek().val;
            }
        }

        return ans;
    }
}

class Pair {
    int val;
    int index;

    public Pair(int val, int index){
        this.val = val;
        this.index = index;
    }
}
