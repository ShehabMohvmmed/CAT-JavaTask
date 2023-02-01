public class Validation {
    public static boolean validateEmail(String emailAddress){
        Result result = new Result();
        String email_regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        boolean matches = emailAddress.matches(email_regex);
        if (emailAddress != null && matches) {
            result.setValid(true);
            result.setMessage("Valid email");
        }else {
            result.setValid(false);
            result.setMessage("InValid email");
        }
        System.out.println(result.getMessage());
        return result.isValid();
    }

    public static boolean validatePassword(String password){
        Result result = new Result();
        String password_regex = "^(?=.*[a-z])(?=.*[A-Z])" + "(?=\\S+$).{8,20}$";
        boolean matches = password.matches(password_regex);
        if (password != null && matches) {
            result.setValid(true);
            result.setMessage("Valid password");
        }else {
            result.setValid(false);
            result.setMessage("InValid password");
        }
        System.out.println(result.getMessage());
        return result.isValid();
    }

    static void validateUserInformation(String email, String password) {
        boolean isEmailValid = Validation.validateEmail(email);
        boolean isPasswordValid = Validation.validatePassword(password);

        if(isEmailValid && isPasswordValid) {
            System.out.println("Signed Up");
        }else {
            System.out.println("Failed signing in");
        }

    }

}
