import java.util.Iterator;
import java.util.LinkedList;

class Solution{
    static class Graph{
        private int vertices;
        // Declaring array of LinkedLists
        private LinkedList<Integer> adjacencyList[]; 
        // Constructor
        Graph(int numberOfVertices){
            vertices=numberOfVertices;
            // Initialisting the array with v linked lists
            adjacencyList=new LinkedList[vertices];
            for (int v=0;v<vertices;v++){
                // Initialising each linkedlists
                adjacencyList[v]=new LinkedList<Integer>();
            }
        }
        public static void addEdge(Graph graph, int source, int destination){
            graph.adjacencyList[source].add(destination);
            graph.adjacencyList[destination].add(source);
        }
        public static void BFS(Graph graph,int source){
            // Boolean array to mark the visited nodes
            boolean visited[]=new boolean[graph.vertices];
            // Queue to implement BFS
            LinkedList<Integer> queue=new LinkedList<Integer>();
            // Mark the current node as visited, and add the node to queue
            visited[source]=true;
            queue.add(source);
            while (queue.size()!=0){
                // Dequeue the queue and push next connected vertices
                int vertex=queue.poll();
                System.out.println(vertex+" ");
                Iterator<Integer> it=graph.adjacencyList[source].listIterator();
                while(it.hasNext()){
                    int nextVertex=it.next();
                    if(!visited[nextVertex]){
                        visited[nextVertex]=true;
                        queue.add(nextVertex);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(graph, 0, 1); 
        graph.addEdge(graph, 0, 2); 
        graph.addEdge(graph, 1, 2); 
        graph.addEdge(graph, 2, 0); 
        graph.addEdge(graph, 2, 3); 
        graph.addEdge(graph, 3, 3); 
        graph.BFS(graph,2);
    }
}