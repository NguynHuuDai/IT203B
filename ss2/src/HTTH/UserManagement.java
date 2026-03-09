package HTTH;

import java.util.function.*;

public class UserManagement {

    Supplier<User> createUser = User::new;

    Predicate<User> isActive = u -> u.getStatus().equals("ACTIVE");

    Function<User, String> getEmail = User::getEmail;

}