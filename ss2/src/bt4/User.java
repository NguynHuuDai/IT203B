package bt4;

class User {
    private String username;

    User() {
        username = "defaultUser";
    }

    User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
