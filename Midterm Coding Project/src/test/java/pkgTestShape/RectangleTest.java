package pkgTestShape;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import pkgShape.Rectangle;
import pkgShape.Cuboid;

public class RectangleTest {

	// Test area method in Rectangle class
	@Test
	public void Area_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		double expectedArea = 12;
		double actualArea = testRec.area();
		
		assertEquals(expectedArea, actualArea, 0);
	}

	@Test
	public void Area_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		double expectedArea = 11;
		double actualArea = testRec.area();
		
		assertNotEquals(expectedArea, actualArea);
	}
	
	
	// Tets volume method in Cuboid class
	@Test
	public void Volume_Test_Pass() {
		Cuboid testCub = new Cuboid(2, 3, 4);
		double expectedVolume = 24;
		double actualVolume = testCub.volume();
		
		assertEquals(expectedVolume, actualVolume, 0);
	}
	
	@Test
	public void Volume_Test_Fail() {
		Cuboid testCub = new Cuboid(2, 3, 4);
		double expectedVolume = 23;
		double actualVolume = testCub.volume();
		
		assertNotEquals(expectedVolume, actualVolume, 0);
	}
	
	
	
}
