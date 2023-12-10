import org.example.softwareTestingFundamentals.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @AfterEach
    void afterEachTest() {
        System.out.println("Koniec testu");
    }

    @BeforeEach
        // táto metóda sa spustí pred každým testom
    void init() {
        System.out.println("Začiatok testu");
    }

    @Test
    @DisplayName("Test sčítania")
    void testAdd() {
        //Given -> initialize test
        Calculator calculator = new Calculator();

        //When
        int result = calculator.add(2, 3);

        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("Test násobenia")
    void testMultiply() {
        //Given -> initialize test
        Calculator calculator = new Calculator();

        //When
        int result = calculator.multiply(2, 3);

        //Then
        Assertions.assertEquals(6, result);
        Assertions.assertEquals(0, calculator.multiply(4, 0));
        Assertions.assertEquals(-7, calculator.multiply(-1, 7));
    }

    @Test
    @DisplayName("Test prázdneho objektu")
    void testNull() {
        //Given
        Calculator calculator = null;
        String test = null;

        //Then
        Assertions.assertNull(calculator);
        Assertions.assertNull(test);
    }

    @Test
    @DisplayName("Test vytvorenia objektu")
    void testNoNull() {
        //Given
        Calculator calculator = new Calculator();
        //Then
        Assertions.assertNotNull(calculator);
    }
}
