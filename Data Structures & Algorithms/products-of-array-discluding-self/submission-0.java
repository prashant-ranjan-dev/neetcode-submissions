class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int product = 1;
        int zeroCount = 0;
        int[] result = new int [size];
        // product of all no zero elements as well as the zero count
        for(int num : nums){
            if(num == 0)
                zeroCount++;
            else
                product *= num;
        }

        // calculate the result array
        for(int i= 0; i < size; i++){
            if (zeroCount > 1)
                result[i] = 0;
            else if(zeroCount == 1)
                result[i] = (nums[i] == 0) ? product : 0;
            else
                result[i] = product/nums[i];
        }
        return result;
    }
}  
