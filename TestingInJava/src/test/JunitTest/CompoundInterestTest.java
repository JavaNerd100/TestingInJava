package JunitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompoundInterestTest {

    private final CompoundInterest compoundInterest = new CompoundInterest();

    @Test
    public void compoundInterestTest(){
        String answer = compoundInterest.compoundIntrestCalculator("4000",5,".06",4);
        assertEquals("₹5,387.42",answer);
    }
}
