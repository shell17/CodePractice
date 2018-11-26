package com.PracticeAgain;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSTraversal {

    private int V; //vertices
    private LinkedList<Integer> adj[]; //adjacent lists arr

    BFSTraversal(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i =0; i<V;i++){
            adj[i]=new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void bfs(int s){
        boolean[] visited = new  boolean[V]; //boolean arr
        LinkedList<Integer> queue = new LinkedList<>(); //create queue

        visited[s] = true; //mark current node visited
        //put in queue
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            System.out.println(" " + s);

            Iterator<Integer> iter = adj[s].iterator();
            while(iter.hasNext()){
                int n = iter.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);

                }
            }
        }



    }
    public static void main(String[] args){
        BFSTraversal graph = new BFSTraversal(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        graph.bfs(2);
    }

}
