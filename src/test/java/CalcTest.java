import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalcTest {
    @Test
    void testMultiply() {
      Calc calc = new Calc();
      assertAll(
              () -> assertEquals(6, calc.multiply(2,3)),
              () -> assertEquals(-6, calc.multiply(2, -3)),
              () -> assertEquals(6, calc.multiply(-2,-3)),
              () -> assertEquals(0, calc.multiply(6,0)));
    }


    @Test
    void testPowerOf() {
        Calc calc = new Calc();

        assertAll(
                () -> assertEquals(16, calc.powerOf(2, 4)),
                () -> assertEquals(1, calc.powerOf(15,0)),
                () -> assertEquals(16, calc.powerOf(-2, 4)),
                () -> assertEquals(-8, calc.powerOf(-2, 3))
        );

    }
}