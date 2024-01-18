package JunitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {


    /**
     * In below approach,all test methods would be using the same instance of calculator class
     * And that's an important thing to be mindful of because if our calculator class were capable of maintaining
     * state and what that means is if our calculator class were capable of storing values in it and keeping
     * those values in it, the act of storing those values in this instance could affect subsequent calculations.
     * private final Calculator calc = new Calculator();
     */
    private Calculator calc;

    /**
     * But if the calculator did maintain state and we wanted to ensure that on each test method we got a brand
     * new pristine calculator every single time.Then in that case, using this setup method might be the smarter
     * way to go in many cases because in this case this method would be called right before each test method is called,
     * which gives us an opportunity to reset things, right, to reset up things in whatever way they need
     * to be set up or to clear things out or whatever it is that you might need.
     */
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
   public void canAddTwoPositiveNumber(){
        int sum = calc.addition(10,20);
        assertEquals(30,sum,"Was expecting sum");
    }


    @Test
    public void canAddOneNegativeNumber(){
        int sum = calc.addition(-10,20);
        assertEquals(10,sum);
    }

    @Test
    public void canAddTwoNegativeNumber(){
        int sum = calc.addition(-10,-20);
        assertEquals(-30,sum);
    }
}
