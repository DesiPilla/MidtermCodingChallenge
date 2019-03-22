package pkgShape;

public class Rectangle extends Shape {

	private int iWidth;
	private int iLength;
	
	// no-arg and 2-arg constructors
	public Rectangle() {
		super();
	}
	
	public Rectangle(int Width, int Length) {
		this();
		this.iWidth = Width;
		this.iLength = Length;
	}
	
	// Getter and setter for iWidth instance variable
	public int getWidth() {
		return this.iWidth;
	}
	
	public void setWidth(int Width) {
		this.iWidth = Width;
	}
	
	// Getter and setter for iLength instance variable
	public int getLength() {
		return this.iLength;
	}
	
	public void setLength(int Length) {
		this.iLength = Length;
	}
	
	
	// Area method required by superclass Shape
	public double area() {
		return (double) this.iWidth * this.iLength;
	}
	
	// Perimeter method required by superclass Shape
	public double perimeter() {
		return (double) 2*(this.iWidth + this.iLength);
	}
	
	// CompareTo method to compare areas of an rectangle parameter and current instance
	public int compareTo(Rectangle rec) {
		return (int) Math.round(this.area() - rec.area());
	}
	
}
