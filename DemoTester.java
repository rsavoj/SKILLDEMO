import static org.junit.Assert.*;
import org.junit.*;
public class DemoTester {
    @Test
    public void testMultiply(){
        assertEquals("multiply method works", 35, Demo.multiply(6, 6));
    }
}
