package Shapes3D;
/**
 * Represents a three-dimensional cylinder shape.
 */
public class Cylinder extends Shape3D {

	/**
	 * Radius of Cylinder  
	 */
	 private double radius;
	 
	 /**
	     * Constructs a `Cylinder` object with the given height and radius.
	     *
	     * @param height The height of the cylinder.
	     * @param radius The radius of the base of the cylinder.
	     */
	    public Cylinder(double height, double radius) {
	        super(height);
	        this.radius = radius;
	    }

	    
	    /**
	     * Calculates and returns the volume of the cylinder.
	     *
	     * @return The volume of the cylinder.
	     */
	    @Override
	    public double getVolume() {
	        return Math.PI * radius * radius * height;
	    }
	    
	    
	    /**
	     * Calculates and returns the base area of the cylinder.
	     *
	     * @return The base area of the cylinder.
	     */
	    @Override
	    public double getBaseArea() {
	        return Math.PI * radius * radius;
	    }

	    
	    /**
	     * Retrieves the height of the cylinder.
	     *
	     * @return The height of the cylinder.
	     */
		@Override
		protected double getHeight() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		/**
	     * Returns a string representation of the `Cylinder` object.
	     *
	     * @return A string describing the cylinder, including its height and radius.
	     */
		@Override
		public String toString() {
			return "Cylinder [Height: " + height + ", Radius: " + radius + "]";
		}

}
