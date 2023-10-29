package Shapes3D;

import java.util.Comparator;

/**
 * A comparator for comparing 3D shapes based on different strategies.
 */
public class ShapeComparator implements Comparator<Shape3D> {

	/** The sorting algorithm to be used */
	private String strategy;

	/**
	 * Constructs a ShapeComparator with the specified sorting strategy.
	 *
	 * @param strategy The sorting strategy to use ("v" for volume, "a" for base
	 *                 area, "h" for default).
	 */
	public ShapeComparator(String strategy) {
		this.strategy = strategy;
	}

	/**
	 * Compares two 3D shapes based on the chosen sorting strategy.
	 *
	 * @param shape1 The first 3D shape to compare.
	 * @param shape2 The second 3D shape to compare.
	 * @return A negative integer, zero, or a positive integer as the first shape is
	 *         less than, equal to, or greater than the second shape.
	 */
	@Override
	public int compare(Shape3D shape1, Shape3D shape2) {
		switch (strategy) {
		case "v":
			// Compare by volume
			return Double.compare(shape1.getVolume(), shape2.getVolume());
		case "a":
			// Compare by base area
			return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
		case "h":
		default:
			// Default comparison
			return shape1.compareTo(shape2);
		}
	}
}
