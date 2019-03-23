package pkgShape;

import java.util.ArrayList;
import java.util.Collections;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	// 3-arg constructor 
	public Cuboid(int Width, int Length, int Depth) throws IllegalArgumentException {
		super(Width, Length);
		if (Depth <= 0 )	// Width and Length values must be positive
			throw new IllegalArgumentException("Depth must be positive");
		else {
			this.iDepth = Depth;
		}
	}
	
	// Getter and setter for iDepth instance variable
	public int getDepth() {
		return this.iDepth;
	}
	
	public void setDepth(int Depth) {
		if (Depth <= 0 )	// Width and Length values must be positive
			throw new IllegalArgumentException("Depth must be positive");
		else {
			this.iDepth = Depth;
		}
	}
	
	
	// Method that returns volume of cuboid
	public double volume() {
		return (double) super.getWidth() * super.getLength() * this.iDepth;
	}

	// Override area method to compute total surface area of cuboid
	@Override
	public double area() {
		return 2*super.area() + 2*super.getWidth()*this.iDepth + 2*super.getLength()*this.iDepth;
	}
	
	// Perimeter method does not apply to a cuboid
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("There is no perimeter for a cuboid");
	}
	
	// CompareTo method to compare areas of an rectangle parameter and current instance
	@Override
	public int compareTo(Object cub) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Use SortByArea or SortByVolume");
	}
	
}
