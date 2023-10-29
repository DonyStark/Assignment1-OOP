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
		int n = shapes.length;

		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(shapes[j], shapes[minIndex]) < 0) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				Shape3D temp = shapes[i];
				shapes[i] = shapes[minIndex];
				shapes[minIndex] = temp;
			}
		}
	}

	public static void mergeSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		mergeSortHelper(shapes, comparator, 0, shapes.length - 1);
	}

	private static void mergeSortHelper(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int left,
			int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSortHelper(shapes, comparator, left, mid);
			mergeSortHelper(shapes, comparator, mid + 1, right);

			merge(shapes, comparator, left, mid, right);
		}
	}

	private static void merge(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int left, int mid,
			int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		Shape3D[] leftArray = new Shape3D[n1];
		Shape3D[] rightArray = new Shape3D[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = shapes[left + i];
		}
		for (int i = 0; i < n2; i++) {
			rightArray[i] = shapes[mid + i + 1];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
				shapes[k] = leftArray[i];
				i++;
			} else {
				shapes[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			shapes[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			shapes[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public static void quickSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		quickSortHelper(shapes, comparator, 0, shapes.length - 1);
	}

	private static void quickSortHelper(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(shapes, comparator, low, high);

			quickSortHelper(shapes, comparator, low, pivotIndex - 1);
			quickSortHelper(shapes, comparator, pivotIndex + 1, high);
		}
	}

	private static int partition(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int low, int high) {
		Shape3D pivot = shapes[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (comparator.compare(shapes[j], pivot) <= 0) {
				i++;
				Shape3D temp = shapes[i];
				shapes[i] = shapes[j];
				shapes[j] = temp;
			}
		}

		Shape3D temp = shapes[i + 1];
		shapes[i + 1] = shapes[high];
		shapes[high] = temp;

		return i + 1;
	}

	public static void radixSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {

	}

}