class Solution {
    public boolean bs(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (arr[mid] == target){
                return true;
            }else if (arr[mid] < target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int arr[] = new int[m*n];
        int s = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[s++] = matrix[i][j];
            }
        }
        return bs(arr,target);
    }
}
