package interview;

// String str = "My name is chethan";

public class Q1
{

    public static void main(String[] args)
    {
        String str = "My name is chethan";  // chethan is name MY

        String[] words = str.split(" ");
        for( int i = 0, j = words.length-1 ; i < j ; i++ ,j--)
        {
            String temp  = words[i] ;
            words[i] = words[j] ;
            words[j] = temp ;
        }

        String rev = String.join(" ", words);
        System.out.println( rev) ;
    }
}
