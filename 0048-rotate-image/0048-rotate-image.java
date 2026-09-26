class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            reverse(matrix,i);
        }
    }

    public void reverse(int[][] arr,int k){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[k][left];
            arr[k][left] = arr[k][right];
            arr[k][right] = temp;
            left++;
            right--;
        }
    }
}