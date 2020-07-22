import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface MethodInfo {
    String name();
    int dateOfCreation();
    String purpose();
}
