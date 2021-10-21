package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() > 7 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int indexOfAt = email.indexOf("@");
        String substringFromAt = email.substring(indexOfAt + 1);
        int indexOfDot = substringFromAt.indexOf(".");
        return indexOfAt > 0 && indexOfDot > 0 && indexOfDot < substringFromAt.length() - 1;
    }
}
