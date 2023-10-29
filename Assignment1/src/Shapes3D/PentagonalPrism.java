package Shapes3D;

public class PentagonalPrism extends Shape3D {
    
    private double edgeLength;

    public PentagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        double baseArea = (5.0 / 4.0) * edgeLength * edgeLength * Math.tan(Math.toRadians(54));
        return baseArea * height;
    }

    @Override
    public double getBaseArea() {
        return (5.0 / 4.0) * edgeLength * edgeLength * Math.tan(Math.toRadians(54));
    }

	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
	    return "PentagonalPrism [Edge Length: " + edgeLength + ", Height: " + height + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
	
	
}
