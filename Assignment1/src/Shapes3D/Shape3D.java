package Shapes3D;
/**
 * An abstract representation of a three-dimensional geometric shape.
 */

	public abstract class Shape3D implements Comparable<Shape3D> {
	    
	    protected double height;

	    /**
	     * Constructs a `Shape3D` object with the given height.
	     *
	     * @param height The height of the three-dimensional shape.
	     */
	    public Shape3D(double height) {
	        this.height = height;
	    }

	    /**
	     * Abstract method to be implemented by each shape to calculate and return its volume.
	     *
	     * @return The volume of the three-dimensional shape.
	     */
	    public abstract double getVolume();
	    
	    /**
	     * Abstract method to be implemented by each shape to calculate and return its base area.
	     *
	     * @return The base area of the three-dimensional shape.
	     */
	    public abstract double getBaseArea();

	    
	    /**
	     * Compares this `Shape3D` object to another `Shape3D` object based on their heights.
	     *
	     * @param other The other `Shape3D` object to compare to.
	     * @return A negative value if this shape's height is less than the other shape's height,
	     *         a positive value if greater, or 0 if they have the same height.
	     */
	    @Override
	    public int compareTo(Shape3D other) {
	        return Double.compare(this.height, other.height);
	    }
	    
	    
	    /**
	     * Retrieves the height of the three-dimensional shape.
	     *
	     * @return The height of the three-dimensional shape.
	     */
		protected abstract double getHeight();
	}
