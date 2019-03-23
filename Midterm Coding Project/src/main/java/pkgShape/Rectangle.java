package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	// 2-arg constructor
	public Rectangle(int Width, int Length) throws IllegalArgumentException {
		if (Width <= 0)	// Width value must be positive
			throw new IllegalArgumentException("Width value must be positive");
		else
			this.iWidth = Width;
		if (Length <= 0) // Length value must be positive
			throw new IllegalArgumentException("Length value must be positive");
		else			
			this.iLength = Length;
	}
	
	// Getter and setter for iWidth instance variable
	public int getWidth() {
		return this.iWidth;
	}
	
	public void setWidth(int Width) {
		if (Width <= 0)	// Width value must be positive
			throw new IllegalArgumentException("Width value must be positive");
		else
			this.iWidth = Width;
	}
	
	// Getter and setter for iLength instance variable
	public int getLength() {
		return this.iLength;
	}
	
	public void setLength(int Length) {
		if (Length <= 0) // Length value must be positive
			throw new IllegalArgumentException("Length value must be positive");
		else			
			this.iLength = Length;
	}
	
	
	// Area method required by superclass Shape
	@Override
	public double area() {
		return (double) this.iWidth * this.iLength;
	}
	
	// Perimeter method required by superclass Shape
	@Override
	public double perimeter() {
		return (double) 2*(this.iWidth + this.iLength);
	}
	
	// CompareTo method to compare areas of an rectangle parameter and current instance
	public int compareTo(Object rec) {
		return (int) Math.round(this.area() - ((Rectangle) rec).area());
	}
	
}
