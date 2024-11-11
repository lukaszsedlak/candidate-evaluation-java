import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    public static void setup() {
        System.out.println("Some kind of setup is happening.");

    }

    @AfterAll
    public static void teardown() {
        System.out.println("Some kind of teardown is happening.");
    }
}
