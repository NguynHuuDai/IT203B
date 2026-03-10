package btth;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    public List<User> getVerifiedUsers(List<User> users) {
        return users.stream()
                .filter(User::isVerified)
                .collect(Collectors.toList());
    }

    public Tier classifyTier(long months) {

        return switch ((int) (months > 24 ? 2 : months > 12 ? 1 : 0)) {
            case 2 -> new Gold();
            case 1 -> new Silver();
            default -> new Bronze();
        };
    }
}
