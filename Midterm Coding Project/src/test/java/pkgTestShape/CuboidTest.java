package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.SortByArea;
import pkgShape.SortByVolume;

public class CuboidTest {

	// Tests construction of instance object
		@Test public void Construction_Test_Pass() {
			Cuboid testCub = new Cuboid(3, 4, 5);
			assertTrue( testCub instanceof Cuboid);
		}
	
		
	
	// Tests getters and setters for iDepth instance variable
	@Test
	public void DepthGetter_Test_Pass() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		int expectedDepth = 5;
		int actualDepth = testCub.getDepth();
		
		assertEquals(expectedDepth, actualDepth);
	}
	
	@Test
	public void DepthGetter_Test_Fail() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		int expectedDepth = 4;
		int actualDepth = testCub.getDepth();
		
		assertNotEquals(expectedDepth, actualDepth);
	}
	
	@Test
	public void DepthSetter_Test_Pass() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		int expectedDepth = 10;
		int actualDepth;
		
		testCub.setDepth(10);
		actualDepth = testCub.getDepth();
		
		assertEquals(expectedDepth, actualDepth);
	}
	
	@Test
	public void DepthSetter_Test_Fail() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		int expectedDepth = 5;
		int actualDepth;
		
		testCub.setDepth(10);
		actualDepth = testCub.getDepth();
		
		assertNotEquals(expectedDepth, actualDepth);
	}
	
	
	
	// Tests area method
	@Test
	public void Area_Test_Pass() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		double expectedArea = 94;
		double actualArea = testCub.area();
		
		assertEquals(expectedArea, actualArea, 0);
	}
	
	@Test
	public void Area_Test_Fail() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		double expectedArea = 0;
		double actualArea = testCub.area();
		
		assertNotEquals(expectedArea, actualArea);
	}
	
	
	
	// Tests volume method
	@Test
	public void Volume_Test_Pass() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		double expectedVolume = 60;
		double actualVolume = testCub.volume();
		
		assertEquals(expectedVolume, actualVolume, 0);
	}
	
	@Test
	public void Volume_Test_Fail() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		double expectedVolume = 100;
		double actualVolume = testCub.volume();
		
		assertNotEquals(expectedVolume, actualVolume, 0);
	}
	
	
	
	// Tests to make sure perimeter method throws UnsupportedOperationException
	@Test(expected = UnsupportedOperationException.class)
	public void Perimeter_Test() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		testCub.perimeter();
	}
	
		
		
	// Tests to make sure IllegalArgumentException is being thrown properly
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_InitialDepth() {
		Cuboid testCub = new Cuboid(3, 4, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_SetDepth() {
		Cuboid testCub = new Cuboid(3, 4, 5);
		testCub.setDepth(0);
	}
	
	
	
	// Tests that SortByArea sorts correctly in descending order
	@Test
	public void SortByArea_Test_Pass() {
		Cuboid testCub1 = new Cuboid(3, 4, 5);	// Area = 94, Volume = 60
		Cuboid testCub2 = new Cuboid(6, 7, 8);	// Area = 292, Volume = 336
		Cuboid testCub3 = new Cuboid(4, 5, 6);	// Area = 148, Volume = 120
		Cuboid testCub4 = new Cuboid(5, 6, 7);	// Area = 214, Volume = 210
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
		cubs.add(testCub3);
		cubs.add(testCub4);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub2);
		expected.add(testCub4);
		expected.add(testCub3);
		expected.add(testCub1);
		
		Collections.sort(cubs, new SortByArea());		
		assertTrue(cubs.equals(expected));			
		}
	
	@Test
	public void SortByArea_Test_Fail() {
		Cuboid testCub1 = new Cuboid(3, 4, 5);	// Area = 94, Volume = 60
		Cuboid testCub2 = new Cuboid(6, 7, 8);	// Area = 292, Volume = 336
		Cuboid testCub3 = new Cuboid(4, 5, 6);	// Area = 148, Volume = 120
		Cuboid testCub4 = new Cuboid(5, 6, 7);	// Area = 214, Volume = 210
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
		cubs.add(testCub3);
		cubs.add(testCub4);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub1);
		expected.add(testCub2);
		expected.add(testCub3);
		expected.add(testCub4);
		
		Collections.sort(cubs, new SortByArea());		
		assertFalse(cubs.equals(expected));			
		}
	
	
	
	// Tests that SortByVolume sorts correctly in descending order
	@Test
	public void SortByVolume_Test_Pass() {
		Cuboid testCub1 = new Cuboid(3, 4, 5);	// Area = 94, Volume = 60
		Cuboid testCub2 = new Cuboid(6, 7, 8);	// Area = 292, Volume = 336
		Cuboid testCub3 = new Cuboid(4, 5, 6);	// Area = 148, Volume = 120
		Cuboid testCub4 = new Cuboid(5, 6, 7);	// Area = 214, Volume = 210
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
		cubs.add(testCub3);
		cubs.add(testCub4);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub2);
		expected.add(testCub4);
		expected.add(testCub3);
		expected.add(testCub1);
		
		Collections.sort(cubs, new SortByVolume());	
		assertTrue(cubs.equals(expected));			
		}

	@Test
	public void SortByVolume_Test_Fail() {
		Cuboid testCub1 = new Cuboid(3, 4, 5);	// Area = 94, Volume = 60
		Cuboid testCub2 = new Cuboid(6, 7, 8);	// Area = 292, Volume = 336
		Cuboid testCub3 = new Cuboid(4, 5, 6);	// Area = 148, Volume = 120
		Cuboid testCub4 = new Cuboid(5, 6, 7);	// Area = 214, Volume = 210
		
		ArrayList<Cuboid> cubs = new ArrayList<Cuboid>();
		cubs.add(testCub1);
		cubs.add(testCub2);
		cubs.add(testCub3);
		cubs.add(testCub4);
	
		ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
		expected.add(testCub1);
		expected.add(testCub2);
		expected.add(testCub3);
		expected.add(testCub4);
		
		Collections.sort(cubs, new SortByVolume());	
		assertFalse(cubs.equals(expected));			
		}
}
