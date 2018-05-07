public class Alphabet{

    private int[] alphabet = new int[26];

    public Alphabet(){}

    public void add(char carattere){
        int index = get_char_index(carattere);

        this.alphabet[index]++;
    } 

    private int get_char_index(char carattere){
        int indice_carattere = (int) carattere;

        if((indice_carattere >= 97) && (indice_carattere < 123)) {
            return indice_carattere % 97;
        } 

        return -1;
    }

    public int get_min(){
        int min = this.alphabet[0];
        for (int item : this.alphabet) {
            if(min > item){
                min = item;
            }
        }
        return min;
    }


    public int get_max() {
        int max = 0;
        for (int item : this.alphabet) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }
}