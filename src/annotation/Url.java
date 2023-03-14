package annotation;

import java.lang.annotation.*;
/**
 *
 * @author rado
 */
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)
@Target(ElementType.METHOD)
public @interface Url{
    String path() default "url obligatoire";
}
