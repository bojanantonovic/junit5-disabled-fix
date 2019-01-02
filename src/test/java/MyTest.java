import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MyTest {

	@Disabled
	@Test
	void someTest() {
		Assertions.fail("You should not see this!");
	}

}
