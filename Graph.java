import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph {
    
    public List<List<Integer>> adjList;
    public List<Character> labels;

    public Graph(){
        this.adjList = new ArrayList<List<Integer>>();
        this.labels = new ArrayList<Character>();
    }

    public void addVertex(Character label){
        adjList.add(new ArrayList<Integer>());
        labels.add(label);
    }

    public void addEdge(int i, int j) {
        this.adjList.get(i).add(j);
        this.adjList.get(j).add(i);
    }

    public int countVertexNumber() {
        return this.adjList.size();
    }

    public void printGraph() {
        for (int i = 0; i < this.adjList.size(); i++) {
            System.out.println("Number " + i + ":" + this.adjList.get(i) + " " + this.labels.get(i));
        }
    }

    public int get_edges_number(){
        int sum = 0;
        for (int i = 0; i < this.adjList.size(); i++) {
            sum = sum + this.adjList.get(i).size();
        }
        return sum/2;
    }

    public int get_vertex_number(){
        return this.labels.size();
    }

    public String toString() {
        return "Graph:" + this.adjList;
    }
    
    public static void main(String[] args) {
        Graph a = new Graph();

        a.addVertex('c');
        a.addVertex('a');
        a.addVertex('a');
        a.addVertex('o');

        a.addEdge(2, 0);
        a.addEdge(2, 1);
        a.addEdge(2, 3);
        //a.addEdge(3, 1);

        a.printGraph();

    }
}