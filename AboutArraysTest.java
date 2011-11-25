import static org.junit.Assert.*;
import org.junit.Test;
import static bluekoans.Constants.__;
import java.util.Arrays;

/**
 * The test class AboutArraysTest.
 *
 * @author  Barbara Kleinen
 * adaption of AboutCollections Java Koan by Mat Bentley
 * @see https://github.com/matyb/java-koans
 * @version 25.11.11
 */
public class AboutArraysTest
{
    /**
     * Default constructor for test class AboutArraysTest
     */
    public AboutArraysTest()
    {
    }

    @Test
    public void exerciseSampleCode()
    {
        AboutArrays aboutArrays = new AboutArrays();
        aboutArrays.sampleCode();
    }

    @Test
    public void arraysDoNotConsiderElementsWhenEvaluatingEquality(){
        // arrays utilize default object equality (A == {1} B == {1}, though A
        // and B contain the same thing, the container is not the same
        // referenced array instance...
        assertEquals(new int[] { 1 }.equals(new int[] { 1 }), __);
    }

    @Test
    public void cloneEqualityIsNotRespected(){ //!
        int[] original = new int[] { 1 };
        assertEquals(original.equals(original.clone()), __);
    }

    @Test
    public void anArraysHashCodeMethodDoesNotConsiderElements(){
        int[] array0 = new int[]{0};
        int[] array1 = new int[]{0};
        assertEquals(Integer.valueOf(array0.hashCode()).equals(array1.hashCode()), __); // not equal!
        // TODO: ponder the consequences when arrays are used in Hash Collection implementations.
    }

    @Test
    public void arraysHelperClassEqualsMethodConsidersElementsWhenDeterminingEquality(){
        int[] array0 = new int[]{0};
        int[] array1 = new int[]{0};
        assertEquals(Arrays.equals(array0, array1), __); 	// whew - what most people assume 
        // about equals in regard to arrays! (logical equality)
    }

    @Test
    public void arraysHelperClassHashCodeMethodConsidersElementsWhenDeterminingHashCode(){
        int[] array0 = new int[]{0};
        int[] array1 = new int[]{0};
        // whew - what most people assume about hashCode in regard to arrays!
        assertEquals(Integer.valueOf(Arrays.hashCode(array0)).equals(Arrays.hashCode(array1)), __);
    }

    @Test
    public void arraysAreMutable(){
        final boolean[] oneBoolean = new boolean[]{false};
        oneBoolean[0] = true;
        assertEquals(oneBoolean[0], __);
    }

    @Test
    public void arraysAreIndexedAtZero(){
        int[] integers = new int[]{1,2};
        assertEquals(integers[0], __);
        assertEquals(integers[1], __);
    }

    @Test
    public void arrayIndexOutOfBounds(){
        int[] array = new int[]{1};
        @SuppressWarnings("unused")
        int meh = array[1]; // remember 0 based indexes, 1 is the 2nd element (which doesn't exist)
    }

    @Test
    public void arrayLengthCanBeChecked(){
        assertEquals(new int[1].length, __);
    }

}


