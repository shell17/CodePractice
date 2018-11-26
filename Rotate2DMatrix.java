package com.practice;

public class Rotate2DMatrix {

    public static void main(String[] args){
        int[][] mat = {
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };
        rotateMatrix(mat);
    }

    private static void rotateMatrix(int[][] mat) {
        int m=3, n=3;
         for(int layer=0; layer<n/2; layer++){
             int first = layer; //0
             int last = n-1 - layer; //2

             for(int i=first;i<last;i++){

                 int offset = i - first; //0
                 //save top
                 int top =  mat[first][i]; //0,0

                 //left to top // 3,0 to 1,0
                 mat[first][i] = mat[last-offset][first];

                 //bottom to left
                 mat[last-offset][first] = mat[last][last-offset];

                 //right to bottom
                 mat[last][last-offset] = mat[i][last];

                 //top to right
                 mat[i][last] = top;



             }
         }
    }
}
