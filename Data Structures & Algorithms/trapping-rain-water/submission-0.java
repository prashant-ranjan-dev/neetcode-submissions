class Solution {
    public int trap(int[] height) {
        int totalStorage = 0;

        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int leftMax = height[0];
        int rightMax = height[height.length - 1];

        for (int i = 0; i < height.length; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            }
            prefix[i] = leftMax;
        }

        for (int j = height.length - 1; j >= 0; j--) {
            if (height[j] > rightMax) {
                rightMax = height[j];
            }
            suffix[j] = rightMax;
        }

        for (int i = 0; i < height.length; i++) {
            if (height[i] < prefix[i] && height[i] < suffix[i]) {
                totalStorage += Math.min(prefix[i], suffix[i]) - height[i];
            }
        }

        /*
        while (left < right) {
            if (height[left] < height[right]) {
                if ((height[left] - height[right]) > 0) {
                    totalStorage += (height[left] - height[right]);
                    left++;
                } else {
                    left++;
                }
            } else if (height[left] == height[right]) {
                left++;
            } else {
                if ((height[left] - height[right]) > 0) {
                    totalStorage += (height[left] - height[right]);
                    right--;
                } else {
                    right--;
                }
            }
        }*/
        return totalStorage;
    }
}
