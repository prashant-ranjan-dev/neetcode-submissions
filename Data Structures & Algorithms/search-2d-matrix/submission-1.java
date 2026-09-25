class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        int top = 0, bottom = rows - 1, targetRow = -1;

        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            if (target > matrix[midRow][cols - 1]) {
                top = midRow + 1;
            } else if (target < matrix[midRow][0]) {
                bottom = midRow - 1;
            } else {
                targetRow = midRow;
                break;
            }
        }

        if (targetRow == -1) {
            return false;
        }

        int left = 0, right = cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < matrix[targetRow][mid]) {
                right = mid - 1;
            } else if (target > matrix[targetRow][mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
