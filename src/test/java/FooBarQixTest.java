import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooBarQixTest {

    @Test
    public void given_three_by_three_returns_foofoo(){
        assertEquals( "foofoo", new FooBarQix().playGame(3));
    }

    @Test
    public void given_thirty_three_by_three_returns_foofoofoo(){
        assertEquals( "foofoofoo", new FooBarQix().playGame(33));
    }
    @Test
    public void give_a_one_should_return_one() {
        assertEquals("1", new FooBarQix().playGame(1));
    }

    @Test
    public void given_five_should_return_bar() {
        assertEquals("barbar", new FooBarQix().playGame(5));
    }

    @Test
    public void given_seven_should_return_qixqix() {
        assertEquals("qixqix", new FooBarQix().playGame(7));
    }

    @Test
    public void contains_digit_three_should_return_foo() {
        assertEquals("foo", new FooBarQix().playGame(13));
    }

    @Test
    public void contains_digit_five_and_divisible_by_five_should_return_barbar() {
        assertEquals("barbar", new FooBarQix().playGame(25));
    }

    @Test
    public void contains_digit_seven_and_divisible_by_seven_should_return_qixqix() {
        assertEquals("qixqix", new FooBarQix().playGame(70));
    }
}
