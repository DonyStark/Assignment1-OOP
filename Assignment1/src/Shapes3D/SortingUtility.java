package Shapes3D;

/**
 * A utility class that provides various sorting algorithms for arrays of 3D
 * shapes.
 */
public class SortingUtility {

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Bubble Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		// Bubble Sort algorithm implementation for objects that implement Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Bubble Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
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

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Insertion Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		// Insertion Sort algorithm implementation for objects that implement
		// Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Insertion Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
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

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Selection Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] array) {
		// Selection Sort algorithm implementation for objects that implement
		// Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Selection Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
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

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Merge Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] array) {
		// Merge Sort algorithm implementation for objects that implement Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Merge Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
	public static void mergeSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		mergeSortHelper(shapes, comparator, 0, shapes.length - 1);
	}

	/**
	 * Helper method for the Merge Sort algorithm to recursively divide and merge
	 * the array of 3D shapes.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 * @param left       The left index of the subarray.
	 * @param right      The right index of the subarray.
	 */
	private static void mergeSortHelper(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int left,
			// Merge Sort helper method to divide and merge the 3D shapes array.

			int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSortHelper(shapes, comparator, left, mid);
			mergeSortHelper(shapes, comparator, mid + 1, right);

			merge(shapes, comparator, left, mid, right);
		}
	}

	/**
	 * Merges two subarrays of 3D shapes during the Merge Sort algorithm.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 * @param left       The left index of the subarray.
	 * @param mid        The middle index of the subarray.
	 * @param right      The right index of the subarray.
	 */
	private static void merge(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int left, int mid,
			// Merge two subarrays of 3D shapes during Merge Sort.

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

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Quick Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void quickSort(T[] array) {
		// Quick Sort algorithm implementation for objects that implement Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Quick Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
	public static void quickSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		quickSortHelper(shapes, comparator, 0, shapes.length - 1);
	}

	/**
	 * Helper method for the Quick Sort algorithm to recursively partition and sort
	 * the array of 3D shapes.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 * @param low        The lowest index of the subarray.
	 * @param high       The highest index of the subarray.
	 */
	private static void quickSortHelper(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int low, int high) {
		// Quick Sort helper method to partition and sort the 3D shapes array.
		if (low < high) {
			int pivotIndex = partition(shapes, comparator, low, high);

			quickSortHelper(shapes, comparator, low, pivotIndex - 1);
			quickSortHelper(shapes, comparator, pivotIndex + 1, high);
		}
	}

	/**
	 * Partitions the array of 3D shapes during the Quick Sort algorithm.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 * @param low        The lowest index of the subarray.
	 * @param high       The highest index of the subarray.
	 * @return The index of the pivot element after partitioning.
	 */
	private static int partition(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator, int low, int high) {
		// Partition the 3D shapes array during Quick Sort and return the pivot index.
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

	/**
	 * Sorts an array of objects that implement the `Comparable` interface using the
	 * Heap Sort algorithm.
	 *
	 * @param <T>   The type of objects in the array.
	 * @param array An array of objects to be sorted.
	 */
	public static <T extends Comparable<T>> void heapSort(T[] array) {
		// Heap Sort algorithm implementation for objects that implement Comparable.
	}

	/**
	 * Sorts an array of 3D shapes using the Heap Sort algorithm with a custom
	 * comparator.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param comparator The comparator used to determine the sorting order.
	 */
	public static void heapSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
		int n = shapes.length;

		// Build a max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(shapes, n, i, comparator);
		}

		// Extract elements from the heap one by one
		for (int i = n - 1; i > 0; i--) {
			// Swap the root (maximum element) with the last element
			Shape3D temp = shapes[0];
			shapes[0] = shapes[i];
			shapes[i] = temp;

			// Call max heapify on the reduced heap
			heapify(shapes, i, 0, comparator);
		}
	}

	/**
	 * Heapifies a subarray of 3D shapes during the Heap Sort algorithm to maintain
	 * the max heap property.
	 *
	 * @param shapes     An array of 3D shapes to be sorted.
	 * @param n          The size of the subarray.
	 * @param root       The root index of the subarray.
	 * @param comparator The comparator used to determine the sorting order.
	 */
	private static void heapify(Shape3D[] shapes, int n, int root, java.util.Comparator<Shape3D> comparator) {
		// Heapify a subarray of 3D shapes to maintain the max heap property in Heap
		// Sort.
		int largest = root;
		int leftChild = 2 * root + 1;
		int rightChild = 2 * root + 2;

		if (leftChild < n && comparator.compare(shapes[leftChild], shapes[largest]) > 0) {
			largest = leftChild;
		}

		if (rightChild < n && comparator.compare(shapes[rightChild], shapes[largest]) > 0) {
			largest = rightChild;
		}

		if (largest != root) {
			// Swap the largest element with the root
			Shape3D temp = shapes[root];
			shapes[root] = shapes[largest];
			shapes[largest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(shapes, n, largest, comparator);
		}
	}
}
