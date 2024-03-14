import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InterfaceImplTest {
    @Test
    public void testInterfaceImplConstructor() {
        InterfaceImpl impl = new InterfaceImpl();
        assertNotNull(impl);
    }
}


