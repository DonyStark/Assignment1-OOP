package Shapes3D;

public class SortingUtility {

	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
	}

	// Bubble sort algorithm.
	public static void bubbleSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		int n = shapes.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (comparator.compare(shapes[j], shapes[j + 1]) > 0) {
					// swap shapes[j] and shapes[j+1]
					Shape3D temp = shapes[j];
					shapes[j] = shapes[j + 1];
					shapes[j + 1] = temp;
				}
			}
		}
	}

	public static void insertionSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		int n = shapes.length;
	    for (int i = 1; i < n; i++) {
	        Shape3D key = shapes[i];
	        int j = i - 1;

	        while (j >= 0 && comparator.compare(shapes[j], key) > 0) {
	            shapes[j + 1] = shapes[j];
	            j = j - 1;
	        }
	        shapes[j + 1] = key;
	    }
	}

	public static void selectionSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {

	}

	public static void mergeSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {

	}

	public static void quickSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {

	}
	public static void radixSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		
	}

}