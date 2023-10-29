package Shapes3D;

import java.io.IOException;

/**
 * A driver class for sorting and comparing different 3D shapes.
 */
public class ShapeSorterDriver {

	public static void main(String[] args) throws IOException {
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

		Shape3D[] shapes = ShapeFileReader.readShapesFromFile(fileName);
		if (shapes == null) {
			System.out.println("Error loading shapes from file.");
			return;
		}

		ShapeComparator comparator = new ShapeComparator(sortType);

		switch (sortOrder.toLowerCase()) {
		case "b":
			SortingUtility.bubbleSort(shapes, comparator);
			break;
		case "i":
			SortingUtility.insertionSort(shapes, comparator);
			break;
		case "s":
			SortingUtility.selectionSort(shapes, comparator);
			break;
		case "m":
			SortingUtility.mergeSort(shapes, comparator);
			break;
		case "q":
			SortingUtility.quickSort(shapes, comparator);
			break;
		default:
			displayUsage();
			return;
		}

		displaySortedShapes(shapes);
	}

	private static void displayUsage() {
		System.out.println("Usage: java -jar sort.jar -f<filename> -t<v/h/a> -s<b/s/i/m/q/z>");
	}

	private static void displaySortedShapes(Shape3D[] shapes) {
		System.out.println("Sorted Shapes:");
		for (Shape3D shape : shapes) {
			System.out.println(shape);
		}
	}

}
