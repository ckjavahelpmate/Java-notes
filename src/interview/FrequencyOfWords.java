package interview;

import java.util.HashMap;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String str = "This is my house and my house is blue in color";

        String[] words = str.split(" ");
        HashMap<String, Integer> fq = new HashMap<>();
        for( String word : words )
        {
            if( fq.containsKey( word ))
            {
                fq.put( word , fq.get(word) + 1 ) ;
            }
            else
            {
                fq.put( word , 1) ;
            }
        }
        System.out.println( fq );
    }
}
