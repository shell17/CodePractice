package com.practice;

public class FindNumOfIslands {

    private static final int maxRows =3;
    private static final int maxCols =3;



    public static void main(String[] args){
        int[][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,0,1}
        };
        FindNumOfIslands islands = new FindNumOfIslands();
        int count = islands.countNum(matrix);
        System.out.println("count: " + count);

    }

    private int countNum(int[][] matrix) {

        boolean[][] visited = new boolean[maxRows][maxCols];
        int count =0;
        for(int i=0;i<maxRows;i++){
            for(int j=0;j<maxCols;j++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    dfs(matrix,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] matrix, boolean[][] visited, int i, int j) {

        int[] rowNbr = {-1,1,0,0};
        int[] colNbr = {0,0,1,-1};

        visited[i][j] = true;

        for(int k=0; k<rowNbr.length; k++){
            if(isValidPath(matrix,visited,i+rowNbr[k], j+colNbr[k])){

                dfs(matrix,visited,i+rowNbr[k],j+colNbr[k]);
            }
        }



    }

    private boolean isValidPath(int[][] matrix, boolean[][] visited, int i, int j) {
        if(i>=0 && i<maxRows
                && j>=0 && j<maxCols
                && matrix[i][j]==1
                && !visited[i][j]){
            return true;
        }

        return false;
    }

}

/*
package com.practice;

class Node {
    int x, y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class FindNumOfIslands {

    private int M=4;
    private int N=4;

    public int[] row = {-1,0,0,1};
    public int[] col = {0,-1,1,0};


    public static boolean isValidPath(int[][] mat,boolean[][] visited,int row, int col){
        return( (row>=0) && (row<M) && (col>=0) && (col<N) && mat[row][col]==1 && !visited[row][col]  )

    }


    public static void findNext1Occurence(startIndexRow, startIndexCol, Queue q){


        for(int i=startIndexRow;i<M;i++){
            for(int j=startIndexCol;j<N;j++){
                if(mat[i][j] == 1){
                    q.push(new Node(i,j));
                    break;
                }

            }
            if(!q.isEmpty()){
                break;
            }
        }

    }

    public static int findGroupsOfConnectedIslands(int[][] mat, int i, int j){
        boolean[][] visited = new boolean[M][N];
        int numOfIslands =0;
        Queue<Node> q = new ArrayDeque<>();

        //need to find 1 in mat[i][j]
        findNext1Occurence(i,j,q);

        while(!q.isEmpty()){
            Node n = q.poll();

            //adjacent 1 is covered

            if(mat[n.x][n.y] == 1){
                boolean noAdjacentOne = false;
                for(int k=0; k<4; k++){
                    if(isValidPath(mat,i+row[k]),j+col[k],visited)             {
                        numOfIslands++;
                        visited[i+row[k]][j+col[k]] = true;
                        noAdjacentOne = true;
                        q.add(new Node[i+row[k]][j+col[k]);
                    }
                }
                if(!noAdjacentOne && i<M && j<N){
                    findNext1Occurence(i+1,j+1,q);
                }
            }


        }//end of while

        //negative usecase
        if(numOfIslands==0){
            System.out.println("No islands found");
        }
        else{
            System.out.println("Num of islands found: " + numOfIslands);


        }


    }

    public static void main(String[] args) {

        int[][] mat  = {
                {0,0,0,1},
                {1,0,0,1},
                {0,1,0,1}
        };
        findGroupsOfConnectedIslands(mat,0,0);

    }
}





*/
