package creational;

import creational.objectpool.User;
import creational.objectpool.UserPool;
import org.junit.Test;

public class ObjectPoolPatternTest {

    /**
     * OUTPUT:
     * User{firstName='Hello2', lastName='World2', age=2}
     * User{firstName='Hello', lastName='World', age=1}
     */
    @Test
    public void objectPoolPattern() {
        UserPool userPool = new UserPool();
        User user = userPool.get();
        user.setFirstName("Hello");
        user.setLastName("World");
        user.setAge(1);

        User user2 = userPool.get();
        user2.setFirstName("Hello2");
        user2.setLastName("World2");
        user2.setAge(2);

        userPool.release(user2);
        userPool.release(user);

        User getUserFromPoolAgain = userPool.get();
        System.out.println(getUserFromPoolAgain.toString());

        User getUserFromPoolAgain2 = userPool.get();
        System.out.println(getUserFromPoolAgain2.toString());
    }
}
