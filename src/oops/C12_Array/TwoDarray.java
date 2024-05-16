package oops.C12_Array;

public class TwoDarray
{
    public static void main(String[] args)
    {
        int v1 = 10 , v2 = 20 , v3 = 30 ;
        int[] values = { v1 , v2, v3 };

        int age1 = 25 , age2 = 24, age3 = 19 ;
        int[] ages = { age1 , age2, age3 } ;

//        Array inside array is multi dimensional array
        int[][]  valuesAndAges = { values , ages } ;

        System.out.println( valuesAndAges[0][1] ); //20
        System.out.println( valuesAndAges[1][2]); //19



        double price1 = 250, price2 = 435, price3 =55 ;
        double[] prices = { price1, price2 , price3 };

        double marks1 = 87.5 , marks2 = 92.8 , marks3 = 38.6 ;
        double[] marks = { marks1 , marks2, marks3 };

        double[][] pricesAndMarks = { prices , marks };

        System.out.println( pricesAndMarks[0][0] ); // 250
        System.out.println( pricesAndMarks[1][1] ); // 92.8


        String[] row0 = { "SN" , "id", "name" } ;
        String[] row1 = { "01" , "101", "Sheela" } ;
        String[] row2 = { "02" , "102", "Leela" } ;
        String[] row3 = { "03" , "103", "Mala" } ;
        String[] row4 = { "04" , "104", "Urmila" } ;

        String[][] excelData = { row0 , row1, row2 , row3 , row4 } ;

        System.out.println(  excelData[2][1] ) ;
        System.out.println("===================");

        getData(excelData , "id" , "SN");



    }
    public static void getData( String[][] excelData, String key , String property )
    {
        int keycolIndex = 0 ;
        int propertyColIndex = 0 ;
        int colCount = excelData[0].length ;
        for( int j = 0 ;  j < colCount ; j++ )
        {
            if( excelData[0][j] == key )
            {
                keycolIndex = j ;
            }
            if( excelData[0][j] == property)
            {
                propertyColIndex = j ;
            }
        }
        int keyRowIndex = 0 ;
        int rowCount = excelData.length ;
        for (int i = 0 ; i < rowCount ; i++ )
        {
            if( excelData[i][keycolIndex] == key )
            {
                keyRowIndex = i ;
            }
        }

        System.out.println( excelData[keyRowIndex][propertyColIndex]);
    }
}
