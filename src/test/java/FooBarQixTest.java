import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarQixTest {

    @Test
    public void given_three_returns_foo(){
        assertEquals( "foo", new FooBarQix().playGame(3));
    }

    @Test
    public void give_a_one_should_return_one() {
        assertEquals("1", new FooBarQix().playGame(1));
    }

    @Test
    public void given_five_should_return_bar() {
        assertEquals("bar", new FooBarQix().playGame(5));
    }

}
