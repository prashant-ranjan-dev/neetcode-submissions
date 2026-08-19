class Solution {
    public static int trap (int[] height){
        int totalStorage = 0, rightMax = 0, leftMax = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    totalStorage += leftMax - height[left];
                } else{
                    leftMax = height[left];
                }
                left++;
            } else{
                if (rightMax > height[right]) {
                    totalStorage += rightMax - height[right];
                } else{
                    rightMax = height[right];
                }
                right--;
            }
        }

        return totalStorage;
    }
}
