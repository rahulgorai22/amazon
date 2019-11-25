import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class Solution{
    static class Graph{
        private int vertices;
        private LinkedList<Integer> adjacencyListArray[];
        Graph(int numberOfVertices){
            vertices=numberOfVertices;
            adjacencyListArray=new LinkedList[vertices];
            for(int v=0;v<vertices;v++){
                adjacencyListArray[v]=new LinkedList<Integer>();
            }
        }
        public static void addEdge(Graph graph, int source,int destination){
            graph.adjacencyListArray[source].add(destination);
            graph.adjacencyListArray[destination].add(source);
        }
        public static void DFSUtil(Graph graph,int vertex, boolean visited[]){
            visited[vertex]=true;
            System.out.println(vertex);
            Iterator<Integer> it=graph.adjacencyListArray[vertex].listIterator();
            while(it.hasNext()){
                int n=it.next();
                if(!visited[n]){
                    DFSUtil(graph, n, visited);
                }
            }

        }
        public static void DFS(Graph graph){
            boolean visited[]=new boolean[graph.vertices];
            for (int i=0;i<graph.vertices;i++){
                if(visited[i]==false){
                    DFSUtil(graph,i, visited);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 3);
        graph.DFS(graph);
    }
}