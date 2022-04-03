package ex;

import lombok.NonNull;

import java.util.function.Consumer;

public class Extensions {
    /**
     * set value if not null
     *
     * @param value
     * @param setter
     * @param <T>
     */
    public static <T> void setIfNotNull(final T value, Consumer<T> setter) {
        if (value != null) {
            setter.accept(value);
        }
    }

    public static void setIfNotNull(final Double value, Consumer<Long> setter) {
        if (value != null) {
            setter.accept(value.longValue());
        }
    }

    /**
     * set default value if value is null
     *
     * @param value
     * @param defaultValue
     * @param setter
     * @param <T>
     */
    public static <T> void setDefault(T value, final T defaultValue, Consumer<T> setter) {
        if (value == null) {
            setter.accept(defaultValue);
        } else {
            setter.accept(value);
        }
    }

    /**
     * extension method for set value if not null
     *
     * @param object
     * @param value
     * @param setter
     * @param <T>
     */
    public static <T> void setIfNotNull(@NonNull final Object object, final T value, Consumer<T> setter) {
        if (value != null) {
            setter.accept(value);
        }
    }

    /**
     * set enum value
     *
     * @param enumObj
     * @param setter
     */
    public static void setEnumValue(final IEnum enumObj, Consumer<Integer> setter) {
        if (enumObj != null) {
            setter.accept(enumObj.getValue());
        }
    }

    /**
     * set enum name
     *
     * @param enumObj
     * @param setter
     */
    public static void setEnumName(final IEnum enumObj, Consumer<String> setter) {
        if (enumObj != null) {
            setter.accept(enumObj.getName());
        }
    }
}
