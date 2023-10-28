package Shapes3D;

import java.io.*;

/**
 * A driver class for sorting and comparing different 3D shapes.
 */
public class ShapeSorterDriver {

	public static void main(String[] args) {
		if (args.length < 3) {
			displayUsage();
			return;
		}

		String fileName = null;
		String sortType = null;
		String sortOrder = null;

		for (int i = 0; i < args.length; i++) {
			String currentArg = args[i].toLowerCase();
			String option = currentArg.substring(0, 2);
			String value = currentArg.substring(2);

			switch (option) {
			case "-f":
				fileName = value;
				break;
			case "-t":
				sortType = value;
				break;
			case "-s":
				sortOrder = value;
				break;
			default:
				displayUsage();
				return;
			}
		}

		Shape3D[] shapes = loadShapesFromFile(fileName);
		if (shapes == null) {
			System.out.println("Error loading shapes from file.");
			return;
		}

		ShapeComparator comparator = new ShapeComparator(sortType);

		switch (sortOrder.toLowerCase()) {
		case "b":
			SortingUtility.bubbleSort(shapes, comparator);
			break;
		// ... you can fill in other cases for other sorting methods
		default:
			displayUsage();
			return;
		}

		displaySortedShapes(shapes);
	}

	private static void displayUsage() {
		System.out.println("Usage: java -jar sort.jar -f<filename> -t<v/h/a> -s<b/s/i/m/q/z>");
	}

	private static Shape3D[] loadShapesFromFile(String fileName) {
		Shape3D[] shapes = null;

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line = reader.readLine();
			String[] parts = line.split(" ");

			if (parts.length % 3 != 1) {
				// Handle the case where the format is incorrect.
				// You can throw an exception, print an error message, or take other appropriate
				// action.
				return null;
			}

			int numShapes = Integer.parseInt(parts[0]);
			shapes = new Shape3D[numShapes];

			for (int i = 0; i < numShapes; i++) {
				int startIndex = i * 3 + 1;

				String shapeType = parts[startIndex];
				double param1 = Double.parseDouble(parts[startIndex + 1]);
				double param2 = Double.parseDouble(parts[startIndex + 2]);

				// Create the corresponding Shape3D object based on the shape type.
				switch (shapeType) {
				case "Cylinder":
					shapes[i] = new Cylinder(param1, param2);
					break;
				case "Cone":
					shapes[i] = new Cone(param1, param2);
					break;
				case "Pyramid":
					shapes[i] = new Pyramid(param1, param2);
					break;
				case "SquarePrism":
					shapes[i] = new SquarePrism(param1, param2);
					break;
				case "TriangularPrism":
					shapes[i] = new TriangularPrism(param1, param2);
					break;
				case "PentagonalPrism":
					shapes[i] = new PentagonalPrism(param1, param2);
					break;
				case "OctagonalPrism":
					shapes[i] = new OctagonalPrism(param1, param2);
					break;
				default:
					// Handle the case where the shapeType is not recognized.
					// You can throw an exception, print an error message, or take other appropriate
					// action.
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return shapes;
	}

	private static void displaySortedShapes(Shape3D[] shapes) {
		System.out.println("Sorted Shapes:");
		for (Shape3D shape : shapes) {
			System.out.println(shape);
		}
	}

	private static void bubbleSort(Shape3D[] shapes, ShapeComparator comparator) {
		int n = shapes.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (comparator.compare(shapes[j], shapes[j + 1]) < 0) {
					Shape3D temp = shapes[j];
					shapes[j] = shapes[j + 1];
					shapes[j + 1] = temp;
				}
			}
		}
	}
}

class ShapeComparat implements java.util.Comparator<Shape3D> {
	private String sortType;

	public ShapeComparat(String sortType) {
		this.sortType = sortType;
	}

	@Override
	public int compare(Shape3D shape1, Shape3D shape2) {
		switch (sortType) {
		case "v":
			return Double.compare(shape1.getVolume(), shape2.getVolume());
		case "h":
			return Double.compare(shape1.getHeight(), shape2.getHeight());
		case "a":
			return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
		default:
			return 0;
		}
	}
}