
import com.thoughtworks.check.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    HappyNumber happyNumber = new HappyNumber();

    @Test
    public void givenNumberOne_whenCheck_thenNumberIsAHappyNumber() {

        assertTrue(happyNumber.checkNumber(1));
    }

    @Test
    public void givenNumberNotOne_whenCheck_thenItsNotHappyNumber() {

        assertFalse(happyNumber.checkNumber(5));
    }


    @Test
    public void givenNumberTen_whenCheck_thenItsAHappyNumber() {

        assertTrue(happyNumber.checkNumber(10));
    }

    @Test
    public void givenNumberNineteen_whenCheck_thenItsAHappyNumber() {

        assertTrue(happyNumber.checkNumber(19));
    }

    @Test
    public void givenNumberTwoHundredThrirtyNine_whenCheck_thenItsAHappyNumber() {
        assertTrue(happyNumber.checkNumber(239));
    }
}
