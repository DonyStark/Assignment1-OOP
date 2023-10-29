package Shapes3D;
/**
 * Represents a three-dimensional cylinder shape.
 */
public class Cylinder extends Shape3D {

	
	 private double radius;

	    public Cylinder(double height, double radius) {
	        super(height);
	        this.radius = radius;
	    }

	    @Override
	    public double getVolume() {
	        return Math.PI * radius * radius * height;
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
		@Override
		public String toString() {
			return "Cylinder [Height: " + height + ", Radius: " + radius + "]";
		}

}
