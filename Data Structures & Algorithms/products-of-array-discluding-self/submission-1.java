class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        int [] suffix = new int[nums.length];
        int [] answer = new int[nums.length];

        //let's compute the prefix multiplication of the array without the current index
        for(int i = 0; i < nums.length; i++){
            if(i == 0)
                prefix[i] = 1;
            else
                prefix[i] = prefix[i-1] * nums[i-1];
        }

        //let's compute the suffix products
        for(int i = nums.length-1; i >= 0; i--){
            if(i == nums.length-1)
                suffix[i] = 1;
            else 
                suffix[i] = nums[i+1]*suffix[i+1];
        }

        // now let's fill he output/answer array
        for(int i = 0; i< nums.length; i++){
            answer[i] = prefix[i]*suffix[i];
        }

        return answer;
    }
}  
