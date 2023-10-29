package Shapes3D;

public class Cone extends Shape3D {
    
    private double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}