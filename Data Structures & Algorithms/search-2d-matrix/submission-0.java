class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            int left = 0, right = arr.length -1;
            while(left <= right){
                int mid = left + (right - left)/2;
                if(target < arr[mid]){
                    right = mid - 1;
                } else if(target > arr[mid]){
                    left = mid + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
