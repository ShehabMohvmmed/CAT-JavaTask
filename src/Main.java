import java.util.Scanner;

public class Main {
    static String emailAddress;
    static String password;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your input address ex:xyz@gmail.com");
        emailAddress = input.nextLine();

        System.out.println("Please enter your input password ex:FF456gULHd");
        password = input.nextLine();

        Validation.validateUserInformation(emailAddress,password);

    }


}
