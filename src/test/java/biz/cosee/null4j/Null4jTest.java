package biz.cosee.null4j;

import org.jetbrains.annotations.Nullable;
import org.junit.Test;

import java.util.function.Supplier;

import static biz.cosee.null4j.Null4j.let;
import static biz.cosee.null4j.Null4j.orDefault;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


/**
 * Tests let and orDefault. There is also a piece of code that can be used
 * to test the annotation manually.
 * <p>
 * Created by Michael Zinn (@RedNifre), cosee GmbH on 02/05/17.
 */
@NotNullByDefault
public class Null4jTest {

    /**
     * You can't really test the annotation automatically, but you can test it manually
     * by adding a "/" to the magic comment line below.
     */
    /*  <- magic comment, set to "//*" to activate test and "/*" to deactivate
    public void testAnnotation() {

        // confuse compiler
        Supplier<String> hack = () -> null;

        // these should be fine:
        String a = "a";
        @Nullable String b = hack.get(); // compiler doesn't know it's really null

        System.out.println(a.length());
        if(b != null) {
            // Smart cast: b is now NotNull thanks to the if so this is fine.
            System.out.println(b.length());
        }

        // ERROR: c is implicitely @NotNull
        // If this is not marked as an error you need to add @NotNullByDefault to the
        // class or directly enclosing package.
        String c = null;

        // ERROR: Unnecessary null check, a is implied to be @NotNull
        if(a != null) { // unnecessary null check

        }

        // ERROR: b is Nullable, needs null check
        b.length();

        // ERROR: last parameter must be NotNull
        orDefault(null, null);
        orDefault(null, b); // compiler doesn't catch that one.

    }
    //*/// <- magic comment delimiter, don't change this line.


    @Test
    public void testOrDefault() throws Exception {
        assertThat(
                orDefault("one", "two"),
                is("one")
        );
        assertThat(
                orDefault(null, "two"),
                is("two")
        );


        assertThat(
                orDefault("one", "two", "three"),
                is("one")
        );
        assertThat(
                orDefault(null, "two", "three"),
                is("two")
        );
        assertThat(
                orDefault(null, null, "three"),
                is("three")
        );
    }

    @Test
    public void testLet() throws Exception {
        assertThat(
                let("test", String::length),
                is(4)
        );

        assertNull(let(null, String::length));

        assertThat(
                let("test", String::length, Object::toString),
                is("4")
        );
    }

}