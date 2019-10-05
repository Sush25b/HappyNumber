
import com.thoughtworks.check.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void givenNumberOne_whenCheck_thenNumberIsAHappyNumber() {
        HappyNumber happyNumber = new HappyNumber();
        Assert.assertTrue(happyNumber.checkNumber(1));
    }

}
