package bt1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bt1 {
    public static void main(String[] args) {

        User user = new User("admin01", "ADMIN");

        Predicate<User> isAdmin = u -> u.getRole().equals("ADMIN");

        Function<User, String> getUsername = u -> u.getUsername();

        Consumer<User> printUser = u -> System.out.println(u.getUsername());

        Supplier<User> createUser = () -> new User("default", "USER");

        System.out.println(isAdmin.test(user));

        System.out.println(getUsername.apply(user));

        printUser.accept(user);

        User newUser = createUser.get();
        System.out.println(newUser.getUsername());
    }
}
