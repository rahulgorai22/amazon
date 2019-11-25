import java.util.LinkedList;

class Solution{
    static class Graph{
        public int vertex;
        // Array of linkedlists
        LinkedList<Integer> adjacencyListArray[];
        // Constructor
        Graph(int vertex){
            this.vertex=vertex;
            adjacencyListArray=new LinkedList[vertex];
            for (int i=0;i<vertex;i++){
                adjacencyListArray[i]=new LinkedList<>();
            }
        }
    }
    public static void addEdge(Graph graph,int source,int destination){
        graph.adjacencyListArray[source].add(destination);
        graph.adjacencyListArray[destination].add(source);
    }
    public static void printGraph(Graph graph){
        for (int v=0;v<graph.vertex;v++){
            System.out.print("head");
            for (Integer vertices:graph.adjacencyListArray[v]){
                System.out.print("->"+vertices);
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        int v=5;
        Graph graph=new Graph(v);
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
    }
}