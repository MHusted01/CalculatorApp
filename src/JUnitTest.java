import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JUnitTest {


    @Test
    public void test() {

       String number = "12.5";

       Assertions.assertTrue(Main.validNumber(number));
    }


}
