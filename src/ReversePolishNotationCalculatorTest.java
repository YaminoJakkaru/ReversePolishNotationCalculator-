import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayDeque;
import java.util.Deque;


public class ReversePolishNotationCalculatorTest {

    @Test
    public void shouldCalculateAddition() {
        int res=new ReversePolishNotationCalculator().calculatePolishNotation("2 4 +");
        Assertions.assertEquals(6,res);
    }
    @Test
    public void shouldCalculateSubtraction () {
        int res=new ReversePolishNotationCalculator().calculatePolishNotation("2 4 -");
        Assertions.assertEquals(-2,res);
    }
    @Test
    public void shouldCalculateMultiplication  () {
        int res=new ReversePolishNotationCalculator().calculatePolishNotation("2 4 *");
        Assertions.assertEquals(8,res);
    }
    @Test
    public void shouldCalculateNegativeValue  () {
        int res=new ReversePolishNotationCalculator().calculatePolishNotation("-4 -2 *");
        Assertions.assertEquals(8,res);
    }
}
