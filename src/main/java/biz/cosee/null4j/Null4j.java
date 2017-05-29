package biz.cosee.null4j;

import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Function;


/**
 * Convenience functions for dealing with null.
 * <p>
 * Created by Michael Zinn (@RedNifre), cosee GmbH on 30/03/17.
 */
@NotNullByDefault
public class Null4j {

    /**
     * Threadsafe way to get a fallback for a nullable reference.
     *
     * @param nullable     Nullable value
     * @param defaultValue Must not be null
     * @param <T>
     * @return the first parameter that is not null.
     */
    public static <T> T orDefault(@Nullable T nullable, T defaultValue) {
        return (nullable != null) ? nullable : defaultValue;
    }

    /**
     * Threadsafe way to get a fallback for a nullable reference.
     *
     * @param nullable1    Nullable value
     * @param nullable2    Nullable value
     * @param defaultValue Must not be null
     * @param <T>
     * @return the first parameter that is not null.
     */
    public static <T> T orDefault(@Nullable T nullable1, @Nullable T nullable2, T defaultValue) {
        return
                nullable1 != null ? nullable1 :
                nullable2 != null ? nullable2 :
                defaultValue;
    }

    /**
     * Like map or flatMap, but for nullable types.
     */
    @Nullable
    public static <T, U> U let(@Nullable T nullable, Function<T, @Nullable U> f) {
        return (nullable != null) ? f.apply(nullable) : null;
    }

    /**
     * Like map or flatMap, but for nullable types.
     */
    public static <T> void let(@Nullable T nullable, Consumer<T> f) {
        if (nullable != null) f.accept(nullable);
    }

    /**
     * Fluent version that works as a safe navigation operator
     */
    @Nullable
    public static <T, U, V> V let(@Nullable T nullable, Function<T, @Nullable U> f1, Function<U, @Nullable V> f2) {
        if(nullable == null) return null;
        @Nullable U u = f1.apply(nullable);
        if(u == null) return null;
        return f2.apply(u);
    }

    /**
     * Fluent version that works as a safe navigation operator
     */
    public static <T, U> void let(@Nullable T nullable, Function<T, @Nullable U> f1, Consumer<U> f2) {
        if(nullable == null) return;
        @Nullable U u = f1.apply(nullable);
        if(u != null) f2.accept(u);
    }

    // TODO generate versions of this for up to 7 parameters.

}
