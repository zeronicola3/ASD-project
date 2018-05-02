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

        a.printGraph();
    }
}