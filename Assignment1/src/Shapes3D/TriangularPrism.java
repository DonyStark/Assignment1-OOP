package Shapes3D;


/**
 * Represents a three-dimensional triangular prism shape.
 */
public class TriangularPrism extends Shape3D {
    
	
	/**
	 * Edge length of the triangularPrism 
	 */
    private double edgeLength;

    
    /**
     * Constructs a `TriangularPrism` object with the given height and edge length.
     *
     * @param height The height of the triangular prism.
     * @param edgeLength The length of one edge of the triangular base.
     */
    public TriangularPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    
    /**
     * Calculates and returns the volume of the triangular prism.
     *
     * @return The volume of the triangular prism.
     */
    @Override
    public double getVolume() {
        double baseArea = (Math.sqrt(3) / 4.0) * edgeLength * edgeLength;
        return baseArea * height;
    }

    
    /**
     * Calculates and returns the base area of the triangular prism.
     *
     * @return The base area of the triangular prism.
     */
    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4.0) * edgeLength * edgeLength;
    }

    
    /**
     * Retrieves the height of the triangular prism.
     *
     * @return The height of the triangular prism.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
     * Returns a string representation of the `TriangularPrism` object.
     *
     * @return A string describing the triangular prism, including its height, edge length, base area, and volume.
     */
	@Override
	public String toString() {
	    return "TriangularPrism [Height: " + height + ", Edge Length: " + edgeLength + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
}
