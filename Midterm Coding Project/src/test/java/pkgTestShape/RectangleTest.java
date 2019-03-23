package pkgTestShape;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;
import pkgShape.Rectangle;

public class RectangleTest {

	// Tests construction of instance object
	@Test public void Construction_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		assertTrue( testRec instanceof Rectangle);
	}

	
	
	// Tests getters and setters for the iWidth instance variable
	@Test
	public void WidthGetter_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedWidth = 3;
		int actualWidth = testRec.getWidth();
		
		assertEquals(expectedWidth, actualWidth);
	}
	
	@Test
	public void WidthGetter_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedWidth = 10;
		int actualWidth = testRec.getWidth();
		
		assertNotEquals(expectedWidth, actualWidth);
	}	
	
	@Test
	public void WidthSetter_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedWidth = 10;
		int actualWidth;
		
		testRec.setWidth(10);
		actualWidth = testRec.getWidth();
		
		assertEquals(expectedWidth, actualWidth);
	}

	@Test
	public void WidthSetter_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedWidth = 3;
		int actualWidth;
		
		testRec.setWidth(10);
		actualWidth = testRec.getWidth();
		
		assertNotEquals(expectedWidth, actualWidth);
	}
	
	
	
	// Tests getters and setters for the iLength instance variable
	@Test
	public void LengthGetter_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedLength = 4;
		int actualLength = testRec.getLength();
		
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	public void LengthGetter_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedLength = 10;
		int actualLength = testRec.getLength();
		
		assertNotEquals(expectedLength, actualLength);
	}
	
	@Test
	public void LengthSetter_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedLength = 10;
		int actualLength;
		
		testRec.setLength(10);
		actualLength = testRec.getLength();
		
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	public void LengthSetter_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		int expectedLength = 4;
		int actualLength;
		
		testRec.setLength(10);
		actualLength = testRec.getLength();
		
		assertNotEquals(expectedLength, actualLength);
	}
	
	
	
	// Tests the area method
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
	
	
	
	// Tests the perimeter method
	@Test
	public void Perimeter_Test_Pass() {
		Rectangle testRec = new Rectangle(3, 4);
		double expectedPerimeter = 14;
		double actualPerimeter = testRec.perimeter();
		
		assertEquals(expectedPerimeter, actualPerimeter, 0);
	}
	
	@Test
	public void Perimeter_Test_Fail() {
		Rectangle testRec = new Rectangle(3, 4);
		double expectedPerimeter = 100;
		double actualPerimeter = testRec.perimeter();
		
		assertNotEquals(expectedPerimeter, actualPerimeter);
	}
	
	
	
	// Tests to make sure IllegalArgumentException is being thrown properly
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_InitialWidth() {
		Rectangle testRec = new Rectangle(0, 4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_InitialLength() {
		Rectangle testRec = new Rectangle(3, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_SetWidth() {
		Rectangle testRec = new Rectangle(3, 4);
		testRec.setWidth(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ThrownProperly_Test_SetLength() {
		Rectangle testRec = new Rectangle(3, 4);
		testRec.setLength(0);
	}
	
	
	
	// Tests the compareTo method
	@Test
	public void CompareTo_Test_Pass() {
		Rectangle testRec1 = new Rectangle(3, 4);
		Rectangle testRec2 = new Rectangle(6, 7);
		int expectedComp = -30;
		int actualComp;
		
		actualComp = testRec1.compareTo(testRec2);
		assertEquals(expectedComp, actualComp);
	}
	
	@Test
	public void CompareTo_Test_Fail() {
		Rectangle testRec1 = new Rectangle(3, 4);
		Rectangle testRec2 = new Rectangle(6, 7);
		int expectedComp = 30;
		int actualComp;
		
		actualComp = testRec1.compareTo(testRec2);
		assertNotEquals(expectedComp, actualComp);
	}

}
