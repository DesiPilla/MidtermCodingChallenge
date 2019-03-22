package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class CuboidTest {

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
		int expectedDepth = 100;
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
	
}
