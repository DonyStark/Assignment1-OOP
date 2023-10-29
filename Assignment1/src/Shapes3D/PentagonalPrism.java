package Shapes3D;


/**
 * Represents a three-dimensional pentagonal prism shape.
 */
public class PentagonalPrism extends Shape3D {
    
	
	/**
	 * Edge length of the pentagonal prism  
	 */
    private double edgeLength;

    
    /**
     * Constructs a `PentagonalPrism` object with the given height and edge length.
     *
     * @param height The height of the pentagonal prism.
     * @param edgeLength The length of one edge of the pentagon.
     */
    public PentagonalPrism(double height, double edgeLength) {
        super(height);
        this.edgeLength = edgeLength;
    }

    
    /**
     * Calculates and returns the volume of the pentagonal prism.
     *
     * @return The volume of the pentagonal prism.
     */
    @Override
    public double getVolume() {
        double baseArea = (5.0 / 4.0) * edgeLength * edgeLength * Math.tan(Math.toRadians(54));
        return baseArea * height;
    }

    
    /**
     * Calculates and returns the base area of the pentagonal prism.
     *
     * @return The base area of the pentagonal prism.
     */
    @Override
    public double getBaseArea() {
        return (5.0 / 4.0) * edgeLength * edgeLength * Math.tan(Math.toRadians(54));
    }

    
    /**
     * Retrieves the height of the pentagonal prism.
     *
     * @return The height of the pentagonal prism.
     */
	@Override
	protected double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/**
     * Returns a string representation of the `PentagonalPrism` object.
     *
     * @return A string describing the pentagonal prism, including its edge length, height, base area, and volume.
     */
	@Override
	public String toString() {
	    return "PentagonalPrism [Edge Length: " + edgeLength + ", Height: " + height + ", Base Area: " + getBaseArea() + ", Volume: " + getVolume() + "]";
	}
	
	
}
