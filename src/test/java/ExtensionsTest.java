import ex.Extensions;
import ex.User;
import lombok.experimental.ExtensionMethod;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

@ExtensionMethod(Extensions.class)
public class ExtensionsTest {

    @Test
    public void setIfNotNull_ok() {
        User user1 = new User();
        User user2 = new User();

        Extensions.setIfNotNull(user1.getId(), user2::setId);

        Assertions.assertNull(user2.getId());

        user1.setId(1);
        Extensions.setIfNotNull(user1.getId(), user2::setId);

        Assertions.assertNotNull(user2.getId());
        Assertions.assertEquals(1, user2.getId());

        user1.setId(11);
        user2.setIfNotNull(user1.getId(), user2::setId);

        Assertions.assertEquals(11, user2.getId());
    }


}