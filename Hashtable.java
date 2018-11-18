public class Hashtable {

    private int [] table;
    private int length = 0;

    public Hashtable(int length) {
        table = new int[length];
        this.length = length;
    }

    public int get(int key) {
        return table[key];
    }

    public int getMax(){
        int max = 0;
        for(int i = 0; i < this.length; i++) {
            if(table[i] > max){
                max = table[i];
            }
        }

        return max;
    }

    public int getMin(int max) {
        int min = max;
        for (int i = 0; i < this.length; i++) {
            if(table[i] > 0){
                if (table[i] < min) {
                    min = table[i];
                }
            }
        }

        return min;
    }

    public void put(int key) {
        table[key]++;
    }

    public void remove(int key) {
        table[key] = 0;
    }

    public int length() {
        return table.length;
    }
}