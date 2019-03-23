package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Rectangle> {
	
	public int compare(Rectangle rec1, Rectangle rec2) {
		return (int) Math.round(rec2.area() - rec1.area());
	}
	
}
