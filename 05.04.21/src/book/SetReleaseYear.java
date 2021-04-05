package book;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(value = ElementType.FIELD)
@Retention(RUNTIME)
public @interface SetReleaseYear {
    int year() default 2000;
}
