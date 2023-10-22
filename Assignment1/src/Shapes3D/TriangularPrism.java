package Shapes3D;

public class TriangularPrism extends Shape3D {
    
    private double edgeLength;

    public TriangularPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        double baseArea = (Math.sqrt(3) / 4.0) * edgeLength * edgeLength;
        return baseArea * height;
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4.0) * edgeLength * edgeLength;
    }

	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
