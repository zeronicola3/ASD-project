class Parser{

    public Parser(){
    }

    public Character[] get_chars_array(String src){

        int string_length = src.length();
        Character[] input = new Character[string_length];

        for (int i = 0; i < string_length; i++) {
            input[i] = src.charAt(i);
        }

        return input;
    }

    public static void main(String[] args) {
        Parser a = new Parser();

        for (char carattere : a.get_chars_array("aiuole")) {
            System.out.println(carattere);
        }
    }

}