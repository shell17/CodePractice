package com.PracticeAgain;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // use binary search
        int m = matrix.length;
        int n = matrix[0].length;



        int left = 0;
        int right = m*n -1;

        while(left <= right){
            int mid = (left + right) /2;
            int midValue = matrix[mid/n][mid%n];
            if( midValue == target){
                return true;
            }
            else if (midValue < target){
                //go right
                left= mid+1;
            }
            else{
                right = mid -1;
            }
        }
        return false;
    }
}

