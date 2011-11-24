

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;
import static bluekoans.Constants.__;
/**
 * The test class AboutCollectionsTest.
 *
 * @author  Barbara Kleinen, adaption of AboutCollections Java Koan by Mat Bentley
 * @version 25.11.11
 * @see https://github.com/matyb/java-koans
 */
public class AboutCollectionsTest
{
	@Test
	public void usingAnArrayList() {
		// List = interface
		// The generic syntax and special generic cases will be handled in
		// AboutGenerics. We just use <String> collections here to keep it
		// simple.
		List<String> list = new ArrayList<String>();
					// ArrayList: simple List implementation
		list.add("Chicken");
		list.add("Dog");
		list.add("Chicken");
		assertEquals(list.get(0), __);
		assertEquals(list.get(1), __);
		assertEquals(list.get(2), __);
	}

	@Test
	public void usingABasicSet() {
		Set<String> set = new HashSet<String>();
		set.add("Dog");
		set.add("Cat");
		set.add("Dog");
		assertEquals(set.size(), __);
		assertEquals(set.contains("Dog"), __);
		assertEquals(set.contains("Cat"), __);
		assertEquals(set.contains("Chicken"), __);
	}
	
	@Test
	public void usingABasicMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("first key", "first value");
		map.put("second key", "second value");
		map.put("first key", "other value");
		assertEquals(map.size(), __);
		assertEquals(map.containsKey("first key"), __);
		assertEquals(map.containsKey("second key"), __);
		assertEquals(map.containsValue("first value"), __);
		assertEquals(map.get("first key"), __);
	}
	
	@Test
	public void usingBackedArrayList() {
		String[] array = {"a","b","c"};
		List<String> list = Arrays.asList(array);
		list.set(0, "x");
		assertEquals(array[0], __);
		array[0] = "a";
		assertEquals(list.get(0), __);
		// Just think of it as quantum state teleportation...
	}
	

}
