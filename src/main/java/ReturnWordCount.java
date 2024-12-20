
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int word= 0;
        
        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
            String str = String.valueOf(c);
            if (str.contains(" ")){
                word++;
            }
            System.out.println(c);
        }
        return word+1;
    }
}
