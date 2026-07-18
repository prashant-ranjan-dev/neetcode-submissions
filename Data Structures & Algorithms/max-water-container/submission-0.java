class Solution {
    public int maxArea(int[] heights) {
        int maximumVolume = 0;
        int currentVolume = 0;

        int width = 0;
        int height = 0;
        for(int i = 0, j = (heights.length-1); i < j;){
            width = j-i;
            height = Math.min(heights[i], heights[j]);
            currentVolume = width*height;
            maximumVolume = Math.max(maximumVolume, currentVolume);
            if (heights[i] < heights[j]) {
                i++;
            } else if (heights[i] > heights[j]) {
                j--;
            } else{
                i++;
                j--;
            }
        }

        return maximumVolume;
    }
}
