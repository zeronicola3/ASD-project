import java.util.Scanner;

public class Progetto {

    public static void algoritmo(String str){
    
        Integer m = 0;
        Integer M = 0;
        BST tree = new BST();

        int string_length = str.length();
        Character[] input = new Character[string_length];
        Hashtable hash = new Hashtable(26);

        for (int i = 0; i < string_length; i++) {
            input[i] = str.charAt(i);
            tree.add(input[i]);
            hash.put(input[i] % 97);
        }

        M = hash.getMax();
        m = hash.getMin(M);

        Graph g = BST2Graph.transform(tree, M, m);

        System.out.println(g.get_vertex_number() + " " + g.get_edges_number());
    }
}