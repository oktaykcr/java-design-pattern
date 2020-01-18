package creational.objectpool;

public class UserPool extends ObjectPool<User> {

    public UserPool() {
        super(2);
    }

    @Override
    protected User create() {
        return new User();
    }
}
