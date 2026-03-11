package btth;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    // yêu cầu 1: thêm mới
    public void addUser( User user ) {
        if(user.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username cannot be null");
        }
        users.add(user);
    }

    // yêu cầu 2: tìm kiếm
    public User findUserById(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // yêu cầu 3: kiểm tra email
    public boolean isValidEmail(String email) {
        String regexEmail = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}";
        return email.matches(regexEmail);
    }
}