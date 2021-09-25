import java.util.Scanner;

public class ex27
{
    static String info = "";

    public static void main(String[] args)
    {

        Scanner reader = new Scanner (System.in );
        System.out.print("Enter the first name: ");
        String first_name = reader.nextLine();

        System.out.print("Enter the last name: ");
        String last_name = reader.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip_code= reader.nextLine();

        System.out.print("Enter the employee ID: ");
        String emp_id =reader.nextLine () ;

        validinput( first_name , last_name , zip_code , emp_id );
    }

    public static void validinput(String first_name , String last_name , String zip_code , String emp_id )
    {
        boolean firstname = first_name_valid( first_name );
        boolean lastname = valid_last_name ( last_name );
    }

    public static boolean first_name_valid (String firstName)
    {
        boolean status=true;

        //this is to check if the length of input is less than 2 char.
        if (firstName.length() < 2)
        {
            info = info + "The first name must be at least 2 characters long.\n";
            status = false;
        }
        if (firstName.length() == 0)
        {
            info = info + "The first name must be filled in.\n";
            status = false;
        }
        return status;
    }

    public static boolean valid_last_name (String lastName)
    {
        boolean status = true;
        if (lastName.length() < 2)
        {
            info = info + "The last name must be at least 2 characters long.\n";
            status = false;
        }
        if (lastName.length() == 0)
        {
            System.out.println("The last name must be filled in.");
            status = false;
        }
        return status;
    }

}