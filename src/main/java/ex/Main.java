package ex;

import lombok.experimental.ExtensionMethod;

import java.util.Optional;

@ExtensionMethod({Extensions.class})
public class Main {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();

        //use static method:
        Extensions.setIfNotNull(user1.getId(), user2::setId);

        //user1 extension method:
        user1.setIfNotNull(user1.getId(), user2::setId);

        //check whether user1 is null:
        Optional.of(user1)
                .ifPresent(u ->
                        Extensions.setIfNotNull(u.getId(), user2::setId));

        //enum:
        MyEnum myEnum = MyEnum.FIRST;
        Extensions.setEnumValue(myEnum, user2::setMyEnumValue);
        Extensions.setEnumName(myEnum, user2::setMyEnumName);

        //set default value if value is null:
        Extensions.setDefault(user1.getId(), 2, user2::setId);
    }
}
