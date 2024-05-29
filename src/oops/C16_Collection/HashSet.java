package oops.C16_Collection;

// HashSet class creates to store and manipulate group of Object
public class HashSet
{
    Employee[] emps = new Employee[0]  ;

//    Check Object for duplicate
    private boolean isUnique(Employee e)
    {
        for( int i = 0 ; i < emps.length ; i++ )
        {
            Employee emp = emps[i] ;
            if( emp.id == e.id && emp.name.equals(e.name) && emp.sal == e.sal )
            {
                return false ;
            }
        }
        return  true ;
    }
    //     AddEmployee method will receive Employee Object and store in Array
    public void addEmployee(Employee e)
    {

        if( isUnique(e) )
        {
            Employee[] temp = new Employee[ emps.length + 1 ];
            for( int i =0 ; i < emps.length ; i++ )
            {
                temp[i] = emps[i] ;
            }
            temp[ temp.length-1 ] = e ;
            emps = temp ;
            System.out.println("Employee with Id "+ e.id + " is added to Database");
            System.out.println("=================================================");
        }
        else
        {
            System.out.println("Employee with Id "+ e.id + " is already available in Database");
            System.out.println("=================================================");
        }

    }
    //    ListOfEmployee method will display all the employees
    public  void listOfEmployee()
    {
        System.out.println("List of Employees in Database");
        System.out.println("=============================");
        for( int i = 0; i < emps.length ; i++ )
        {
            System.out.println( emps[i] );
        }
        System.out.println("=============================");
    }
    //    DeleteEDmployee Method will receive employee id and delete that employee from array
    public  void deleteEmployee(int id)
    {
        Employee[] temp = new Employee[ emps.length-1 ];

        for(int i=0 , j =0 ; i < emps.length ; i++ )
        {
            if( emps[i].id != id)
            {
                temp[j] = emps[i] ;
                j++ ;
            }
        }

        emps = temp ;
        System.out.println("Employee with Id "+ id + " is Deleted from database");
        System.out.println("===================================================");
    }
}