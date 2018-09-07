public class Node {

    public char key;
    public Node left, right;

    public Node(char key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public void add(char key){

        if(key <= this.key){
            if(left == null){
                left = new Node(key);
            } else {
                left.add(key);
            }
        } else {
            if(right == null){
                right = new Node(key);
            } else {
                right.add(key);
            }
        }
    }


    // Funzione che dato un nodo restutuisce tre se è una foglia, false altrimenti
    public Boolean is_Leaf() {
        if ((this.left == null) && (this.right == null)) {
            return true;
        }
        return false;
    }
}