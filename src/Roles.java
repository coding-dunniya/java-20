import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// retention policy
@Retention(RetentionPolicy.RUNTIME)
public @interface Roles {

    String value();

    int abc();
}
