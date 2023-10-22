package Shapes3D;
/**
 * An abstract representation of a three-dimensional geometric shape.
 */

	public abstract class Shape3D implements Comparable<Shape3D> {
	    
	    protected double height;

	    // Constructor
	    public Shape3D(double height) {
	        this.height = height;
	    }

	    // Abstract methods to be implemented by each shape
	    public abstract double getVolume();
	    public abstract double getBaseArea();

	    @Override
	    public int compareTo(Shape3D other) {
	        return Double.compare(this.height, other.height);
	    }

		protected abstract double getHeight();
	}

