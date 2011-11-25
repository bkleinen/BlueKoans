import static org.junit.Assert.*;
import org.junit.Test;
import static bluekoans.Constants.__;

/**
 * The test class AboutLoopsTest.
 *
 * @author  Barbara Kleinen
 * @version 25.11.11
 * adaption of AboutCollections Java Koan by Mat Bentley
 * @see https://github.com/matyb/java-koans
 */
public class AboutLoopsTest
{

	@Test
	public void basicForLoop() {
		String s = "";
		for(int i = 0; i < 5; i++) {
			s += i + " ";
		}
		assertEquals(s, __);
	}
	
	@Test
	public void basicForLoopWithTwoVariables() {
		String s = "";
		for(int i = 0, j = 10; i < 5 && j > 5; i++, j--) {
			s += i + " " + j + " ";
		}
		assertEquals(s, __);
	}
	
	@Test
	public void extendedForLoop() {
		int[] is = {1,2,3,4};
		String s = "-";
		for(int j : is) {
			s += "." + j;
		}
		assertEquals(s, __);
	}
	
	@Test
	public void whileLoop() {
		int result = 0;
		while(result < 3) {
			result++;
		}
		assertEquals(result, __);
	}
	
	@Test
	public void doLoop() {
		int result = 0;
		do {
			result++;
		} while(false);
		assertEquals(result, __);
	}
	
	@Test
	public void extendedForLoopBreak() {
		String[] sa = {"Dog", "Cat", "Tiger" };
		int count = 0;
		for(String current : sa) {
			if("Cat".equals(current)) {
				break;
			}
			count++;	
		}
		assertEquals(count, __);
	}
	
	@Test
	public void extendedForLoopContinue() {
		String[] sa = {"Dog", "Cat", "Tiger" };
		int count = 0;
		for(String current : sa) {
			if("Dog".equals(current)) {
				continue;
			} else {
				count++;	
			}
		}
		assertEquals(count, __);
	}

	
	@Test
	public void forLoopContinueLabel() {
		int count = 0;
		outerLabel:
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
			{
				count++;
				if(count > 2) {
					continue outerLabel;	
				}
			}
			count += 10;
		}
		// What does continue with a label mean? 
		// What gets executed? Where does the program flow continue?
		assertEquals(count, __);
	}
	
	@Test
	public void forLoopBreakLabel() {
		int count = 0;
		outerLabel:
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
			{
				count++;
				if(count > 2) {
					break outerLabel;	
				}
			}
			count += 10;
		}
		// What does break with a label mean? 
		// What gets executed? Where does the program flow continue?
		assertEquals(count, __);
	}

}
