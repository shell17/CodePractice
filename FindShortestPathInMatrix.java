package com.practice;

import java.util.ArrayDeque;
import java.util.Queue;

class Node{
    int x,y, dist;
    Node(int x,int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
public class FindShortestPathInMatrix{
    static int M = 3;
    static int N =3;
    //4 possible movements
    public static int[] row = {-1,0,0,1};
        public static int[] col = {0,-1,1,0};

    //function to check valid movement
    public static boolean isValid(int mat[][], boolean visited[][],int row, int col) {
        return ((row >= 0) && (row < M) && (col>=0) && (col<N) && !visited[row][col] &&
                (mat[row][col] == 1 || mat[row][col] ==9));
    }

    public static void BFS(int mat[][],int i,int j){

        //visited array
        boolean[][] visited = new boolean[M][N];
        Queue<Node> q = new ArrayDeque<>();
        //source as visited and add in queue
        visited[i][j] = true;
        q.add(new  Node(i,j,0));

        int min_dist = Integer.MAX_VALUE;

        while(!q.isEmpty()) {

            Node n = q.poll();

            i = n.x;
            j = n.y;
            int dist = n.dist;

            if (mat[i][j] == 9) {
                min_dist = dist;
                break;
            }

            //check for all 4 movements
            for (int k = 0; k < 4; k++) {
                //check if ivalid movement
                if (isValid(mat, visited, i + row[k], j + col[k])) {
                    //mark next cell as visited and put in queue
                    visited[i + row[k]][j + col[k]] = true;
                    q.add(new Node(i + row[k], j + col[k], dist + 1));
                }
            }
        }//end of while
        if(min_dist == Integer.MAX_VALUE) {
            System.out.println("No path");
        }
        else {
            System.out.println("Shortest path " + min_dist);
        }
    }

    public static void main(String[] args){
        int[][] mat = {{1,0,0},
                        {1,0,1},
                        {1,9,1}};

        BFS(mat,0,0);

    }

}
