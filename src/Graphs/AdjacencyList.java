package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
   public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest,int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
   public static void createGraph(ArrayList<Edge> graph[]){
//        for(ArrayList<Edge> e: graph){
//            e=new ArrayList<Edge>();
//            System.out.println("empty arraylist created");
//        }this doesn't create an empty arraylist
       for (int i = 0; i < graph.length; i++) {
           graph[i] = new ArrayList<Edge>();
       }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,2));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,1,1));

        graph[3].add(new Edge(3,1,2));
        graph[3].add(new Edge(3,2,1));
        System.out.println("edges created");
    }
    public static void printNeighbour(ArrayList<Edge>list){
        if(list==null|| list.isEmpty()){
            return;
        }
        for(Edge e: list){
            System.out.print(e.src+"--"+e.wt+"->"+e.dest+"\n");
        }
    }
    public static void printAll(ArrayList<Edge>[] graph){
       for (ArrayList<Edge> list : graph) {
           printNeighbour(list);
       }
    }
    public static void main(String[] args) {
        int V=4;
        //int arr[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the vertex number whose neighbour you want to know:");
//        int v=in.nextInt();
//        printNeighbour(graph[v]);
        printAll(graph);
    }
}
