class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int collen = matrix[0].length;
        int n = matrix.length * collen;
        int left = 0, right = n-1;
        while (left <= right){
            int mid = left + (right - left)/2;
            int row = mid/collen;
            int col = mid % collen;
            if (target == matrix[row][col]){
                return true;
            }else if(target < matrix[row][col] ){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }
}
