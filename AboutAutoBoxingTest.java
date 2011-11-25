
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static bluekoans.Constants.__;
/**
 * The test class AboutAutoBoxingTest.
 *
 * @author  Barbara Kleinen
 * adaption of AboutCollections Java Koan by Mat Bentley
 * @see https://github.com/matyb/java-koans
 * @version 25.11.11
 */
public class AboutAutoBoxingTest
{

    @Test
    public void addPrimativesToCollection() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, new Integer(42));
        assertEquals(list.get(0), __);
    }

    @Test
    public void addPrimativesToCollectionWithAutoBoxing() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 42);
        assertEquals(list.get(0), __);
    }

    @Test
    public void migrateYourExistingCodeToAutoBoxingWithoutFear() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, new Integer(42));
        assertEquals(list.get(0), __);

        list.add(1, 84);
        assertEquals(list.get(1), __);
    }

    @Test
    public void allPrimativesCanBeAutoboxed() {
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(0, new Double(42));
        assertEquals(doubleList.get(0), __);

        List<Long> longList = new ArrayList<Long>();
        longList.add(0, new Long(42));
        assertEquals(longList.get(0), __);

        List<Character> characterList = new ArrayList<Character>();
        characterList.add(0, new Character('z'));
        assertEquals(characterList.get(0), __);
    }

}
