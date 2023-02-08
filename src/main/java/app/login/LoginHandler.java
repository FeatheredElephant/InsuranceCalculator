package app.login;

import app.model.domains.User;

import java.util.ArrayList;
import java.util.List;

public class LoginHandler {
    private static List<User> loginSystem = new ArrayList();
    public static boolean login(String email, String password) {
        for (int i = 0; i < loginSystem.size(); i++) {
            if (email.equals(loginSystem.get(i).getEmail()) &&
                    password.equals(loginSystem.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public static void register(int userId, String email, String password, String name) {
        User user = new User(userId, email, password, name);
        loginSystem.add(user);
    }
}
