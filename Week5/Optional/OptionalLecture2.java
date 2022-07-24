import java.util.Optional;

public class OptionalLecture2 {
    public static void main(String[] args) {
        // Best practices
        // Check out the interfaces and implement them
        GoodInterface good = new GoodInterfaceImpl();
        Optional<User> userMaybe = good.getUserById(100L);
        userMaybe.ifPresent(user -> {
            // do something to user
        });
    }
}

interface BadInterface {
    void messageUser(Optional<User> user);
    User getUserById(Long id);
}

class BadInterfaceImpl implements BadInterface {

    @Override
    public void messageUser(Optional<User> user) {
        if(user == null) {

        }
        else {
            
        }

        
    }

    @Override
    public User getUserById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}

interface GoodInterface {
    void messageUser(User user);
    Optional<User> getUserById(Long id);
}

class GoodInterfaceImpl implements GoodInterface {

    @Override
    public void messageUser(User user) {
        user = Optional.ofNullable(user).orElseThrow(() -> new IllegalArgumentException());
        
    }

    @Override
    public Optional<User> getUserById(Long id) {
        // This is telling the developers using your code, "HEY! This method's returned value might be empty!"
        // "PLEASE PLEASE PLEASE be prepared for an empty optional"
        // "You can use the ifPresent or orElse or orElseThrow or whatever makes sense in your application"
        return Optional.empty();
    }

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