package test.java;

import main.GetsNumbers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Class2Test extends TestBaseTest {


    @ParameterizedTest
    @ValueSource(ints = {199, 991, 784})
    public void testmethod(int p) throws Exception {
        GetsNumbers getsNumbers = new GetsNumbers();
        assertEquals(19, getsNumbers.sumOdDigits(p));

    }

}
