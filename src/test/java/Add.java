import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add {

	@Test
	public void add() {
		int a=4,b=5;
		
		Reporter.log("result =", a+b, true);
		System.out.println("joy");
	}
}
