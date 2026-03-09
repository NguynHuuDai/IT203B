package bt4;

import java.util.*;
import java.util.function.*;


public class bt4 {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("An"));
        users.add(new User("Binh"));
        users.add(new User("Cuong"));

        Function<User, String> getName = User::getUsername;

        Consumer<String> print = System.out::println;

        Supplier<User> createUser = User::new;

        users.stream()
                .map(getName)
                .forEach(print);

        User newUser = createUser.get();
        System.out.println(newUser.getUsername());
    }
}