
import com.thoughtworks.check.HappyNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest
{
    @Test
    public void givenZeroNumber_whenCheck_thenShouldNotBeHappyNumber()
    {
        HappyNumber number= new HappyNumber(0);

        assertFalse(HappyNumber.checkHappyNumber(0));
    }
}
