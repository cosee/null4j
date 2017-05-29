package biz.cosee.null4j;


import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Makes nearly everything NotNull by default.
 * Can be added to classes and packages.
 * Does not apply recursively, i.e. you can't just annotate your root package.
 * <p>
 * Created by Michael Zinn (@RedNifre), cosee GmbH on 04/04/17.
 */
@Documented
@Nonnull
@TypeQualifierDefault({ElementType.TYPE, ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE, ElementType.TYPE})
public @interface NotNullByDefault {
}
