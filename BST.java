public class BST {
    private Node root;

    // Funzione che aggiunge un carattere all'albero
    public void add(char key) {
        if (root == null) {
            root = new Node(key);
        } else {
            root.add(key);
        }
    }

    // Funzione che restituisce la distanza minima tra due caratteri nell'albero
    public Integer distance_between_nodes(char n1, char n2){
        Node source = find_LCA(n1, n2);
        return find_Distance(source, n1) + find_Distance(source, n2);
    }

    // Funzione che restituisce la distanza di un carattere da una data sorgente
    public Integer find_Distance(Node source, char n1){
        if(source == null){
            return null;
        }

        if(source.key > n1){
            return find_Distance(source.left, n1) + 1;
        } else if(source.key < n1){ 
            return find_Distance(source.right, n1) + 1;
        } else {
            return 0;
        }
    }

    // Funzione che trova "Last Common Ancestor" tra dine caratteri nell'albero
    public Node find_LCA(char n1, char n2){
        return find_LCA(root, n1, n2);
    }

    public Node find_LCA(Node current_ancestor, char n1, char n2){
        
        // CASI BASE 
        if(n1 == n2){
            return null;
        }
        // SE current_ancestor è nullo
        if(current_ancestor == null){
            return null;
        }
        
        // SE n1 e n2 sono entrambi minori di current_ancestor, 
        // allora controllo il sotto-albero sinistro radicato in current_ancestor
        if((current_ancestor.key > n1) && (current_ancestor.key > n2)){
            return find_LCA(current_ancestor.left, n1, n2);
        }
        
        // SE n1 o n2 sono uguali a current_ancestor,
        if(((current_ancestor.key > n1) && (current_ancestor.key == n2)) ||
           ((current_ancestor.key == n1) && (current_ancestor.key > n2))) {
            // SE il figlio sinistro di current_ancestor è minore di current_ancestor,
            // allora current_ancestor è LCA
            if(current_ancestor.left.key < current_ancestor.key){
                return current_ancestor;
            // altrimenti, controllo il sotto-albero sinistro radicato in current_ancestor
            } else {
                return find_LCA(current_ancestor.left, n1, n2);
            }
        }

        // SE n1 e n2 sono entrambi maggiori di current_ancestor, 
        // allora controllo il sotto-albero destro radicato in current_ancestor
        if ((current_ancestor.key < n1) && (current_ancestor.key < n2)) {
            return find_LCA(current_ancestor.right, n1, n2);
        }
        // SE current_ancestor è > di uno solo tra n1 o n2,
        // allora current_ancestor è LCA
        return current_ancestor;
    }

    public static void main(String[] args) {
        BST a = new BST();

        a.add('a');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('g');
        a.add('e');

        System.out.println(a.distance_between_nodes('g', 'e'));
    }
}   