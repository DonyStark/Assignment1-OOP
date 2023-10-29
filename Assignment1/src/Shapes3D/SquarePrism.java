package Shapes3D;


/**
 * Represents a three-dimensional square prism shape.
 */
public class SquarePrism extends Shape3D {
    
	/**
	 * Edge length of the prism 
	 */
    private double edgeLength;

    
    /**
     * Constructs a `SquarePrism` object with the given height and edge length.
     *
     * @param height The height of the square prism.
     * @param edgeLength The length of one edge of the square base.
     */
    public SquarePrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    
    /**
     * Calculates and returns the volume of the square prism.
     *
     * @return The volume of the square prism.
     */
    @Override
    public double getVolume() {
        return edgeLength * edgeLength * height;
    }

    
    /**
     * Calculates and returns the base area of the square prism.
     *
     * @return The base area of the square prism.
     */
    @Override
    public double getBaseArea() {
        return edgeLength * edgeLength;
    }

    
    /**
     * Retrieves the height of the square prism.
     *
     * @return The height of the square prism.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
     * Returns a string representation of the `SquarePrism` object.
     *
     * @return A string describing the square prism, including its height, edge length, base area, and volume.
     */
	@Override
	public String toString() {
	    return "SquarePrism [Height: " + height + ", Edge Length: " + edgeLength + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
}
