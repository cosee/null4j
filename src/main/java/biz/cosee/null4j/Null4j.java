package biz.cosee.null4j;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


/**
 * Convenience functions for dealing with null.
 * <p>
 * Created by Michael Zinn (@RedNifre), cosee GmbH on 30/03/17.
 */
public class Null4j {

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                nullable5 != null ? nullable5 :
                                                        defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                nullable5 != null ? nullable5 :
                                                        nullable6 != null ? nullable6 :
                                                                defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                nullable5 != null ? nullable5 :
                                                        nullable6 != null ? nullable6 :
                                                                nullable7 != null ? nullable7 :
                                                                        defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @Nullable T nullable8,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                nullable5 != null ? nullable5 :
                                                        nullable6 != null ? nullable6 :
                                                                nullable7 != null ? nullable7 :
                                                                        nullable8 != null ? nullable8 :
                                                                                defaultValue;
    }

    /**
     * Returns the first parameter that is not null.
     *
     * The last parameter must not be null.
     *
     * @param nullables
     * @param defaultValue Must not be null.
     * @return First parameter that is not null
     */
    public static <T>
    @NotNull T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @Nullable T nullable8,
            @Nullable T nullable9,
            @NotNull T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                        nullable2 != null ? nullable2 :
                                nullable3 != null ? nullable3 :
                                        nullable4 != null ? nullable4 :
                                                nullable5 != null ? nullable5 :
                                                        nullable6 != null ? nullable6 :
                                                                nullable7 != null ? nullable7 :
                                                                        nullable8 != null ? nullable8 :
                                                                                nullable9 != null ? nullable9 :
                                                                                        defaultValue;
    }



    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U>
    @Nullable U let(
            @Nullable T t,
            Function<? super T, U> f_T_U
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        return f_T_U.apply(nn_t);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V>
    @Nullable V let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        return f_U_V.apply(nn_u);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W>
    @Nullable W let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        return f_V_W.apply(nn_v);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X>
    @Nullable X let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        return f_W_X.apply(nn_w);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y>
    @Nullable Y let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return null;
        @NotNull X nn_x = surely(x);
        return f_X_Y.apply(nn_x);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z>
    @Nullable Z let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return null;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return null;
        @NotNull Y nn_y = surely(y);
        return f_Y_Z.apply(nn_y);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z, A>
    @Nullable A let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Function<? super Z, A> f_Z_A
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return null;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return null;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return null;
        @NotNull Z nn_z = surely(z);
        return f_Z_A.apply(nn_z);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z, A, B>
    @Nullable B let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Function<? super Z, A> f_Z_A,
            Function<? super A, B> f_A_B
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return null;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return null;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return null;
        @NotNull Z nn_z = surely(z);
        @Nullable A a = f_Z_A.apply(nn_z);
        if(a == null) return null;
        @NotNull A nn_a = surely(a);
        return f_A_B.apply(nn_a);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z, A, B, C>
    @Nullable C let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Function<? super Z, A> f_Z_A,
            Function<? super A, B> f_A_B,
            Function<? super B, C> f_B_C
    ) {
        if(t == null) return null;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return null;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return null;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return null;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return null;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return null;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return null;
        @NotNull Z nn_z = surely(z);
        @Nullable A a = f_Z_A.apply(nn_z);
        if(a == null) return null;
        @NotNull A nn_a = surely(a);
        @Nullable B b = f_A_B.apply(nn_a);
        if(b == null) return null;
        @NotNull B nn_b = surely(b);
        return f_B_C.apply(nn_b);
    }



    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T>
    void let(
            @Nullable T t,
            Consumer<? super T> c_T
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        c_T.accept(nn_t);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Consumer<? super U> c_U
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        c_U.accept(nn_u);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Consumer<? super V> c_V
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        c_V.accept(nn_v);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Consumer<? super W> c_W
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        c_W.accept(nn_w);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Consumer<? super X> c_X
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return;
        @NotNull X nn_x = surely(x);
        c_X.accept(nn_x);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Consumer<? super Y> c_Y
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return;
        @NotNull Y nn_y = surely(y);
        c_Y.accept(nn_y);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Consumer<? super Z> c_Z
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return;
        @NotNull Z nn_z = surely(z);
        c_Z.accept(nn_z);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z, A>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Function<? super Z, A> f_Z_A,
            Consumer<? super A> c_A
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return;
        @NotNull Z nn_z = surely(z);
        @Nullable A a = f_Z_A.apply(nn_z);
        if(a == null) return;
        @NotNull A nn_a = surely(a);
        c_A.accept(nn_a);
    }

    /**
     * Threads the first parameter through the following function parameters.
     *
     * Aborts and returns null when any step in the sequence returns null, otherwise it returns the result of the last function or void if the last parameter is a Consumer.
     *
     * @param t Input value, may be null.
     * @param fs A typed sequence of functions.
     * @return Result or null if the last parameter is a function, otherwise void
     */
    public static <T, U, V, W, X, Y, Z, A, B>
    void let(
            @Nullable T t,
            Function<? super T, U> f_T_U,
            Function<? super U, V> f_U_V,
            Function<? super V, W> f_V_W,
            Function<? super W, X> f_W_X,
            Function<? super X, Y> f_X_Y,
            Function<? super Y, Z> f_Y_Z,
            Function<? super Z, A> f_Z_A,
            Function<? super A, B> f_A_B,
            Consumer<? super B> c_B
    ) {
        if(t == null) return;
        @NotNull T nn_t = surely(t);
        @Nullable U u = f_T_U.apply(nn_t);
        if(u == null) return;
        @NotNull U nn_u = surely(u);
        @Nullable V v = f_U_V.apply(nn_u);
        if(v == null) return;
        @NotNull V nn_v = surely(v);
        @Nullable W w = f_V_W.apply(nn_v);
        if(w == null) return;
        @NotNull W nn_w = surely(w);
        @Nullable X x = f_W_X.apply(nn_w);
        if(x == null) return;
        @NotNull X nn_x = surely(x);
        @Nullable Y y = f_X_Y.apply(nn_x);
        if(y == null) return;
        @NotNull Y nn_y = surely(y);
        @Nullable Z z = f_Y_Z.apply(nn_y);
        if(z == null) return;
        @NotNull Z nn_z = surely(z);
        @Nullable A a = f_Z_A.apply(nn_z);
        if(a == null) return;
        @NotNull A nn_a = surely(a);
        @Nullable B b = f_A_B.apply(nn_a);
        if(b == null) return;
        @NotNull B nn_b = surely(b);
        c_B.accept(nn_b);
    }

    /**
     * Hack to work around the checker issue that ternary operators get ignored in combination with type parameter annotations.
     * @param t
     * @param <T>
     * @return
     */
    private static <T>
    @NotNull T surely(@Nullable T t) {
        // workaround for null checker deficiencies
        Supplier<@NotNull T> hack = () -> (@NotNull T) Function.identity().apply(t);
        return hack.get();
    }
}

