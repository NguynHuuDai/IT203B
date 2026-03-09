package HTTH;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        UserManagement um = new UserManagement();

        User u = um.createUser.get();

        String username = "adminUser";
        System.out.println(IUserAccount.isStandardLength(username));

        List<User> users = new ArrayList<>();

        users.add(new User("admin01","admin@mail.com","ADMIN","ACTIVE"));
        users.add(new User("user01","user@mail.com","USER","ACTIVE"));
        users.add(new User("guest01","guest@mail.com","USER","INACTIVE"));
        users.add(new User("mod01","mod@mail.com","MOD","ACTIVE"));

        System.out.println(um.getEmail.apply(users.get(0)));

        users.forEach(System.out::println);
    }
}