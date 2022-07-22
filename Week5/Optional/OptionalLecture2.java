import java.util.Optional;

public class OptionalLecture2 {
    public static void main(String[] args) {
        // Best practices
        // Check out the interfaces and implement them
    }
}

interface BadInterface {
    void messageUser(Optional<User> user);
    User getUserById(Long id);
}

interface GoodInterface {
    void messageUser(User user);
    Optional<User> getUserById(Long id);
}

// Let's implement these to see why one is good and one is bad.

class User {
    private Long id;

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    
}