public class BST {
    private Node root;

    public void add(char key) {
        if (root == null) {
            root = new Node(key);
        } else {
            root.add(key);
        }
    }

    public Node find_LCA(char n1, char n2){
        return find_LCA(root, n1, n2);
    }

    public Node find_LCA(Node current_ancestor, char n1, char n2){

        // SE current_ancestor è nullo
        if(current_ancestor == null){
            return null;
        }
        // SE n1 o n2 sono uguali a current_ancestor, allora current_ancestor e' il LCA 
        if((current_ancestor.key == n1) || (current_ancestor.key == n2)){
            return current_ancestor;
        }
        // SE n1 e n2 sono entrambi minori di current_ancestor, 
        // allora controllo il sotto-albero sinistro radicato in current_ancestor
        if((current_ancestor.key > n1) && (current_ancestor.key > n2)){
            return find_LCA(current_ancestor.left, n1, n2);
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
}   