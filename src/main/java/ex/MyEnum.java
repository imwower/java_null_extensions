package ex;

import lombok.Getter;

public enum MyEnum implements IEnum {
    FIRST(1, "first"),
    SECOND(2, "second"),
    ;

    @Getter
    private Integer value;
    @Getter
    private String name;

    MyEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }
}
