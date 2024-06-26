import org.example.softwareTestingFundamentals.calculator.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    @DisplayName("Fibonacci test")
    void fibonacciTest() {
        Assertions.assertEquals(0, Fibonacci.getValue(0));
        Assertions.assertEquals(1, Fibonacci.getValue(1));
        Assertions.assertEquals(1, Fibonacci.getValue(2));
        Assertions.assertEquals(8, Fibonacci.getValue(6));
        Assertions.assertEquals(144, Fibonacci.getValue(12));
        Assertions.assertEquals(987, Fibonacci.getValue(16));
    }

}
