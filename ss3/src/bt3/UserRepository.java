package bt3;

import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = List.of(
            new User("alice", "alice@gmail.com"),
            new User("bob", "bob@yahoo.com"),
            new User("charlie", "charlie@gmail.com")
    );

    public Optional<User> findUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.username().equals(username))
                .findFirst();
    }
}
