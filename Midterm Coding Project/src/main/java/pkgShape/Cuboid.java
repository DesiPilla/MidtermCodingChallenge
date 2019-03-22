package pkgShape;

public class Cuboid extends Rectangle {

	private int iDepth;
	
	public Cuboid(int Width, int Length, int Depth) {
		super(Width, Length);
		this.iDepth = Depth;
	}
	
	// Getter and setter for iDepth instance variable
	public int getDepth() {
		return this.iDepth;
	}
	
	public void setDepth(int Depth) {
		this.iDepth = Depth;
	}
	
	
	// Method that returns volume of cuboid
	public double volume() {
		return (double) super.getWidth() * super.getLength() * this.iDepth;
	}

	// Override area method to compute total surface area of cuboid
	@Override
	public double area() {
		return 2*super.area() + 2*super.getWidth()*this.iDepth + super.getLength()*this.iDepth;
	}
	
	// Perimeter method does not apply to a cuboid
	// write code to throw exception
	
	// CompareTo method to compare areas of an rectangle parameter and current instance
	public int compareTo(Cuboid cub) {
		return (int) Math.round(this.volume() - cub.volume());
	}
}
