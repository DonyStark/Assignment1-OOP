package Shapes3D;

public class Pyramid extends Shape3D {
    
    private double edgeLength;

    public Pyramid(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * edgeLength * edgeLength * height;
    }

    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
	    return "Pyramid [Height: " + height + ", Edge Length: " + edgeLength + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
}
