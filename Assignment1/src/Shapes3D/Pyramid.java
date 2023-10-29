package Shapes3D;


/**
 * Represents a three-dimensional pyramid shape.
 */
public class Pyramid extends Shape3D {
    
    private double edgeLength;

    
    /**
     * Constructs a `Pyramid` object with the given height and edge length.
     *
     * @param height The height of the pyramid.
     * @param edgeLength The length of one edge of the pyramid's base.
     */
    public Pyramid(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    
    /**
     * Calculates and returns the volume of the pyramid.
     *
     * @return The volume of the pyramid.
     */
    @Override
    public double getVolume() {
        return (1.0 / 3.0) * edgeLength * edgeLength * height;
    }

    
    /**
     * Calculates and returns the base area of the pyramid.
     *
     * @return The base area of the pyramid.
     */
    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

    
    /**
     * Retrieves the height of the pyramid.
     *
     * @return The height of the pyramid.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
     * Returns a string representation of the `Pyramid` object.
     *
     * @return A string describing the pyramid, including its height, edge length, base area, and volume.
     */

	@Override
	public String toString() {
	    return "Pyramid [Height: " + height + ", Edge Length: " + edgeLength + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
}
