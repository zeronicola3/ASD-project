public class Node {

    public char key;
    public Node left, right;

    public Node(char key){
        this.key = key;
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
}