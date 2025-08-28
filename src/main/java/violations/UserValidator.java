package violations;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateUser(User user) {
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            return false;
        }
        if (user.getEmail() == null || !isValidEmail(user.getEmail())) {
            return false;
        }
        String userType = user.getUserType();
        return userType != null && (userType.equals("PREMIUM")
                || userType.equals("REGULAR") || userType.equals("VIP"));
    }

    private boolean isValidEmail(String email) {
        return Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$").matcher(email).matches();
    }
}