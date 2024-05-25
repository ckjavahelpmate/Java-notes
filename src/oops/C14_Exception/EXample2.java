package oops.C14_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EXample2
{

    public static void demo() throws FileNotFoundException , IOException
    {
        String path = "C:\\Users\\10759782\\Reada Data\\Demo.txt"; // FileNotFoundException
        FileInputStream fin = new FileInputStream(path);
        while (fin.available() != 0)
        {
            System.out.print( (char) fin.read() );
        }
    }
}

/*
==>we can declare checked Exceptions instead of handling using throws keyword.
==> throws keyword must be used with method declaration
==> using throws we declare multiple exception separated by ,
 */