package Shapes3D;

public class OctagonalPrism extends Shape3D {
    
    private double edgeLength;

    public OctagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        double baseArea = 2.0 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
        return baseArea * height;
    }

    @Override
    public double getBaseArea() {
        return 2.0 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }

	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}






