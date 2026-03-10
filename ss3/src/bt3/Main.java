package bt3;

public class Main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        var userOpt = repo.findUserByUsername("alice");

        userOpt.ifPresent(user ->
                System.out.println("Welcome " + user.username())
        );

        String result = userOpt
                .map(user -> "Welcome " + user.username())
                .orElse("Guest login");

        System.out.println(result);
    }
}