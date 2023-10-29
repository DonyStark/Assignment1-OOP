package Shapes3D;

import java.io.IOException;

/**
 * A driver class for sorting and comparing different 3D shapes.
 */
public class ShapeSorterDriver {

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();// record end time

		if (args.length != 3) {
			displayUsage();
			return;
		}

		String fileName = null;
		String sortType = null;
		String sortOrder = null;

		for (int i = 0; i < args.length; i++) {
			String currentArg = args[i].toLowerCase();
			String option = currentArg.substring(0, 2);
			String temp = currentArg.substring(2);
			String value = temp.replaceAll("\"", "");

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
		case "z":
			SortingUtility.heapSort(shapes, comparator);
			break;
		default:
			displayUsage();
			return;
		}
		long endTime = System.currentTimeMillis();// record end time
		Long elapsedTime = endTime - startTime;

		displaySortedShapes(shapes);
		System.out.println("Sorting time: " + elapsedTime + " milliseconds");
	}

	private static void displayUsage() {
		System.out.println("Usage: java -jar sort.jar -f<filename> -t<v/h/a> -s<b/s/i/m/q/z>");
	}

	private static void displaySortedShapes(Shape3D[] shapes) {
		System.out.println("Sorted Shapes:");
		Shape3D firstSortedValue = null;
		Shape3D lastSortedValue = null;

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);

			// Store the first and last sorted values
			if (i == 0) {
				firstSortedValue = shapes[i];
			}
			if (i == shapes.length - 1) {
				lastSortedValue = shapes[i];
			}
		}
		System.out.println("First sorted value: " + firstSortedValue);
		System.out.println("Last sorted value: " + lastSortedValue);

		// Print every thousandth value in between
		for (int i = 0; i < shapes.length; i += 1000) {
			System.out.println("Value at index " + i + ": " + shapes[i]);
		}

	}

}
