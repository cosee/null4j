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


    public static <T>
    T orDefault(
            @Nullable T nullable1,
            T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                defaultValue;
    }

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                nullable2 != null ? nullable2 :
                defaultValue;
    }

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                nullable2 != null ? nullable2 :
                nullable3 != null ? nullable3 :
                defaultValue;
    }

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                nullable2 != null ? nullable2 :
                nullable3 != null ? nullable3 :
                nullable4 != null ? nullable4 :
                defaultValue;
    }

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            T defaultValue
    ) {
        return
                nullable1 != null ? nullable1 :
                nullable2 != null ? nullable2 :
                nullable3 != null ? nullable3 :
                nullable4 != null ? nullable4 :
                nullable5 != null ? nullable5 :
                defaultValue;
    }

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            T defaultValue
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

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            T defaultValue
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

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @Nullable T nullable8,
            T defaultValue
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

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @Nullable T nullable8,
            @Nullable T nullable9,
            T defaultValue
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

    public static <T>
    T orDefault(
            @Nullable T nullable1,
            @Nullable T nullable2,
            @Nullable T nullable3,
            @Nullable T nullable4,
            @Nullable T nullable5,
            @Nullable T nullable6,
            @Nullable T nullable7,
            @Nullable T nullable8,
            @Nullable T nullable9,
            @Nullable T nullable10,
            T defaultValue
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
                nullable10 != null ? nullable10 :
                defaultValue;
    }


    public static <T, U>
    @Nullable U let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U
    ) {
        if (t == null) return null;
        return f_T_U.apply(t);
    }

    public static <T, U, V>
    @Nullable V let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        return f_U_V.apply(u);
    }

    public static <T, U, V, W>
    @Nullable W let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        return f_V_W.apply(v);
    }

    public static <T, U, V, W, X>
    @Nullable X let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        return f_W_X.apply(w);
    }

    public static <T, U, V, W, X, Y>
    @Nullable Y let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        return f_X_Y.apply(x);
    }

    public static <T, U, V, W, X, Y, Z>
    @Nullable Z let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y,
            Function<? super Y, @Nullable Z> f_Y_Z
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        @Nullable Y y = f_X_Y.apply(x);
        if (y == null) return null;
        return f_Y_Z.apply(y);
    }

    public static <T, U, V, W, X, Y, Z, A>
    @Nullable A let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y,
            Function<? super Y, @Nullable Z> f_Y_Z,
            Function<? super Z, @Nullable A> f_Z_A
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        @Nullable Y y = f_X_Y.apply(x);
        if (y == null) return null;
        @Nullable Z z = f_Y_Z.apply(y);
        if (z == null) return null;
        return f_Z_A.apply(z);
    }

    public static <T, U, V, W, X, Y, Z, A, B>
    @Nullable B let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y,
            Function<? super Y, @Nullable Z> f_Y_Z,
            Function<? super Z, @Nullable A> f_Z_A,
            Function<? super A, @Nullable B> f_A_B
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        @Nullable Y y = f_X_Y.apply(x);
        if (y == null) return null;
        @Nullable Z z = f_Y_Z.apply(y);
        if (z == null) return null;
        @Nullable A a = f_Z_A.apply(z);
        if (a == null) return null;
        return f_A_B.apply(a);
    }

    public static <T, U, V, W, X, Y, Z, A, B, C>
    @Nullable C let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y,
            Function<? super Y, @Nullable Z> f_Y_Z,
            Function<? super Z, @Nullable A> f_Z_A,
            Function<? super A, @Nullable B> f_A_B,
            Function<? super B, @Nullable C> f_B_C
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        @Nullable Y y = f_X_Y.apply(x);
        if (y == null) return null;
        @Nullable Z z = f_Y_Z.apply(y);
        if (z == null) return null;
        @Nullable A a = f_Z_A.apply(z);
        if (a == null) return null;
        @Nullable B b = f_A_B.apply(a);
        if (b == null) return null;
        return f_B_C.apply(b);
    }

    public static <T, U, V, W, X, Y, Z, A, B, C, D>
    @Nullable D let(
            @Nullable T t,
            Function<? super T, @Nullable U> f_T_U,
            Function<? super U, @Nullable V> f_U_V,
            Function<? super V, @Nullable W> f_V_W,
            Function<? super W, @Nullable X> f_W_X,
            Function<? super X, @Nullable Y> f_X_Y,
            Function<? super Y, @Nullable Z> f_Y_Z,
            Function<? super Z, @Nullable A> f_Z_A,
            Function<? super A, @Nullable B> f_A_B,
            Function<? super B, @Nullable C> f_B_C,
            Function<? super C, @Nullable D> f_C_D
    ) {
        if (t == null) return null;
        @Nullable U u = f_T_U.apply(t);
        if (u == null) return null;
        @Nullable V v = f_U_V.apply(u);
        if (v == null) return null;
        @Nullable W w = f_V_W.apply(v);
        if (w == null) return null;
        @Nullable X x = f_W_X.apply(w);
        if (x == null) return null;
        @Nullable Y y = f_X_Y.apply(x);
        if (y == null) return null;
        @Nullable Z z = f_Y_Z.apply(y);
        if (z == null) return null;
        @Nullable A a = f_Z_A.apply(z);
        if (a == null) return null;
        @Nullable B b = f_A_B.apply(a);
        if (b == null) return null;
        @Nullable C c = f_B_C.apply(b);
        if (c == null) return null;
        return f_C_D.apply(c);
    }

}
