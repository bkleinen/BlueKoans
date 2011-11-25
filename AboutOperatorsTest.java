
import static bluekoans.Constants.__;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AboutOperatorsTest.
 *
 * @author  Barbara Kleinen
 * adaption of AboutCollections Java Koan by Mat Bentley
 * @see https://github.com/matyb/java-koans
 * @version 25.11.11
 */
public class AboutOperatorsTest
{

    @Test
    public void plusPlusVariablePlusPlus(){
        int i = 1;
        assertEquals(++i,__);
        assertEquals(i,__);
        assertEquals(i++,__);
        assertEquals(i,__);
    }

    @Test
    public void shortCircuit() {
        int i = 1;
        int a = 6; // Why did we use a variable here?
        // What happens if you replace 'a' with '6' below?
        // Try this with an IDE like Eclipse...
        if ( (a < 9 ) || (++i < 8)  )  i = i + 1;
        assertEquals(i,__);
    }

    @Test
    public void fullAnd(){
        int i = 1;
        if ( true & (++i < 8)  )  i = i + 1;
        assertEquals(i,__);
    }

    @Test
    public void shortCircuitAnd(){
        int i = 1;
        if ( true && (i < -28)  )  i = i + 1;
        assertEquals(i,__);
    }

    @Test
    public void aboutXOR() {
        int i = 1;
        int a = 6;
        if ( (a < 9 ) ^ false)  i = i + 1;
        assertEquals(i,__);
    }

    @Test
    public void dontMistakeEqualsForEqualsEquals() {
        int i = 1;
        boolean a = false;
        if (a = true)  i++;
        assertEquals(a, __);
        assertEquals(i,__);
        // How could you write the condition 'with a twist' to avoid this trap?
    }

	
}
