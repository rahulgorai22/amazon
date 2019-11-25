class Solution{
    static class Graph{
        private boolean adjacencyMatrix[][];
        public int vertices;
        public Graph(int numberOfVertices){
            this.vertices=numberOfVertices;
            adjacencyMatrix=new boolean[numberOfVertices][numberOfVertices];
        }
    }
    public static void addEdge(Graph graph, int source,int destination){
        graph.adjacencyMatrix[source][destination]=true;
        graph.adjacencyMatrix[destination][source]=true;
    }
    public static void removeEdge(Graph graph, int source, int destination){
        graph.adjacencyMatrix[source][destination]=false;
        graph.adjacencyMatrix[destination][source]=false;
    }
    public static boolean isEdgePresent(Graph graph,int source, int destination){
        return graph.adjacencyMatrix[source][destination];
    }
    public static void printGraph(Graph graph){
        for (int i=0;i<graph.vertices;i++){
            for (int j=0;j<graph.vertices;j++){
                System.out.print(graph.adjacencyMatrix[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4);
        printGraph(graph); 
    }
}