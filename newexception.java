import java.util.*;
 class password_validation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter password: ");
        String a= sc.nextLine();

        boolean validPassword = ValidPassword("Enter");
        System.out.println("valid password:" +validPassword);

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter password: ");
        String b= scan.nextLine();

        boolean validPassword1 = ValidPassword(b);
        System.out.println("valid password:" +validPassword1);
    }

    public static boolean ValidPassword(String password)
    {
        boolean isValid = true;

        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%,&,!].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have at least one special character among @#$%&");
            isValid = false;
        }
        return isValid;
    }
}