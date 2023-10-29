package Shapes3D;

/**
 * The `Cone` class represents a three-dimensional cone shape.
 */

public class Cone extends Shape3D {
    
	/**
	 * Radius of the cone 
	 */
    private double radius;
    
    /**
     * Constructs a `Cone` object with the given height and radius.
     *
     * @param height The height of the cone.
     * @param radius The radius of the base of the cone.
     */
    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }
    
    
    /**
     * Calculates and returns the volume of the cone.
     *
     * @return The volume of the cone.
     */
    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    
    /**
     * Calculates and returns the base area of the cone.
     *
     * @return The base area of the cone.
     */
    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Retrieves the height of the cone.
     *
     * @return The height of the cone.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
     * Returns a string representation of the `Cone` object.
     *
     * @return A string describing the cone, including its height, radius, base area, and volume in that order.
     */
	@Override
	public String toString( ) {
		return "Cone [Height: " + height + ", Radius: " + radius + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";    
	}
}