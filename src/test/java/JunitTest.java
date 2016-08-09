import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by shyshkin_vlad on 11.07.16.
 */
public class JunitTest {
    @Test
    public void testFirstLink()
    {
        Assert.assertTrue("Сайт не первый в топе",BaseTest.firstFifth());
    }
}
