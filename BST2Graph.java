import java.util.ArrayList;
import java.util.Arrays;

public class BST2Graph {

    private Integer M;
    private Integer m;
    public Graph graph;

    public BST2Graph(Integer M, Integer m) {
        this.M = M;
        this.m = m;

        this.graph = new Graph();
    }

    public static Graph transform(BST tree, Integer M, Integer m){

        BST2Graph a = new BST2Graph(M, m);

        ArrayList<Character> leaves = tree.get_Leaves(tree.root, new ArrayList<Character>());
        
        a.populateGraph(tree, leaves);
        //a.graph.printGraph();
        return a.graph;
    }

    private void populateGraph(BST tree, ArrayList<Character> leaves){

        insertVertex(leaves);
        insertEdges(tree, leaves);
    }

    private void insertEdges(BST tree, ArrayList<Character> leaves){
        int dist;
        while(!leaves.isEmpty()){
            Character c = leaves.remove(0);
            for (Character c2 : leaves) {
                dist = tree.distance_between_nodes(c, c2);
                if((dist >= this.m) && (dist <= this.M)){
                    this.graph.addEdge(c, c2);
                }
            }

        }
    }

    private void insertVertex(ArrayList<Character> leaves){
        for (Character c : leaves) {
            this.graph.addVertex(c);
        }
    }


    private Integer getMax() {
        return this.M;
    }

    private Integer getMin() {
        return this.m;
    }

    
}