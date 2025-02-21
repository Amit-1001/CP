package Graph.Construction;

import java.util.ArrayList;
import java.util.List;


public class graph {
    public static class Edges{
        int src;
        int nbr;
        int weight;

        Edges(){}
        Edges(int src,int nbr,int weight){
            this.src = src;
            this.nbr = nbr;
            this.weight = weight;
        }

        // this is used to display graph
        @Override
        public String toString() {
            return "Edges{" +
                    "src=" + src +
                    ", nbr=" + nbr +
                    ", weight=" + weight +
                    '}';
        }
    }

    public static  void construct(){
        int N = 7; // no of nodes for graph
        ArrayList<Edges>[] graph = new ArrayList[N]; // List of Graph
        for(int i=0; i<N;i++){
            graph[i] = new ArrayList<>(); // creating black list for storing information at each node
        }

        addEdges(graph,0,1,10); // src , nbr, weight
        addEdges(graph,0,3,10);
        addEdges(graph,1,2,10);
        addEdges(graph,2,3,40);
        addEdges(graph,3,4,2);
        addEdges(graph,4,5,2);
        addEdges(graph,5,6,3);
        addEdges(graph,4,6,8);

        //display(graph);
        display_otherMethod(graph,N);
    }

    private static void display_otherMethod(ArrayList<Edges>[] graph, int N) {

        for(int v=0; v < N; v++){
            for(Edges e : graph[v])
            {
                System.out.println(e);
            }
            System.out.println();
        }
    }

    public static void addEdges(ArrayList<Edges>[] graph, int u, int v, int w) {
        // undirected graph so path 1 0 is also 0 1
        graph[u].add(new Edges(u,v,w));
        graph[v].add(new Edges(v,u,w));
    }

    public static void display(ArrayList<Edges>[] graph){
        for(ArrayList<Edges> a : graph){
            System.out.println(a);

        }
    }

    public static void main(String[] args) {
        construct();

    }
}
