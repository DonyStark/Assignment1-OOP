package Shapes3D;



/**
 * Represents a three-dimensional octagonal prism shape.
 */
public class OctagonalPrism extends Shape3D {
    
    private double edgeLength;

    
    
    /**
     * Constructs an `OctagonalPrism` object with the given height and edge length.
     *
     * @param height The height of the octagonal prism.
     * @param edgeLength The length of one edge of the octagon.
     */
    public OctagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    
    /**
     * Constructs an `OctagonalPrism` object with the given height and edge length.
     *
     * @param height The height of the octagonal prism.
     * @param edgeLength The length of one edge of the octagon.
     */
    @Override
    public double getVolume() {
        double baseArea = 2.0 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
        return baseArea * height;
    }

    
    
    /**
     * Calculates and returns the base area of the octagonal prism.
     *
     * @return The base area of the octagonal prism.
     */
    @Override
    public double getBaseArea() {
        return 2.0 * (1 + Math.sqrt(2)) * edgeLength * edgeLength;
    }

    
    /**
     * Retrieves the height of the octagonal prism.
     *
     * @return The height of the octagonal prism.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
     * Returns a string representation of the `OctagonalPrism` object.
     *
     * @return A string describing the octagonal prism, including its height, edge length, base area, and volume.
     */
	@Override
	public String toString() {
		return "OctogonalPrism [Height: " + height + ", Edge Length: " + edgeLength + ",Base Area: " + getBaseArea() + ", Volume: " + getVolume() +"]"; 
	}
}






