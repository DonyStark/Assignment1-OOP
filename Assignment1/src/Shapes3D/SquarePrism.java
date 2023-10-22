package Shapes3D;

public class SquarePrism extends Shape3D {
    
    private double edgeLength;

    public SquarePrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    @Override
    public double getVolume() {
        return edgeLength * edgeLength * height;
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
}
