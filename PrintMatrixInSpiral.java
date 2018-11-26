package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSpiral {

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int left=0,right=n-1,down=m-1,up=0;
        //row traverse l to r

        while(result.size() < n*m){
            for(int j =left; j<=right && result.size() < n*m;j++){
                result.add(matrix[up][j]);
            }
            for(int i=up+1;i<=down-1 && result.size() < n*m; i++){
                result.add(matrix[i][right]);
            }
            for(int k=right;k>=left && result.size() < n*m;k--){
                result.add(matrix[down][k]);
            }
            for(int l=down-1;l>=up+1 && result.size() < n*m;l--){
                result.add(matrix[l][left]);
            }
            left++;right--;up++;down--;
        }

        return result;

    }

    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);

    }
}
